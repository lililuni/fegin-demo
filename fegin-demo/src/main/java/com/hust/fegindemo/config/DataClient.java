package com.hust.fegindemo.config;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hust.fegindemo.entity.WdsStRsvrREntity;
import com.hust.fegindemo.vo.WdsStRsvrRParmVO;



//这里不用改
@FeignClient(name ="data") 
public interface DataClient {
	
	//双引号里对应上图的path
	@PostMapping("/wdsstrsvrr/listByIdAndTime") 
	//WdsStRsvrRParmVO 对应上图的 input
	public List<WdsStRsvrREntity> listByIdAndTime(@RequestBody WdsStRsvrRParmVO  wdsStRsvrRParmVO);
}
