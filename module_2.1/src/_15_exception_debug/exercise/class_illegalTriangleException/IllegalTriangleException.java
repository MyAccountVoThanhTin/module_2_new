package _15_exception_debug.exercise.class_illegalTriangleException;

public class IllegalTriangleException extends RuntimeException {
    private String message;

    public IllegalTriangleException() {
    }
    public IllegalTriangleException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
