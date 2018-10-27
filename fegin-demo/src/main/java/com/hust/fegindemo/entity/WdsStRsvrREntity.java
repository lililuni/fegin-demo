package com.hust.fegindemo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Setter;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Describe WdsStRsvrR的实体类
 * @author LiuLiBin
 * @email 970985518@qq.com
 * @date 2018-10-26 16:03:34
 */
@Data  
@Entity
@Table(name="WDS_ST_RSVR_R")
public class WdsStRsvrREntity  {
	
	/**
	 * 测站编码
	 */
	@Id
	private String stcdt;
	
	/**
	 * 年月日时分
	 */
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date ymdhm;
	/**
	 * 库内水位
	 */
	private Double zi;
	/**
	 * 入库流量
	 */
	private Double qi;
	/**
	 * 蓄水量
	 */
	private Double v;
	/**
	 * 库水特征
	 */
	private String zichar;
	/**
	 * 库水水势
	 */
	private String zitend;
	/**
	 * 测流方法
	 */
	private String qmes;
	/**
	 * 出库流量
	 */
	private Double otq;


}
