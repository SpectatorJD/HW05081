package pro.skyHW0508.HW05081.exceptions;

public class WrongLoginException extends RuntimeException{
    public WrongLoginException(String message) {
        super(message);
    }
}
