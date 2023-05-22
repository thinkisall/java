package 추상클래스의응용;

public class DefaultCar extends Car{


    @Override
    public void drive() {
        System.out.println("수동으로 운전함");
    }
    @Override
    public void stop() {
        System.out.println("수동으로 멈춤");
    }
    @Override
    public void wiper(){
        System.out.println("wiper");
    }
}
