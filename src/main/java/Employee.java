import Exceptions.FieldLengthLimitException;
import Exceptions.IncorrectSalaryException;

public class Employee {
    private int id;
    private static int nextId = 0;
    private String firstname;
    private String lastname;
    private double salary;

    public Employee(String firstname, String lastname, double salary) throws FieldLengthLimitException,IncorrectSalaryException {
        setFirstname(firstname);
        setLastname(lastname);
        setSalary(salary);
        this.id = nextId++;
        /*this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;*/
    }
    public void printEmployee(){
        System.out.println("ID:" + " Firstname: " + firstname +
                " Lastname: " + lastname +  " Salary: " + salary + " USD");
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        if (firstname.length() > 15){
            try {
                throw  new FieldLengthLimitException("Firstname has more than 15 symbols!");
            } catch (FieldLengthLimitException e) {
                System.out.println(e.getMessage());
            }
        }else{this.firstname = firstname;}
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        if(lastname.length() > 25){
            try{
                throw new FieldLengthLimitException("Lastname has more than 25 symbols!");
            }catch (FieldLengthLimitException e){
                System.out.println(e.getMessage());
            }
        }else{this.lastname = lastname;}
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            try{
                throw new IncorrectSalaryException("Salary is negative!");
            }catch (IncorrectSalaryException e){
                System.out.println(e.getMessage());
            }
        }
        else{this.salary = salary;}
    }
}
