package Collapbration;

public class Test {
    public static void main(String[] args) {
        Human tomas = new Human("tomas", 15, 5000);
        Human john = new Human("john", 7, 10000);

        Bus bus100 = new Bus(100,2000);
        Bus bus300 = new Bus(300,3000);

        tomas.takeBus(bus100);
        john.takeBus(bus300);

        tomas.showInfo();
        john.showInfo();

        bus100.showBusinfo();
        bus300.showBusinfo();
    }
}
