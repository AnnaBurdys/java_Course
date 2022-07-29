package by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.exception;

public class TechnicalFlowerException extends FlowerProjectException{
    public TechnicalFlowerException() {
        super();
    }

    public TechnicalFlowerException(String message) {
        super(message);
    }

    public TechnicalFlowerException(String message, Throwable cause) {
        super(message, cause);
    }

    public TechnicalFlowerException(Throwable cause) {
        super(cause);
    }
}
