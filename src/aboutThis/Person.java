package aboutThis;

public class Person {

    String name;
    int age;

    public Person() {
        this("No name", 1); // this.name = "No name" this.age = 1
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println(name + "," + age);
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.showPerson();

        Person p2 = new Person("Kim", 30);
        p2.showPerson();
    }
    
}
