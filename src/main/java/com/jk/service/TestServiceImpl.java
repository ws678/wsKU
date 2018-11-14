package com.jk.service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.jayway.jsonpath.internal.filter.ValueNode.UndefinedNode;
import com.jk.dao.TestMapper;
import com.jk.model.Model;

import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

@Service("testService")
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestMapper testMapper;
	@Autowired MongoTemplate mongo;
	@Autowired
	private ShardedJedisPool jedis;
	
	@Override
	public List<LinkedHashMap<String, Object>> testCount(String name) {
		List<LinkedHashMap<String, Object>> findEmpl = testMapper.findEmpl();
		System.out.println(findEmpl.toString() );
		return findEmpl;
	}

	//
	@Override
	public List<Model> queryarea() {
		List<Model> list = testMapper.queryarea();
		return list;
	}

	//
	@Override
	public HashMap<String, Object> findgys(String gysname, String areaid, Integer pageSize, Integer start) {
		
		HashMap<String, Object> mmp = new HashMap<>();
		List<Model> list = null;
		Integer gg = null;
		if (gysname != null & gysname != "" & gysname.hashCode() != 0 & areaid != null & areaid != " " & areaid.hashCode() != 0) {
			list = testMapper.findgys(pageSize,start,gysname,areaid);
			gg = testMapper.findtotal(gysname,areaid);
		} else if(gysname != null & gysname != " " & gysname.hashCode() != 0 & areaid == null | areaid == " " | areaid.hashCode() == 0){

			list = testMapper.findgys1(pageSize,start,gysname);
			gg = testMapper.findtotal1(gysname);
			
		} else if(areaid != null & areaid != " " & areaid.hashCode() != 0 & gysname == null | gysname == " " | gysname.hashCode() == 0){
			
			list = testMapper.findgys2(pageSize,start,areaid);
			gg = testMapper.findtotal2(areaid);
			
		}else{
			
			list = testMapper.findgys3(pageSize,start);
			gg = testMapper.findtotal3();
		}

		mmp.put("rows", list);
		mmp.put("total", gg);
		return mmp;
	}

	//
	@Override
	public List<Model> queryareamongo() {

		Query query = new Query();
		List<Model> find = mongo.find(query, Model.class, "t_area");
		return find;
	}
	
	@Override
	public List addJedis() {
		HashMap<String, String> map = new HashMap<String, String>();
		ShardedJedis jediss= jedis.getResource();
		Long id = jediss.incr("areaSquce");
		map.put("areaid","1");
		map.put("areaname","中国");
		map.put("areaId",id+"");
		jediss.hmset("area"+id, map);
		jediss.lpush("areaId_list",id.toString());
		jediss.close();
		return null;
	}
	
}
