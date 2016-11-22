package am.tteni.univer.repository.implementations;

import am.tteni.univer.common.model.Course;
import am.tteni.univer.common.model.Group;
import am.tteni.univer.common.model.Professor;
import am.tteni.univer.common.model.type.CourseTime;
import am.tteni.univer.common.model.type.WeekDay;
import am.tteni.univer.repository.interfaces.CourseRepository;

import java.util.ArrayList;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public class CourseRepositoryImpl implements CourseRepository {

    @Override
    public void create(Group group, Course course) {

    }

    @Override
    public boolean read(int auditoriumNumber, WeekDay weekDay, CourseTime courseTime) {
        return false;
    }

    @Override
    public boolean read(Professor professor, Course course) {
        return false;
    }

    @Override
    public ArrayList<Course> read(Group group) {
        return null;
    }

    @Override
    public void delete(Group group, Course course) {

    }

    @Override
    public Course create(Course obj) {
        return null;
    }

    @Override
    public Course read(Course obj) {
        return null;
    }

    @Override
    public Course update(Course obj) {
        return null;
    }

    @Override
    public void delete(Course obj) {

    }
}
