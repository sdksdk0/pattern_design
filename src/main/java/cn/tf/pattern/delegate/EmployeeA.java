package cn.tf.pattern.delegate;

public class EmployeeA implements IEmployee {
    @Override
    public void doSomeing(String name) {
        System.out.println("后端开发");
    }
}
