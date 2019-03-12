package cn.tf.pattern.proxy.dynamicProxy.jdkProxy;

import cn.tf.pattern.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class JDKProxyTest {

    public static void main(String[] args) {
        Person obj = (Person)new JDKMeipo().getInstance(new Son());
        obj.findLove();


        try {
            //通过反编译工具可以查看源代码
            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            FileOutputStream os = null;

            os = new FileOutputStream(System.getProperty("user.dir")+"/$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
