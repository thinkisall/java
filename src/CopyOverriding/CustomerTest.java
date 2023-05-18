package CopyOverriding;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerKim = new VipCustomer(123,"김상현",4000);
        
        // 다형성이라는데 형변환을 해도 오버라이딩의 경우에는 인스턴스에서 오버라이딩한 부분을 가져다쓴다.
        // 오버라이딩한 것 빼곤 나머지는 다 customer 것을 쓰게됨.

        System.out.println(customerKim.calcPrice(10000));
        System.out.println(customerKim.getBonusPoint());
    }
}
