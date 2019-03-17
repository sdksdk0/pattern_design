package cn.tf.pattern.template.course;

public class NetworkCourseTest {

    public static void main(String[] args) {
        System.out.println("----java----");
        NetworkCourse javaCourse = new JavaCource();
        javaCourse.createCourse();
        System.out.println("----大数据可查----");
        NetworkCourse bigDataCourse = new BigDataCourse(true);
        bigDataCourse.createCourse();

    }
}
