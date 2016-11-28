package am.tteni.univer.common.dto;

import am.tteni.univer.common.dto.type.StudySemester;
import am.tteni.univer.common.dto.type.StudyYear;

/**
 * Created by Narek Sayadyan on 09.11.2016.
 */
public class StudentDto {

    private int studentId;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String eMail;
    private StudyYear studyYear;
    private StudySemester studySemester;
    private int groupId;

    public StudentDto() {
    }

    public StudentDto(int studentId, String firstname, String lastname, String username, String password, String eMail, StudyYear studyYear, StudySemester studySemester, int groupId) {
        this.studentId = studentId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.eMail = eMail;
        this.studyYear = studyYear;
        this.studySemester = studySemester;
        this.groupId = groupId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public StudyYear getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(StudyYear studyYear) {
        this.studyYear = studyYear;
    }

    public StudySemester getStudySemester() {
        return studySemester;
    }

    public void setStudySemester(StudySemester studySemester) {
        this.studySemester = studySemester;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
