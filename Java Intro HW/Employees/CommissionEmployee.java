package Employees;

public class CommissionEmployee extends Employee {
    float grossSales;
    float commission;
    // Constructors
    public CommissionEmployee(String fn, String ln, int i, float g, float c) throws IllegalArgumentException {
        super(fn, ln, i);
        if (g<0 || c<0) throw new IllegalArgumentException("Error: Constructor can't take negative values for gross sales or commission");
        grossSales = g;
        commission = c;
    }
    public CommissionEmployee() {
        super();
        grossSales = 0;
        commission = 0;
    }
    // setters & getters
    public void setGrossSales(float s) throws IllegalArgumentException {
        if (s<0) throw new IllegalArgumentException("Error: gross sales cannot be negative");
        grossSales = s;        
    }

    public void setCommission(float c) throws IllegalArgumentException {
        if (c<0) throw new IllegalArgumentException("Error: commission cannot be negative");        
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

    @Override
    public boolean equals(Object obj) {
        CommissionEmployee other = (CommissionEmployee)obj;
        return super.equals(obj) && grossSales==other.grossSales && commission==other.commission;
    }
}
