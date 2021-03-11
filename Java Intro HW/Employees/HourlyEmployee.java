package Employees;

public class HourlyEmployee extends Employee {

    int hours;
    float wage;

    // constructors
    public HourlyEmployee(String fn, String ln, int i, int hrs, float w) throws IllegalArgumentException {
        super(fn, ln, i);
        if (hrs<0 || w<0) throw new IllegalArgumentException("Error: Constructor cannot take negative values for hours or wage.");
        hours = hrs;
        wage = w;
    }
    public HourlyEmployee() {
        super();
        hours = 0;
        wage = 0;
    }

    // setters & getters
    public void setHours(int hrs) throws IllegalArgumentException {

        if (hrs<0) throw new IllegalArgumentException("Error: hours cannot be negative");        
        hours = hrs;       
    }

    public void setWage(float w) throws IllegalArgumentException {
        if (w < 0) throw new IllegalArgumentException("Error: wage cannot be negative.");
        wage = w;
    }

    public int getHours() {
        return hours;
    }

    public float getWage() {
        return wage;
    }

    public float earnings() {
        return hours*wage;
    }  

    @Override
    public String toString() {
        String s1 = "Hours Worked | ";
        String s2 = "Hourly Wage | ";

        return super.toString()+'\n'+s1+hours+'\n'+s2+wage;
    }

    @Override
    public boolean equals(Object obj) {  
        if (obj == this) return true;
        if (!(obj instanceof HourlyEmployee)) return false; 
        HourlyEmployee other = (HourlyEmployee)obj;
        return super.equals(obj) && hours==other.hours && wage==other.wage;
    }
}
