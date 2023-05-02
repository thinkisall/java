package staticVariable;

public class Employee {

    public static int serialNum = 1000;

    private int EmployeeId;
    private String EmployeeName;
    private String department;

    // 객체가 생성될때 초기화 작업은 constructor에서 처리한다.
    // 아래처럼

    public Employee(){
        serialNum++;
        EmployeeId = serialNum;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.EmployeeId = employeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.EmployeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public  void setDepartment(String department) {
        this.department = department;
    }

    public void showInfo(){
        System.out.println(EmployeeId + EmployeeName + department);
    }


}
