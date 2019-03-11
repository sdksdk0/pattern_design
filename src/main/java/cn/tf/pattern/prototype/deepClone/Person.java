package cn.tf.pattern.prototype.deepClone;

import java.io.Serializable;

public class Person implements Serializable {

    String name;  //名字
    String uid; //id

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
