package Collapbration;

public class Bus {
    private int busNumber;
    private int passengerCount;
    private int money;
    private int fare;


    public Bus(int busNumber, int fare) {
        this.busNumber = busNumber;
        this.fare = fare;
    }

    public int getFare() {
        return fare;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showBusinfo(){
        System.out.println(busNumber +"번의 승객 수는" +passengerCount+" 명이고, 수입은 " + money +" 원 입니다.");
    }



}

