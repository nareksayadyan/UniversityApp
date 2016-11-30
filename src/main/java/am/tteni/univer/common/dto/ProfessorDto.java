package am.tteni.univer.common.dto;

/**
 * Created by Narek on 09.11.2016.
 */
public class ProfessorDto {

    private int professorId;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String eMail;

    public ProfessorDto() {
    }

    public ProfessorDto(String firstname, String lastname, String username, String password, String eMail) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.eMail = eMail;
    }

    public ProfessorDto(int professorId, String firstname, String lastname, String username, String password, String eMail) {
        this.professorId = professorId;
        this.firstname = firstname;
        this.lastname = lastname;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
