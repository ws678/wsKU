package com.jk.dao;

import java.util.LinkedHashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.jk.model.Model;

@Mapper
public interface TestMapper {
	
	@ResultType(java.util.LinkedHashMap.class)
	@Select(value="select  *   from  hrm_employee")
	List<LinkedHashMap<String, Object>> findEmpl();

	/** <pre>queryarea(这里用一句话描述这个方法的作用)   
	 * 创建人：王硕 3190552680@qq.com     
	 * 创建时间：2018年11月13日 下午8:12:43    
	 * 修改人：王硕 3190552680@qq.com     
	 * 修改时间：2018年11月13日 下午8:12:43    
	 * 修改备注： 
	 * @return</pre>    
	 */
	@ResultType(Model.class)
	@Select(value = "select * from t_area")
	List<Model> queryarea();

	/** <pre>findtotal(这里用一句话描述这个方法的作用)   
	 * 创建人：王硕 3190552680@qq.com     
	 * 创建时间：2018年11月13日 下午9:16:58    
	 * 修改人：王硕 3190552680@qq.com     
	 * 修改时间：2018年11月13日 下午9:16:58    
	 * 修改备注： 
	 * @param gysname
	 * @param areaid
	 * @return</pre>    
	 */
	@ResultType(Integer.class)
	@Select(value = " select count(*) from t_gys t1,t_area t2 "
			+ " where t1.gysareaid = t2.areaid"
			+ " and t1.gysname like '%${gysname}%' and t2.areaid = #{areaid}")
	Integer findtotal(@Param("gysname")String gysname, @Param("areaid")String areaid);

	/** <pre>findgys(这里用一句话描述这个方法的作用)   
	 * 创建人：王硕 3190552680@qq.com     
	 * 创建时间：2018年11月13日 下午9:21:44    
	 * 修改人：王硕 3190552680@qq.com     
	 * 修改时间：2018年11月13日 下午9:21:44    
	 * 修改备注： 
	 * @param pageSize
	 * @param start
	 * @param gysname
	 * @param areaid
	 * @return</pre>    
	 */
	@ResultType(Model.class)
	@Select(value = "select * from t_gys t1,t_area t2 "
			+ " where t1.gysareaid = t2.areaid"
			+ " and t1.gysname like '%${gysname}%' "
			+ " and t2.areaid = #{areaid} limit ${start},${pageSize}")
	List<Model> findgys(@Param("pageSize")Integer pageSize, @Param("start")Integer start, @Param("gysname")String gysname, @Param("areaid")String areaid);

	/** <pre>findgys1(这里用一句话描述这个方法的作用)   
	 * 创建人：王硕 3190552680@qq.com     
	 * 创建时间：2018年11月13日 下午9:48:56    
	 * 修改人：王硕 3190552680@qq.com     
	 * 修改时间：2018年11月13日 下午9:48:56    
	 * 修改备注： 
	 * @param pageSize
	 * @param start
	 * @param gysname
	 * @return</pre>    
	 */
	@ResultType(Model.class)
	@Select(value = "select * from t_gys t1,t_area t2 "
			+ " where t1.gysareaid = t2.areaid"
			+ " and t1.gysname like '%${gysname}%' "
			+ " limit ${start},${pageSize}")
	List<Model> findgys1(@Param("pageSize")Integer pageSize, @Param("start")Integer start, @Param("gysname")String gysname);

	/** <pre>findtotal1(这里用一句话描述这个方法的作用)   
	 * 创建人：王硕 3190552680@qq.com     
	 * 创建时间：2018年11月13日 下午9:49:01    
	 * 修改人：王硕 3190552680@qq.com     
	 * 修改时间：2018年11月13日 下午9:49:01    
	 * 修改备注： 
	 * @param gysname
	 * @return</pre>    
	 */
	@ResultType(Integer.class)
	@Select(value = "select count(*) from t_gys t1,t_area t2 "
			+ " where t1.gysareaid = t2.areaid"
			+ " and t1.gysname like '%${gysname}%'")
	Integer findtotal1(@Param("gysname")String gysname);

	/** <pre>findgys2(这里用一句话描述这个方法的作用)   
	 * 创建人：王硕 3190552680@qq.com     
	 * 创建时间：2018年11月13日 下午9:49:48    
	 * 修改人：王硕 3190552680@qq.com     
	 * 修改时间：2018年11月13日 下午9:49:48    
	 * 修改备注： 
	 * @param pageSize
	 * @param start
	 * @param areaid
	 * @return</pre>    
	 */
	@ResultType(Model.class)
	@Select(value = "select * from t_gys t1,t_area t2 "
			+ " where t1.gysareaid = t2.areaid"
			+ " and t2.areaid = #{areaid} "
			+ " limit ${start},${pageSize}")
	List<Model> findgys2(@Param("pageSize")Integer pageSize, @Param("start")Integer start, @Param("areaid")String areaid);

	/** <pre>findtotal2(这里用一句话描述这个方法的作用)   
	 * 创建人：王硕 3190552680@qq.com     
	 * 创建时间：2018年11月13日 下午9:49:51    
	 * 修改人：王硕 3190552680@qq.com     
	 * 修改时间：2018年11月13日 下午9:49:51    
	 * 修改备注： 
	 * @param areaid
	 * @return</pre>    
	 */
	@ResultType(Integer.class)
	@Select(value = "select count(*) from t_gys t1,t_area t2 "
			+ " where t1.gysareaid = t2.areaid"
			+ " and t2.areaid = #{areaid} ")
	Integer findtotal2(@Param("areaid")String areaid);

	/** <pre>findtotal3(这里用一句话描述这个方法的作用)   
	 * 创建人：王硕 3190552680@qq.com     
	 * 创建时间：2018年11月13日 下午9:49:54    
	 * 修改人：王硕 3190552680@qq.com     
	 * 修改时间：2018年11月13日 下午9:49:54    
	 * 修改备注： 
	 * @return</pre>    
	 */
	@ResultType(Integer.class)
	@Select(value = "select count(*) from t_gys t1,t_area t2 "
			+ "where t1.gysareaid = t2.areaid")
	Integer findtotal3();

	/** <pre>findgys3(这里用一句话描述这个方法的作用)   
	 * 创建人：王硕 3190552680@qq.com     
	 * 创建时间：2018年11月13日 下午9:49:57    
	 * 修改人：王硕 3190552680@qq.com     
	 * 修改时间：2018年11月13日 下午9:49:57    
	 * 修改备注： 
	 * @param pageSize
	 * @param start
	 * @return</pre>    
	 */
	@ResultType(Model.class)
	@Select(value = "select * from t_gys t1,t_area t2 "
			+ "where t1.gysareaid = t2.areaid"
			+ " limit ${start},${pageSize}")
	List<Model> findgys3(@Param("pageSize")Integer pageSize, @Param("start")Integer start);
	
	
}
