package 추상클래스의응용;

public class Aicar extends Car{

    public void drive() {
        System.out.println("차 자동으로 운전중");
    }

    public void stop() {
        System.out.println("차 자동으로 멈춤");
    }

    public void wiper(){
        System.out.println("와이퍼작동");
    }

    public void washCar(){
        System.out.println("세차함");
    };
}
