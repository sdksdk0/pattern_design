package cn.tf.pattern.decorator.houseDemo;

//增加一些家具
public class FurnitureDecoretor extends HouseDecorator{


    public FurnitureDecoretor(House house) {
        super(house);
    }

    @Override
    protected String getMsg() {
        return super.getMsg()+"增加了家具";
    }

    @Override
    protected int getPrice() {
        //家具增加20万
        return super.getPrice()+200000;
    }
}
