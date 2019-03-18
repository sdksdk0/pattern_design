package cn.tf.pattern.decorator.houseDemo;

public class HouseTest {

    public static void main(String[] args) {
        House house;
        //先买一个毛坯房子
        house = new BaseHouse();
        System.out.println(house.getMsg()+",总价:"+house.getPrice());
        //将房子粉刷一遍
        house = new BurshDecorator(house);
        System.out.println(house.getMsg()+",总价:"+house.getPrice());
        //添加点家具
        house = new FurnitureDecoretor(house);
        System.out.println(house.getMsg()+",总价:"+house.getPrice());

    }
}
