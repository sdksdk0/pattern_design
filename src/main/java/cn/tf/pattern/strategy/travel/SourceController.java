package cn.tf.pattern.strategy.travel;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.plugins.Page;



/**
 * 数据来源接口
 * @author lenovo
 *
 */
@RestController
@RequestMapping("/source")
public class SourceController  {
	
	private Logger log =  org.slf4j.LoggerFactory.getLogger(SourceController.class);
	

	 @Autowired
	 private SourceContent sourceContent;
	 
	 
	 /**
		 * 数据来源详情查询
		 * @param province  省
		 * @param city  市
		 * @param county 区县
		 * @param name   景区名称
		 * @param beginTime  开始时间
		 * @param endTime  结束时间
		 * @param pageId  第几页
		 * @param limit  每页数量
		 * @param type  查询类型,probeSourceDetail：客流数据 commentSourceDetail：舆情数据  drawSourceDetail： 画像数据
		 * @return
		 */
		@RequestMapping("/sourceDetailStrategy")
		public Object commDetailStrategy(String province,String city,String county,String name,String beginTime,String endTime,
				String type,Integer pageId,Integer limit){

			if (limit==null || limit==0) {
				limit = 20;
			}
			int offset = 0;
			if(pageId != null){
				pageId=pageId<1?1:pageId;
			}else {
				pageId = 1;
			}
			offset = (pageId-1)*limit;
			Page page = new Page<>((offset / limit + 1), limit);
			//此处采用了策略模式
			return responseSuccess(sourceContent.selectSourceByPage(type, page, province, city, county, name, beginTime, endTime));

		}

	protected Map<String, Object> responseSuccess(Object obj) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "200");
		map.put("message","获取成功");
		if(obj instanceof Map){
			map.put("size", ((Map)obj).size());
		}
		if(obj instanceof List){
			map.put("size", ((List)obj).size());
		}
		map.put("data", obj);
		return map;
	}


}
