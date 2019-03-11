package cn.tf.pattern.factory.simple;

import cn.tf.pattern.factory.GeLi;
import cn.tf.pattern.factory.HaiEr;
import cn.tf.pattern.factory.IAirCondition;
import cn.tf.pattern.factory.MiDea;

public class AirConditionFactory {

    //直接通过if来创建
    /*public static IAirCondition getName(String name){
        if("GeLi".equals(name)){
            return new GeLi();
        }else if("MiDea".equals(name)){
            return new MiDea();
        }else if("HaiEr".equals(name)){
            return new HaiEr();
        }else{
            return null;
        }
    }*/

    //通过反射的方式来创建
    public IAirCondition create(Class<? extends  IAirCondition> clazz){
            try {
                if (null != clazz) {
                    return clazz.newInstance();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            return null;
    }


}
