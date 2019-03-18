package cn.tf.pattern.decorator.houseDemo;

public class BaseHouse extends House {
    @Override
    protected String getMsg() {
        return "毛坯";
    }

    @Override
    protected int getPrice() {
        //毛坯房子价格100万
        return 1000000;
    }
}
