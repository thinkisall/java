package twoconstructor;

public class Order {
    int orderNumber;
    String phoneNumber;
    String address;
    String date;
    int time;
    int price;
    int menuNumber;

    public String[] orderinfo(int orderNumber, String phoneNumber, String address, String date, int time, int price, int menuNumber) {
        this.orderNumber = orderNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.date = date;
        this.time = time;
        this.price = price;
        this.menuNumber = menuNumber;

        String[] orderinfo = {
            "주문 접수번호 :" + orderNumber,
            "주문 핸드폰 번호 :" + phoneNumber,
            "주문 집 주소 :" + address,
            "주문 날짜 :" + date,
            "주문 시각 :" + time,
            "주문 가격 :" + price,
            "메뉴 번호 :" + menuNumber
        };

        return orderinfo;  
    }

}