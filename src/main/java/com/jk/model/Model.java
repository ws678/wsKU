/** 
 * <pre>项目名称:spring-mvc-con 
 * 文件名称:Model.java 
 * 包名:com.jk.model 
 * 创建日期:2018年11月13日下午8:06:21 
 * Copyright (c) 2018, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model;

import java.io.Serializable;

/** 
 * <pre>项目名称：spring-mvc-con    
 * 类名称：Model    
 * 类描述：    
 * 创建人：王硕 3190552680@qq.com    
 * 创建时间：2018年11月13日 下午8:06:21    
 * 修改人：王硕 3190552680@qq.com  
 * 修改时间：2018年11月13日 下午8:06:21    
 * 修改备注：       
 * @version </pre>    
 */
public class Model implements Serializable{

	private static final long serialVersionUID = 7378216428474539041L;
	private String gysid;
	private String gysname;
	private String gysareaid;
	private String areaid;
	private String areaname;

	public String getGysid() {
		return gysid;
	}
	public void setGysid(String gysid) {
		this.gysid = gysid;
	}
	public String getGysareaid() {
		return gysareaid;
	}
	public void setGysareaid(String gysareaid) {
		this.gysareaid = gysareaid;
	}
	public String getAreaid() {
		return areaid;
	}
	public void setAreaid(String areaid) {
		this.areaid = areaid;
	}
	public String getGysname() {
		return gysname;
	}
	public void setGysname(String gysname) {
		this.gysname = gysname;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	
}
