package CopyOverriding;

public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    String  agentID;
    double saleRatio;


    public Customer(int customerID, String customerName, int bonusPoint) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        this.bonusPoint = bonusPoint;
        bonusRatio = 0.01;
        saleRatio = 0;
    
    }

    public int getBonusPoint(){
        return bonusPoint;
    }

    public double getSaleRatio(){
        return saleRatio;
    }

    public double getBonusRatio(){
        return bonusRatio;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return customerName + "의 등급은" + customerGrade + "이며, 보너스포인트는 " + bonusPoint + "입니다.";
    }

    public int getCustomerID(){
        return customerID;
    }

    public void setCustomerID(int customerID){
        this.customerID = customerID;
    
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerGrade(){
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade){
        this.customerGrade = customerGrade;
    
    }

}
