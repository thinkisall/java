package createMemberVariable;

public class SubjectTest {
    public static void main(String[] args) {
        
        Student studentLee = new Student(100, "Lee");
        studentLee.setKoreaSubject("Korean", 100);
        studentLee.setMathSubject("Math", 99);
        
        Student studentKim = new Student(101, "Kim");
        studentKim.setKoreaSubject("Korean", 80);
        studentKim.setMathSubject("Math", 96);
        
        studentLee.showStudentScore();
        studentKim.showStudentScore();
    }
}
