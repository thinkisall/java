package staticMethod;

public class CarFactory {
    private static CarFactory instance = new CarFactory();
    private static int carNum = 10000;
    private CarFactory(){}

    public static CarFactory getCarFactory(){
        if(instance == null){
            instance = new CarFactory();
        }
        return instance;
    }

    public Car createCar(String name){
        Car car = new Car(name, carNum);
        carNum++;
        return car;
    }


    public int getCarNum(){
        return carNum;
    }






}
