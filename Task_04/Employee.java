public class Employee{
    public String name;
    public int id;
    public String department;
    public void calcullatePay(){
        System.out.println("calculating pay.....");
    }
public static void main(String[] args){
        FullTimeEmployee emp1 = new FullTimeEmployee();
        PartTimeEmployee emp2 = new PartTimeEmployee();
        ContractEmplyee emp3 = new ContractEmplyee();
        emp1.calcullatePay();
        emp2.calcullatePay();
        emp3.calcullatePay();
    }
}
class FullTimeEmployee extends Employee{
    public double fixedSalary;
}
class PartTimeEmployee extends Employee{
    public double hourlyRate;
    public int hoursWorked;
}
class ContractEmplyee extends Employee{
    public String projectName;
    public double contractAmount;
}

