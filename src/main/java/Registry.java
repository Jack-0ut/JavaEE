import Exceptions.EmployeeRegistryException;
import Exceptions.FieldLengthLimitException;

import java.util.ArrayList;
import java.util.List;

public class Registry {
    static Registry registry = null;
    private ArrayList<Employee> workers = new ArrayList<>();
    private Registry(){

    }
    public void addEmployee(Employee employee){
        if (workers.contains(employee)){
            try{
                throw new EmployeeRegistryException("The same employee already exists in the list");
            }catch (EmployeeRegistryException e){
                System.out.println(e.getMessage());
            }
        }else{
            workers.add(employee);
        }
    }

    public static Registry getRegistry() {
        if (registry == null){
            registry = new Registry();
        }
        return registry;
    }

    public void printList(){
        for (Employee e: workers) {
            e.printEmployee();
        }
    }
}
