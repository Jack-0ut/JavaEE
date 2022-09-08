public class Employee {
    private int id;
    private static int nextId = 0;
    private String firstname;
    private String lastname;
    private double salary;

    public Employee(String firstname, String lastname, double salary) {
        this.id = nextId++;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }
    public void printEmployee(){
        System.out.println("ID:" + " Firstname: " + firstname +
                " Lastname: " + lastname +  " Salary: " + salary + " USD");
    }
}
