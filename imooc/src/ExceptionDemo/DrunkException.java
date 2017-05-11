package ExceptionDemo;

/**
 * Created by yangxi on 2017/5/11.
 */
public class DrunkException extends Exception{
    public DrunkException(String message) {
        super(message);
    }

    public  DrunkException() {}
}
