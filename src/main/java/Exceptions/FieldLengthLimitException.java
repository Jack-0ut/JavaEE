package Exceptions;

// Exception class that will limit number of characters in the name and surname
public class FieldLengthLimitException extends  Exception{
    public FieldLengthLimitException() {
    }

    public FieldLengthLimitException(String message) {
        super(message);
    }
}
