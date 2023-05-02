package twoconstructor;

public class Student {
    public int studentNumber;
    public String studentName;
    public int grade;

    // default constructor
    public Student(){
        this.studentNumber = 300;
        this.studentName = "Lee";
        this.grade = 2;
    }

    public Student(int studentNumber, String studentName, int grade){
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo(){
        return studentName + "학생의 학번은" + studentNumber + "이고," + grade + "학년 입니다.";
    }

    public static void main(String[] args) {
        Student st = new Student(123,"kim",1);
        System.out.println(st.showStudentInfo());
        Student st2 = new Student();
        System.out.println(st2.showStudentInfo());
    }

}
