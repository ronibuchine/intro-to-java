import java.io.IOException;

public class HourlyEmployee extends Employee {
    int hours;
    float wage;
    // constructors
    public HourlyEmployee(String fn, String ln, int i, int hrs, float w) {
        super(fn, ln, i);
        hours = hrs;
        wage = w;
    }
    public HourlyEmployee() {
        super();
        hours = 0;
        wage = 0;
    }

    // setters & getters
    public void setHours(int hrs) {
        try {
            if (hrs < 0) throw new IOException();            
        }           
        catch(IOException e) { 
                hrs = 0;                
        } 
        hours = hrs;       
    }

    public void setWage(float w) {
        try {
            if (w < 0) throw new IOException();            
        }           
        catch(IOException e) { 
            w = 0;                
        } 
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
    public boolean equals(HourlyEmployee h) {
        return super.equals(h) && hours==h.hours && wage==h.wage;
    }
}
