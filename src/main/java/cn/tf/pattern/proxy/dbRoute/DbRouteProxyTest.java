package cn.tf.pattern.proxy.dbRoute;

import cn.tf.pattern.proxy.dbRoute.bean.Order;
import cn.tf.pattern.proxy.dbRoute.proxy.OrderServiceDynamicProxy;
import cn.tf.pattern.proxy.dbRoute.proxy.OrderServiceStaticProxy;
import cn.tf.pattern.proxy.dbRoute.service.IOrderService;
import cn.tf.pattern.proxy.dbRoute.service.impl.OrderService;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DbRouteProxyTest {
    public static void main(String[] args) {
        try {
            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2019/02/01");
            order.setCreateTime(date.getTime());

            //静态代理的方式
           // IOrderService orderService = (IOrderService)new OrderServiceStaticProxy(new OrderService());
            //动态代理的方式
            IOrderService orderService = (IOrderService)new OrderServiceDynamicProxy().getInstance(new OrderService());

            orderService.createOrder(order);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
