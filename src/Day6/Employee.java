package Day6;

public class Employee {

    double salary;
    String empName;
    static final String COMPANY_NAME = "TCS";

    Employee(double sal,String empName){
        this.empName = empName;
        this.salary = sal;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(20000,"Mahesh");
        System.out.println(employee.empName+ " "+employee.salary+ " "+ COMPANY_NAME);

        Employee employee1 = new Employee(30000,"Ramesh");
        System.out.println(employee1.empName+ " "+employee1.salary+ " "+ COMPANY_NAME);
    }
}