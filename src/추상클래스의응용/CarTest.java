package 추상클래스의응용;

public class CarTest {
    public static void main(String[] args) {
        Car aiCar = new Aicar();
        aiCar.run();

        Car myCar = new DefaultCar();
        myCar.run();
    }
}
