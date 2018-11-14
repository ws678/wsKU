package com.jk.service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import com.jk.model.Model;

public interface TestService {
	
	List<LinkedHashMap<String, Object>> testCount(String name);

	/** <pre>queryarea(这里用一句话描述这个方法的作用)   
	 * 创建人：王硕 3190552680@qq.com     
	 * 创建时间：2018年11月13日 下午8:11:33    
	 * 修改人：王硕 3190552680@qq.com     
	 * 修改时间：2018年11月13日 下午8:11:33    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List<Model> queryarea();

	/** <pre>findgys(这里用一句话描述这个方法的作用)   
	 * 创建人：王硕 3190552680@qq.com     
	 * 创建时间：2018年11月13日 下午9:11:16    
	 * 修改人：王硕 3190552680@qq.com     
	 * 修改时间：2018年11月13日 下午9:11:16    
	 * 修改备注： 
	 * @param gysname
	 * @param areaid
	 * @param pageSize
	 * @param start
	 * @return</pre>    
	 */
	HashMap<String, Object> findgys(String gysname, String areaid, Integer pageSize, Integer start);

	/** <pre>queryareamongo(这里用一句话描述这个方法的作用)   
	 * 创建人：王硕 3190552680@qq.com     
	 * 创建时间：2018年11月14日 上午12:23:01    
	 * 修改人：王硕 3190552680@qq.com     
	 * 修改时间：2018年11月14日 上午12:23:01    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List<Model> queryareamongo();

	/** <pre>addJedis(这里用一句话描述这个方法的作用)   
	 * 创建人：王硕 3190552680@qq.com     
	 * 创建时间：2018年11月14日 上午11:32:08    
	 * 修改人：王硕 3190552680@qq.com     
	 * 修改时间：2018年11月14日 上午11:32:08    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List addJedis();
	
}
