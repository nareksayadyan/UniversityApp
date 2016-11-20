package am.tteni.univer.common.model;

import am.tteni.univer.common.model.type.CourseTime;
import am.tteni.univer.common.model.type.WeekDay;

import java.util.ArrayList;

/**
 * Created by Narek on 17.11.2016.
 */
public class Course {

    private int courseId;
    private String courseSubject;
    private int auditoriumNumber;
    private WeekDay weekDay;
    private CourseTime courseTime;
    private Professor professor;

    public Course() {

    }

    public Course(String courseSubject, int auditoriumNumber, WeekDay weekDay, CourseTime courseTime, Professor professor) {
        this.courseSubject = courseSubject;
        this.auditoriumNumber = auditoriumNumber;
        this.weekDay = weekDay;
        this.courseTime = courseTime;
        this.professor = professor;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseSubject() {
        return courseSubject;
    }

    public void setCourseSubject(String courseSubject) {
        this.courseSubject = courseSubject;
    }

    public int getAuditoriumNumber() {
        return auditoriumNumber;
    }

    public void setAuditoriumNumber(int auditoriumNumber) {
        this.auditoriumNumber = auditoriumNumber;
    }

    public WeekDay getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(WeekDay weekDay) {
        this.weekDay = weekDay;
    }

    public CourseTime getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(CourseTime courseTime) {
        this.courseTime = courseTime;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
