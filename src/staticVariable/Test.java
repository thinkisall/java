package staticVariable;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        System.out.println(Employee.getSerialNum());
        
        e1.setEmployeeName("Lee");
        e2.setEmployeeName("Kim");

        e1.setDepartment("반도체");
        e2.setDepartment("신소재");

        e1.showInfo();
        e2.showInfo();

        

    
        
    }
}
