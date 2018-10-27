package com.hust.fegindemo.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
* @Description 
* @since  2018年10月26日 下午4:16:18
* @author LiuLiBin
*/
@Data
public class WdsStRsvrRParmVO {
	
	private String id;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date starttime;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date endtime;

	public WdsStRsvrRParmVO(String id, Date starttime, Date endtime) {
		
		this.id = id;
		this.starttime = starttime;
		this.endtime = endtime;
	}

	public WdsStRsvrRParmVO() {
		
	}
	
	
}
