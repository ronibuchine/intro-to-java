import java.io.IOException;

public class CommissionEmployee extends Employee {
    float grossSales;
    float commission;
    // Constructors
    CommissionEmployee(String fn, String ln, int i, float g, float c) {
        super(fn, ln, i);
        grossSales = g;
        commission = c;
    }
    CommissionEmployee() {
        super();
        grossSales = 0;
        commission = 0;
    }
    // setters & getters
    public void setgrossSales(float s) {
        try {
            grossSales = s;
            if (grossSales < 0) throw new IOException();
        }
        catch(IOException e) {
            grossSales = 0;
        }        
    }

    public void setCommission(float c) {
        try {
            if (c < 0 || c > 50) throw new IOException();
        }
        catch(IOException e) {
            c = 0;
        }
        commission = c;
    }

    public float getGrossSales() {
        return grossSales;
    }

    public float getCommission() {
        return commission;        
    }

    public float earnings() {
        return (commission/100)*grossSales;
    }

    @Override
    public String toString() {
        String s1 = "Gross Sales | ";
        String s2 = "Commission | ";
        return super.toString()+'\n'+s1+grossSales+'\n'+s2+commission;
    }

    public boolean equals(CommissionEmployee e) {
        return super.equals(e) && grossSales==e.grossSales && commission==e.commission;
    }
}
