package hhh;
import java.util.HashMap;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;
public class TestMongodb {
	
	@Autowired
	private ShardedJedisPool jedis;
	
	@Test
	public void addJedis(){
		HashMap<String, String> map = new HashMap<String, String>();
		ShardedJedis jediss= jedis.getResource();
		Long id = jediss.incr("areaSquce");
		map.put("areaid","1");
		map.put("areaname","中国");
		map.put("areaId",id+"");
		jediss.hmset("area"+id, map);
		jediss.lpush("areaId_list",id.toString());
		jediss.close();
	}
	
}
