package cn.tf.pattern.template.course;

public abstract  class NetworkCourse {

    protected  final void createCourse(){

        //1、发布预习资料
        this.postPreResouce();
        //2、制作PPT
        this.createPPT();
        //3、在线直播
        this.liveVideo();
        //4、提交课件、课堂笔记
        this.postNote();
        //5、提交源码
        this.postSource();
        //6、布置作业，有的有作业，有的没有
        if(needHomework()){
            checkHomework();
        }

    }

    abstract  void checkHomework();

    protected boolean  needHomework() {
        return false;
    }

    final void postSource() {
        System.out.println("提交源代码");
    }

    final void postNote() {
        System.out.println("提交课件、课堂笔记");
    }

    final void liveVideo() {
        System.out.println("在线直播");
    }

    final void createPPT() {
        System.out.println("创建备课的PPT");
    }

    final  void postPreResouce() {
        System.out.println("分发预习资料");
    }
}
