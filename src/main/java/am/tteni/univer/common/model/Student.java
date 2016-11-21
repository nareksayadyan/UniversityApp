package am.tteni.univer.common.model;

import am.tteni.univer.common.model.type.StudySemester;
import am.tteni.univer.common.model.type.StudyYear;

import java.util.ArrayList;

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
    private StudySemester studySemester;
    private int groupNumber;
    private ArrayList<Course> courses;

    public Student() {

    }

    public Student(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Student(String firstName, String lastName, String username, String password, String eMail, StudyYear studyYear, StudySemester studySemester) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.eMail = eMail;
        this.studyYear = studyYear;
        this.studySemester = studySemester;
    }

    public Student(String firstName, String lastName, String username, String password, String eMail, StudyYear studyYear, StudySemester studySemester, int groupNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.eMail = eMail;
        this.studyYear = studyYear;
        this.studySemester = studySemester;
        this.groupNumber = groupNumber;
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

    public StudySemester getStudySemester() {
        return studySemester;
    }

    public void setStudySemester(StudySemester studySemester) {
        this.studySemester = studySemester;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
