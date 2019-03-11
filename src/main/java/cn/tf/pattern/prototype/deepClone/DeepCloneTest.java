package cn.tf.pattern.prototype.deepClone;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DeepCloneTest {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<Person>();
        Person p = new Person();
        p.setName("张三");
        p.setUid("190301109");
        personList.add(p);

        //深克隆
        List<Person> personListClone = depCopy(personList);

        System.out.println("克隆对象中的引用类型地址值：" + personListClone);
        System.out.println("原对象中的引用类型地址值：" + personList);
        System.out.println("对象地址比较："+(personListClone.get(0).getName() == personList.get(0).getName()));


        //改变原List的值，看会不会影响到克隆后的List的值
        //将原List中的name为张三的修改为李四
        personList.get(0).setName("李四");
        System.out.println("克隆对象中的引用类型地址值：" + personListClone.get(0).getName());
        System.out.println("原对象中的引用类型地址值：" + personList.get(0).getName());

        /*
        结果如下：
                克隆对象中的引用类型地址值：[cn.tf.pattern.prototype.deepClone.Person@2f4d3709]
                原对象中的引用类型地址值：[cn.tf.pattern.prototype.deepClone.Person@511d50c0]
                对象地址比较：false
                克隆对象中的引用类型地址值：张三
                原对象中的引用类型地址值：李四
        */

        //从结果我们可以看出当改变原List的值时，并不会影响到深克隆之后的List，因为经过深克隆之后，并不会影响到新生成的List


    }
    /***
     * 对集合进行深拷贝 注意需要对泛型类进行序列化(实现Serializable)
     *
     * @param srcList
     * @param <T>
     * @return
     */
    public static <T> List<T> depCopy(List<T> srcList) {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        try {
            ObjectOutputStream out = new ObjectOutputStream(byteOut);
            out.writeObject(srcList);

            ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
            ObjectInputStream inStream = new ObjectInputStream(byteIn);
            List<T> destList = (List<T>) inStream.readObject();
            return destList;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
