package staticMethod;

public class Car {
    private String name;
    private int carNumber;

    public Car(String name, int carNumber) {
        this.name = name;
        this.carNumber = carNumber;
    }

    

    public static void main(String[] args) {
        
        CarFactory bmw = CarFactory.getCarFactory();
        bmw.createCar("bmw");
        System.out.println(bmw.getCarNum());

    }

}
