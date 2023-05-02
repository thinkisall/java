package twoconstructor;

public class Human {
    int height;
    int weight;
    int age;
    String sex;
    String name;



    public void showInfo(int height, int weight, int age, String sex, String name) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.sex = sex;
        this.name = name;

        System.out.println("키 : "+ height);
        System.out.println("몸무게 :"+weight);
        System.out.println("나이 :"+ age);
        System.out.println("성별 :"+sex);
        System.out.println("이름 :"+name);
    }

}
