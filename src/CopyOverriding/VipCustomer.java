package CopyOverriding;

public class VipCustomer extends Customer{

    double saleRatio;

    public VipCustomer(int customerID, String customerName, int bonusPoint) {
        super(customerID, customerName, bonusPoint);
        this.bonusPoint = bonusPoint;
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.2;
    }    
    
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price -= (int)(price * saleRatio);
    }

    public String getAgentID(){
        return agentID;
    }

}
