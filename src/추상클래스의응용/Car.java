package 추상클래스의응용;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public abstract void wiper();

    public void startCar() {
        System.out.println("Start Car");
    }

    public void turnOff() {
        System.out.println("Turn Off");
    }

    public void washCar() {};

    final public void run() {
        startCar();
        drive();
        stop();
        wiper();
        washCar();
        turnOff();

    }



}
