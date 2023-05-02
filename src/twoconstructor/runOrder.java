package twoconstructor;

public class runOrder {
    public static void main(String[] args) {
        Order newOrder = new Order();
        String[] result=newOrder.orderinfo(1000, "010-9999-9999", "경기도", "2018-10-11", 1430, 50000, 10);
        for(String item : result) {
            System.out.println(item);
        };
    }
}
