package cn.tf.pattern.delegate;

public class EmployeeB implements IEmployee {
    @Override
    public void doSomeing(String name) {
        System.out.println("前端开发");
    }
}
