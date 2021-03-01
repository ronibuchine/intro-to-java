import java.io.IOException;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    float baseSalary;

    BasePlusCommissionEmployee(String fn, String ln, int i, float g, float c, float b) {
        super(fn,ln,i,g,c);
        baseSalary = b;
    }

    BasePlusCommissionEmployee() {
        super();
        baseSalary = 0;        
    }

    public void setBaseSalary(float b) {
        try {
            baseSalary = b;
            if (baseSalary < 0) throw new IOException();
        }
        catch(IOException e) {
            baseSalary = 0;
        }        
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

    public boolean equals(BasePlusCommissionEmployee e) {
        return (super.equals(e) && e.baseSalary==baseSalary);
    }
}
