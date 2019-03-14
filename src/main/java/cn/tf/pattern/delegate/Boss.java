package cn.tf.pattern.delegate;

public class Boss {

    public void command(String name,Leader leader){
        leader.doSomeing(name);
    }
}
