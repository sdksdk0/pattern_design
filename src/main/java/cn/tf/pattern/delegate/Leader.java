package cn.tf.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEmployee {


    private Map<String,IEmployee> targets = new HashMap<String, IEmployee>();

    public Leader(){
        targets.put("后端",new EmployeeA());
        targets.put("前端",new EmployeeB());
    }

    @Override
    public void doSomeing(String name) {
        targets.get(name).doSomeing(name);
    }
}
