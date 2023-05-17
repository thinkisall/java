package inheritance;

public class CustomerTest {
    public static void main(String[] args) {

        VipCustomer customerKim = new VipCustomer(123,"김상현",4000);
        System.out.println(customerKim.showCustomerInfo());
        System.out.println(customerKim.getSaleRatio());
        System.out.println(customerKim.getBonusRatio());

        System.out.println(customerKim.calcPrice(10000));
    }
}
