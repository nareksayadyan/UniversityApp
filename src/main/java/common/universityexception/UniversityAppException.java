package common.universityexception;

/**
 * Created by Narek on 10.11.2016.
 */
public class UniversityAppException extends Exception {

    String ex;

    public UniversityAppException(String ex) {
        this.ex = ex;
    }
}
