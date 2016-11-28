package am.tteni.univer.common.dto;

import am.tteni.univer.common.dto.type.CourseTime;
import am.tteni.univer.common.dto.type.WeekDay;

/**
 * Created by Narek on 28.11.2016.
 */
public class CourseTimeDto {

    private int courseTimeDto;
    private int courseId;
    private WeekDay weekDay;
    private CourseTime courseTime;
    private int auditoriumNumber;

    public CourseTimeDto() {
    }

    public CourseTimeDto(int courseTimeDto, int courseId, WeekDay weekDay, CourseTime courseTime, int auditoriumNumber) {
        this.courseTimeDto = courseTimeDto;
        this.courseId = courseId;
        this.weekDay = weekDay;
        this.courseTime = courseTime;
        this.auditoriumNumber = auditoriumNumber;
    }

    public int getCourseTimeDto() {
        return courseTimeDto;
    }

    public void setCourseTimeDto(int courseTimeDto) {
        this.courseTimeDto = courseTimeDto;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
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

    public int getAuditoriumNumber() {
        return auditoriumNumber;
    }

    public void setAuditoriumNumber(int auditoriumNumber) {
        this.auditoriumNumber = auditoriumNumber;
    }
}
