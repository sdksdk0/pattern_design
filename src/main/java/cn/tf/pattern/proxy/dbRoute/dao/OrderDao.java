package cn.tf.pattern.proxy.dbRoute.dao;


import cn.tf.pattern.proxy.dbRoute.bean.Order;

public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao创建Order成功!");
        return 1;
    }
}
