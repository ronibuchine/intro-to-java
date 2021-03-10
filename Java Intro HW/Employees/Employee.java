package Employees;

public abstract class Employee {

    String firstName;
    String lastName;
    int id;

    // Constructors
    public Employee(String fn, String ln, int i) throws IllegalArgumentException{
        firstName = fn;
        lastName = ln;
        if (i < 0) throw new IllegalArgumentException("Error: Cannot enter negative ID no.");
        id = i;
    } 
    
    public Employee() {
        firstName = "plony";
        lastName = "almony";
        id = 0;
    }

    //setters & getters
    public void setfirstName(String fn) {
        firstName = fn;
    } 

    public void setlastName(String ln) {
        lastName = ln;
    }
    
    public void setID(int i) {
        id = i;
    }

    public String getfirstName() {
        return firstName;
    }
    
    public String getlastName() {
        return lastName;
    }
    
    public int getID() {
        return id;
    }

    @Override
    public String toString() {
        String s = "ID no. | ";
        String s2 = "First Name | " ;
        String s3 = "Last Name | ";

        return s+id+'\n'+s2+firstName+'\n'+s3+lastName;
    }

    @Override
    public boolean equals(Object obj) {        
        Employee other = (Employee)obj;
        return (this.firstName == other.firstName && this.lastName == other.lastName && this.id== other.id);
    }
    

    public abstract float earnings();  

}