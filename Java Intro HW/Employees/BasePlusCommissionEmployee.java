package Employees;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    float baseSalary;

    public BasePlusCommissionEmployee(String fn, String ln, int i, float g, float c, float b) throws IllegalArgumentException {
        super(fn,ln,i,g,c);
        if (b < 0) throw new IllegalArgumentException("Error: base salary cannot be negative.");
        baseSalary = b;
    }

    public BasePlusCommissionEmployee() {
        super();
        baseSalary = 0;        
    }

    public void setBaseSalary(float b) throws IllegalArgumentException {
        if (b<0) throw new IllegalArgumentException("Error: base salary cannot be negative");
        baseSalary = b;        
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public float earnings() {
        return super.earnings() + baseSalary;
    }

    @Override
    public String toString() {
        String s1 = "Base Salary | ";
        return super.toString() + '\n' + s1 + baseSalary;
    }

    @Override
    public boolean equals(Object obj) {  
        if (obj == this) return true;
        if (!(obj instanceof BasePlusCommissionEmployee)) return false; 
        BasePlusCommissionEmployee other = (BasePlusCommissionEmployee)obj;
        return super.equals(obj) && baseSalary==other.baseSalary;
    }
}
