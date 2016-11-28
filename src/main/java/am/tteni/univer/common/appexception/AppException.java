package am.tteni.univer.common.appexception;

/**
 * Created by Narek on 10.11.2016.
 */
public class AppException extends Exception {

    private String e;

    public AppException() {
    }

    public AppException(String e) {
        this.e = e;
    }
}
