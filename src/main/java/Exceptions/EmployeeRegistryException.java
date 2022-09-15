package Exceptions;

public class EmployeeRegistryException extends  Exception{
    public EmployeeRegistryException() {
    }

    public EmployeeRegistryException(String message) {
        super(message);
    }
}
