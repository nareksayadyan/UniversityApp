package am.tteni.univer.controller;

import am.tteni.univer.common.model.Course;
import am.tteni.univer.common.model.Professor;
import am.tteni.univer.common.model.type.CourseTime;
import am.tteni.univer.common.model.type.WeekDay;
import am.tteni.univer.repository.implementations.CourseRepositoryImpl;
import am.tteni.univer.repository.interfaces.CourseRepository;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public class CourseController {

    CourseRepository courseRepository = new CourseRepositoryImpl();

    public void createCourse(String subject, int auditoriumNumber, WeekDay weekDay, CourseTime courseTime, Professor professor) {
        Course course = null;
        courseRepository.create(course);
    }
}
