import model.Student;

public class Test {
    public static void main(String []args){
        Student student = new Student();
        student.setAge(18);
        student.setSex("女");
        student.setStuNo("001567");

        System.out.println("你的年龄为"+student.getAge()+"----"+"你的性别为:"+student.getSex()+"---"+"你的学号为："+student.getStuNo());
    }
}
