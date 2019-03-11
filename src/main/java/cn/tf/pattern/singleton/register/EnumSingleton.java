package cn.tf.pattern.singleton.register;

//可以在常量池中使用
public enum EnumSingleton {

    INSTANCE;
    private Object data;
    public Object getData(){
        return data;
    }
    public void setData(Object data){
        this.data = data;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

}
