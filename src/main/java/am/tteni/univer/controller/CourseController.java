package am.tteni.univer.controller;

import am.tteni.univer.common.model.Course;
import am.tteni.univer.common.model.Group;
import am.tteni.univer.common.model.Professor;
import am.tteni.univer.common.model.type.CourseTime;
import am.tteni.univer.common.model.type.WeekDay;
import am.tteni.univer.common.universityexception.UniversityAppException;
import am.tteni.univer.repository.implementations.CourseReposiroryImpl;
import am.tteni.univer.repository.interfaces.CourseReposirory;

import java.util.ArrayList;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public class CourseController {

    CourseReposirory courseReposirory = new CourseReposiroryImpl();

    public void createCourse(String subject, int auditoriumNumber, WeekDay weekDay, CourseTime courseTime, Professor professor) {
        Course course = new Course(subject, auditoriumNumber, weekDay, courseTime, professor);
        courseReposirory.create(course);
    }

    public void addGroupsToCourse(ArrayList<Group> groups, Course course) throws UniversityAppException {

    }
}
