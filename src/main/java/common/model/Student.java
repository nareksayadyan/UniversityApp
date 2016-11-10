package common.model;

import common.model.type.StudySemester;
import common.model.type.StudyYear;

/**
 * Created by Narek Sayadyan on 09.11.2016.
 */
public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String eMail;
    private StudyYear studyYear;
    private StudySemester studySession;
    private int groupNumber;

    public Student() {

    }

    public Student(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public StudyYear getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(StudyYear studyYear) {
        this.studyYear = studyYear;
    }

    public StudySemester getStudySession() {
        return studySession;
    }

    public void setStudySession(StudySemester studySession) {
        this.studySession = studySession;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
}
