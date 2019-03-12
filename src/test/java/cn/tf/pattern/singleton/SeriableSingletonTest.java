package cn.tf.pattern.singleton;

import cn.tf.pattern.singleton.seriable.SeriableSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


//反序列化时导致单例破坏
public class SeriableSingletonTest {

    public static void main(String[] args) {
        SeriableSingleton s1=null;
        SeriableSingleton s2 = SeriableSingleton.getInstance();

        FileOutputStream fos = null;
        try{
            //将对象序列化然后写入到磁盘，下次使用时再从磁盘中读取到对象，反序列化转化为内存对象。
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(s2);
            os.flush();
            os.close();

            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream is = new ObjectInputStream(fis);
            s1 = (SeriableSingleton) is.readObject();
            is.close();

            //反序列化后的对象会重新分配内存，
            //即重新创建。那如果序列化的目标的对象为单例对象，就违背了单例模式的初衷，相当
            //于破坏了单例

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1==s2);

            //运行结果，可以看出，反序列化后的对象和手动创建的对象是不一致的，实例化了两次
           /* cn.tf.pattern.singleton.seriable.SeriableSingleton@7b23ec81
            cn.tf.pattern.singleton.seriable.SeriableSingleton@6e0be858
            false*/


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
