package cn.tf.pattern.delegate;

public class DelegateTest {

    public static void main(String[] args) {
        new Boss().command("前端",new Leader());
    }
}
