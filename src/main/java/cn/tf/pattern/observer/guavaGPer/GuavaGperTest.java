package cn.tf.pattern.observer.guavaGPer;

import com.google.common.eventbus.EventBus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuavaGperTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        Teacher teacher = new Teacher();
        eventBus.register(teacher);

        Map<String,Object> map = new HashMap<String,Object>();
        List<String> teacherList = new ArrayList<String>();
        teacherList.add("王老师");
        teacherList.add("李老师");
        teacherList.add("何老师");


        map.put("teacher",teacherList);
        map.put("student","小明");
        map.put("question","观察者模式适用于哪些场景？");
        eventBus.post(map);

    }
}
