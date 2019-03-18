package cn.tf.pattern.observer.gper;

public class ObserverTest {

    public static void main(String[] args) {
        Gper gper = Gper.getInstance();
        Teacher wang = new Teacher("王老师");
        Teacher li = new Teacher("李老师");
        gper.addObserver(wang);
        gper.addObserver(li);

        //业务逻辑代码
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者模式适用于哪些场景？");
        gper.publishQuestion(question);



    }


}
