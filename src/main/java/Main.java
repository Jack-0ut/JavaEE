import Exceptions.FieldLengthLimitException;
import Exceptions.IncorrectSalaryException;

public class Main {
    public static void main(String[] args) {

        try{
            Employee employee = new Employee("Eugeneeeeeruiuuvgg","Solhhhhhhhukukkukytrtgrggfgfdgovey",-12500);
        } catch (IncorrectSalaryException e) {
            System.out.println(e.getMessage());
        } catch (FieldLengthLimitException e) {
            System.out.println(e.getMessage());
        }

    }
}
