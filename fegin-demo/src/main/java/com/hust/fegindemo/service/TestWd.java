package com.hust.fegindemo.service;

import java.util.List;



import com.hust.fegindemo.entity.WdsStRsvrREntity;
import com.hust.fegindemo.vo.WdsStRsvrRParmVO;

/**
* @Description 
* @since  2018年10月27日 上午9:16:48
* @author LiuLiBin
*/

public interface TestWd {
	List<WdsStRsvrREntity>  listByIdAndTime (WdsStRsvrRParmVO ws);
}
