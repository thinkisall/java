package override;

public class VipCustomer extends Customer{

    double salesRatio;

    public VipCustomer(int customerID, String customerName, int bonusPoint) {
        super(customerID, customerName,bonusPoint);
        this.bonusPoint = bonusPoint;
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }    
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return (int)(price-price*bonusRatio);
    }

    public String getAgentID(){
        return agentID;
    }

}
