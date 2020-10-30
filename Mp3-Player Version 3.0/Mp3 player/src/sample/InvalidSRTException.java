package sample;

public class InvalidSRTException extends SRTException{
    public InvalidSRTException(String message, Throwable cause) {
        super(message,cause);
    }
    public InvalidSRTException(String message) {
        super(message);
    }
    public InvalidSRTException(Throwable cause) {
        super(cause);
    }
}
