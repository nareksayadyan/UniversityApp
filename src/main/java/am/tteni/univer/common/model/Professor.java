package am.tteni.univer.common.model;

/**
 * Created by Narek on 09.11.2016.
 */
public class Professor {

    private int professorId;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String eMail;

    public Professor() {

    }

    public Professor(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Professor(String firstName, String lastName, String username, String password, String eMail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.eMail = eMail;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
