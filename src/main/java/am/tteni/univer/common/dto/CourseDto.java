package am.tteni.univer.common.dto;

/**
 * Created by Narek on 17.11.2016.
 */
public class CourseDto {

    private int courseId;
    private String subject;
    private int professorId;

    public CourseDto() {
    }

    public CourseDto(int courseId, String subject, int professorId) {
        this.courseId = courseId;
        this.subject = subject;
        this.professorId = professorId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }
}
