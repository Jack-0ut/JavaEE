import Exceptions.FieldLengthLimitException;
import Exceptions.IncorrectSalaryException;

public class Manager extends  Employee{
    private double bonus;

    public Manager(String name, String department, double salary, double bonus)
            throws FieldLengthLimitException, IncorrectSalaryException {
        setName(name);
        setSalary(salary);
        this.id = nextId++;
        this.department = department;
        this.bonus = bonus;
    }
    @Override
    public void printEmployee(){
        System.out.println("ID: " + id + " Name: " + name  +
                " Department: " + department +  " Salary: "
                + salary + " USD" +" Bonus:  " + bonus + " USD");
    }
    public double getBonus() {
        return bonus;
    }
}
