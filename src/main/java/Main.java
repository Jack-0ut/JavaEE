import Exceptions.EmployeeRegistryException;
import Exceptions.FieldLengthLimitException;
import Exceptions.IncorrectSalaryException;

public class Main {
    public static void main(String[] args) {
        try{
            Manager manager = new Manager("Forrest Gump","HR",500000,2000);
            Employee employee1 = new Employee("Eugene Solovey","Finance",125000,manager.getId());
            Employee employee2 = new Employee("Alex Bergman","Finance",150000,manager.getId());
            Employee employee3 =  new Employee("Alex Bergman","Finance",150000,manager.getId());

            Registry registry = Registry.getRegistry();
            registry.addEmployee(manager);
            registry.addEmployee(employee1);
            registry.addEmployee(employee2);
            registry.addEmployee(employee2);
            registry.printList();
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (FieldLengthLimitException e) {
            System.out.println(e.getMessage());
        }

    }
}
