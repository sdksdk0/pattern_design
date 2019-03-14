package cn.tf.pattern.strategy.travel.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import cn.tf.pattern.strategy.travel.ISourceStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.baomidou.mybatisplus.plugins.Page;

//这里不详情写各个类
@Component("drawSourceDetail")
public class DrawSourceDetail implements ISourceStrategy {

	
	@Override
	public Map<String, Object> selectSourceByPage(Page page, String province, String city, String county, String name,
			String beginTime, String endTime) {
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();

		//画像数据查询
		//-----------此次省略业务代码-----------


		Map<String,Object> pageMap = new HashMap<String,Object>();
		pageMap.put("page", page);
		pageMap.put("comList",list);
		return pageMap;
	}

}
