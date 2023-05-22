package 추상클래스;

public abstract class Computer {

    abstract void display();
    abstract void typing();

//    공통으로 사용할 메서드들만 작성
    public void turnOn() {
        System.out.println("전원을 켭니다");
    };

    public void turnOff() {
        System.out.println("전원을 끕니다");
    };


}
