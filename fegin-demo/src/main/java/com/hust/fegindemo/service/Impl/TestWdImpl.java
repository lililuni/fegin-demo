package com.hust.fegindemo.service.Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hust.fegindemo.config.DataClient;
import com.hust.fegindemo.entity.WdsStRsvrREntity;
import com.hust.fegindemo.service.TestWd;
import com.hust.fegindemo.vo.WdsStRsvrRParmVO;

/**
* @Description 
* @since  2018年10月27日 上午8:57:51
* @author LiuLiBin
*/
@Service
public class TestWdImpl implements TestWd {
	
	//注入Fegin对象
	@Autowired
	private  DataClient dataClient;
	
	
	//读取数据
	public List<WdsStRsvrREntity>  listByIdAndTime (WdsStRsvrRParmVO ws)  {
		return dataClient.listByIdAndTime(ws);
	}
}
