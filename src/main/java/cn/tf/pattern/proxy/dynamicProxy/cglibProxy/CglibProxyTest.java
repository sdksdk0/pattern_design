package cn.tf.pattern.proxy.dynamicProxy.cglibProxy;

import net.sf.cglib.core.DebuggingClassWriter;

public class CglibProxyTest {

    public static void main(String[] args) {

        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,System.getProperty("user.dir")+"/cglib_proxy_classes");

        Son obj = null;
        try {
            obj = (Son) new CglibMeipo().getInstance(Son.class);
            System.out.println(obj);
            obj.findLove();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
