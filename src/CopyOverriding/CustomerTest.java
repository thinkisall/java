package CopyOverriding;

import Collapbration.Human;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

//        Customer customerKim = new VipCustomer(123,"김상현",4000);
        
        // 다형성이라는데 형변환을 해도 오버라이딩의 경우에는 인스턴스에서 오버라이딩한 부분을 가져다쓴다.
        // 오버라이딩한 것 빼곤 나머지는 다 customer 것을 쓰게됨.

//        System.out.println(customerKim.calcPrice(10000));
//        System.out.println(customerKim.getBonusPoint());

        // 챕터2

        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer(10010, "Lee", 0));
        customers.add(new Customer(10020, "Kim", 0));
        customers.add(new GoldCustomer(10030, "Park", 0));
        customers.add(new GoldCustomer(10040, "Yoon", 0));
        customers.add(new VipCustomer(10050, "Choi", 0));

        for(Customer customer : customers){
            System.out.println(customer.showCustomerInfo());
            int cost = customer.calcPrice(10000);
            System.out.println(customer.getCustomerName() + "님이" + cost + "을 지불함");
            System.out.println("보너스포인트는" + customer.getBonusPoint() + "입니다");
        }

    }


}
