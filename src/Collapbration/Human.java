package Collapbration;

public class Human {
    private String name;
    private int age;
    private int money;

    public Human(String name,int age, int money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public void takeBus(Bus bus) {
            int fare = bus.getFare(); // 요금 정보 가져오기
            if (age < 10) {
                bus.take(fare / 2); // 어린이는 반값으로 지불
                money -= fare / 2;
            } else {
                bus.take(fare);
                money -= fare;
            }
        

    }

    public void takeSubway(Subway subway) {
        if(age > 10){
            subway.take(1500);
            this.money -= 1500;
        }else{
            subway.take(2500);
            this.money -= 2500;
        }
    
    }

    public void showInfo(){
        System.out.println(name + "의 남은 돈" + money +"원 입니다.");
    }

}
