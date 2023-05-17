package TestArray;

import java.util.ArrayList;

public class Student {
    private String name;
    private int studentID;
    ArrayList<Subject> subjectList;
    
    public Student(){}

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
        subjectList = new ArrayList<Subject>();
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void addSubject(String name, int scorePoint) {
        Subject subject = new Subject();

        subject.setName(name);
        subject.setScorePoint(scorePoint);

        subjectList.add(subject);
    }

    public void showInfo(){
        int total = 0;

        for(Subject subject : subjectList){
            total += subject.getScorePoint();
            System.out.println(name+"의"+subject.getName()+"과목의 성적은"+subject.getScorePoint()+"입니다.");
        }
        System.out.println(name +"의 총점은 " + total + "점입니다.");
    }
    

}
