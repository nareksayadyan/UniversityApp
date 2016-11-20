package am.tteni.univer.common.model;

import java.util.ArrayList;

/**
 * Created by Narek on 18.11.2016.
 */
public class Lesson {

    private int lessonId;
    private Course course;
    private ArrayList<Group> groups;

    public Lesson(Course course) {
        this.course = course;
    }

    public Lesson(Group group, Course course) {
        this.groups.add(group);
        this.course = course;
    }

    public Lesson(ArrayList<Group> groups, Course course) {
        this.groups = groups;
        this.course = course;
    }

    public int getLessonId() {
        return lessonId;
    }

    public void setLessonId(int lessonId) {
        this.lessonId = lessonId;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }
}
