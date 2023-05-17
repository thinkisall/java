package inheritance;

public class VipCustomer extends Customer{

    double salesRatio;

    public VipCustomer(int customerID, String customerName, int bonusPoint) {
        super(customerID, customerName,bonusPoint);
        this.bonusPoint = bonusPoint;
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        
    }

    public String getAgentID(){
        return agentID;
    
    }

}
