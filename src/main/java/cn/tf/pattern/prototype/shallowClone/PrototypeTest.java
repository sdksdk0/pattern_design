package cn.tf.pattern.prototype.shallowClone;

import java.util.ArrayList;
import java.util.List;

/**
 * 浅克隆测试
 */
public class PrototypeTest {

    public static void main(String[] args) {

        // 创建一个具体的需要克隆的对象
        ProbeData probeData = new ProbeData();
        probeData.setInTime("20190311000000");
        probeData.setOutTime("20190311120000");
        probeData.setProbMac("ED46NB78IO");
        probeData.setDevcMac("A2:V9:5T:9F:3E");
        System.out.println(probeData);

        // 创建AOrbit对象，准备开始克隆
        AOrbit aOrbit = new AOrbit(probeData);
        ProbeData probeDataClone = (ProbeData) aOrbit.startClone(probeData);
        System.out.println(probeDataClone);

        System.out.println("克隆对象中的引用类型地址值：" + probeDataClone.getProbMac());
        System.out.println("原对象中的引用类型地址值：" + probeData.getProbMac());
        System.out.println("对象地址比较："+(probeDataClone.getProbMac() == probeData.getProbMac()));
       //结果
        /*ProbeData{id='null', probMac='ED46NB78IO', devcMac='A2:V9:5T:9F:3E', inTime='20190311000000', outTime='20190311120000', code='null'}
        ProbeData{id='null', probMac='ED46NB78IO', devcMac='A2:V9:5T:9F:3E', inTime='20190311000000', outTime='20190311120000', code='null'}
        克隆对象中的引用类型地址值：ED46NB78IO
        原对象中的引用类型地址值：ED46NB78IO
        对象地址比较：true*/

        //说明：浅克隆只是创建新的一个引用的地址，存放最初创建对象的真实地址
        

    }
}
