import java.util.ArrayList;


public class Payroll {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>(3); 
        employees.add(0, new HourlyEmployee("John", "Finkelstein", 212411234, 180, 60));
        employees.add(1, new CommissionEmployee("Ray", "Romano", 287912123, 50000, 15));
        employees.add(2, new BasePlusCommissionEmployee("Roni", "Buchine", 387918273, 10000, 10, 10000));              
        for (Employee e : employees) {
            float salary = e.earnings();
            if (e instanceof BasePlusCommissionEmployee) {
                /* adds 10% bonus to instances of BasePlusCommissionEmployee */
                salary *= 1.1; 
            }
            System.out.println(e.toString());
            System.out.println(e.getfirstName() + "'s earnings for the month are: " + salary + '\n');
        }             
    }
}
/* 
~~~~~~TEST CASES ~~~~~~
ID no. | 12414
First Name | John      
Last Name | Finkelstein
Hours Worked | 180     
Hourly Wage | 60.0     
John's earnings for the month are: 10800.0

ID no. | 987912
First Name | Ray
Last Name | Romano
Gross Sales | 50000.0
Commission | 15.0
Ray's earnings for the month are: 7500.0005

ID no. | 343810545
First Name | Roni
Last Name | Buchine
Gross Sales | 10000.0
Commission | 10.0
Base Salary | 10000.0
Roni's earnings for the month are: 12100.0
*/
