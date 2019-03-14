package cn.tf.pattern.strategy.travel;

import com.baomidou.mybatisplus.plugins.Page;

import java.util.Map;

//有如下场景：有3中数据来源的详情查询（客流数据、舆情数据、画像数据），
// 这三种数据请求的参数都是相同的，如参数里面都是省、市、县、景区名称、开始时间、结束时间。
// 返回的数据也是相同的，都是分页返回一个map集合。然后前端通过type的不同分别查询不同的数据。
public interface ISourceStrategy {

    public Map<String,Object> selectSourceByPage(Page page, String province, String city, String county,
                                                 String name, String beginTime, String endTime);
}
