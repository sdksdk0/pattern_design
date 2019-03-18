package cn.tf.pattern.observer.guavaGPer;

import com.google.common.eventbus.Subscribe;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Teacher {

    @Subscribe
    public void subscribe(Object arg){
        Map<String, Object> map = (Map<String, Object>) arg;
        List<String> teacherList = (List<String>) map.get("teacher");
        String student = (String) map.get("student");
        String question = (String) map.get("question");

        teacherList.forEach(new Consumer<String>() {
            @Override
            public void accept(String t) {
                System.out.println("***************************************");
                System.out.println(t + "老师，你好！\n" +
                        "您收到了一个来自社区的提问，希望您解答，问题内容如下：\n" +
                        question + "\n" +"提问者：" + student);
            }
        });


    }

}
