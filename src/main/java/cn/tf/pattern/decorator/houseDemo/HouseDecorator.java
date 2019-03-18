package cn.tf.pattern.decorator.houseDemo;

public class HouseDecorator extends House {

    private House house;

    public HouseDecorator(House house) {
        this.house = house;
    }

    @Override
    protected String getMsg() {
        return this.house.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.house.getPrice();
    }
}
