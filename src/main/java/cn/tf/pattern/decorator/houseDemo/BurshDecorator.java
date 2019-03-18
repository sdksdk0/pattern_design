package cn.tf.pattern.decorator.houseDemo;

//将毛坯的房子进行粉刷
public class BurshDecorator extends HouseDecorator{


    public BurshDecorator(House house) {
        super(house);
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"进行了粉刷操作";
    }

    @Override
    protected int getPrice() {
        //粉刷价格加10万
        return super.getPrice()+100000;
    }
}
