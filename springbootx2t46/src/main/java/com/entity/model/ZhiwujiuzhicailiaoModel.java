package com.entity.model;

import com.entity.ZhiwujiuzhicailiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 植物救治材料
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-12 20:04:08
 */
public class ZhiwujiuzhicailiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 材料名称
	 */
	
	private String cailiaomingcheng;
		
	/**
	 * 材料类目
	 */
	
	private String cailiaoleimu;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：材料名称
	 */
	 
	public void setCailiaomingcheng(String cailiaomingcheng) {
		this.cailiaomingcheng = cailiaomingcheng;
	}
	
	/**
	 * 获取：材料名称
	 */
	public String getCailiaomingcheng() {
		return cailiaomingcheng;
	}
				
	
	/**
	 * 设置：材料类目
	 */
	 
	public void setCailiaoleimu(String cailiaoleimu) {
		this.cailiaoleimu = cailiaoleimu;
	}
	
	/**
	 * 获取：材料类目
	 */
	public String getCailiaoleimu() {
		return cailiaoleimu;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
