package cn.tf.pattern.template.course;

public class BigDataCourse extends NetworkCourse {

    private boolean needHomeworkFlag = false;

    public BigDataCourse(boolean needHomeworkFlag) {
        this.needHomeworkFlag=needHomeworkFlag;
    }

    void checkHomework() {
        System.out.println("检查大数据的作业");
    }

    @Override
    protected boolean needHomework() {
        return this.needHomeworkFlag;
    }
}
