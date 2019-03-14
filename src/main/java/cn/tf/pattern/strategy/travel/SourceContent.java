package cn.tf.pattern.strategy.travel;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.plugins.Page;

/**
 * 策略模式
 *
 */
@Service
public class SourceContent {
	
	private Map<String, ISourceStrategy> strategyMap = new ConcurrentHashMap<String, ISourceStrategy>();
   /**
     * 注入了Strategy接口的Bean
     * @param strategyMap
     */
    @Autowired
    public SourceContent(Map<String, ISourceStrategy> strategyMap) {
        this.strategyMap.clear();
        for (Map.Entry<String, ISourceStrategy> entry : strategyMap.entrySet()) {
        	this.strategyMap.put(entry.getKey(), entry.getValue());
        }   
    }
	 
   public Map<String,Object> selectSourceByPage(String type,Page page, String province, String city, String county,
			String name, String beginTime, String endTime){
	   return strategyMap.get(type).selectSourceByPage(page, province, city, county, name, beginTime, endTime);
   }

}
