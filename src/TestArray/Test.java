package TestArray;

public class Test {
    public static void main(String[] args) {

        Student student = new Student("김상현", 123);

        student.addSubject("math",100);
        student.addSubject("english",90);
        student.addSubject("korean",80);

        student.showInfo();

        System.out.println(student.getName());
        System.out.println(student.getStudentID());
        
    }
}
