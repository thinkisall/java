package Collapbration;

public class Subway {

    private int subwayNumber;
    private int passengerCount;
    private int money;

    public Subway(int subwayNumber) {
        this.subwayNumber = subwayNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showSubwayinfo(){
        System.out.println(subwayNumber +"번의 승객 수는" +passengerCount+" 명이고, 수입은 " + money +" 원 입니다.");
    }
    
}
