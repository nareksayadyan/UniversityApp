package am.tteni.univer.repository.interfaces;

import am.tteni.univer.common.model.Course;
import am.tteni.univer.common.model.Group;
import am.tteni.univer.common.model.Professor;
import am.tteni.univer.common.model.type.CourseTime;
import am.tteni.univer.common.model.type.WeekDay;

import java.util.ArrayList;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public interface CourseRepository extends CRUD<Course> {

    void create(Group group, Course course);

    boolean read(int auditoriumNumber, WeekDay weekDay, CourseTime courseTime);

    boolean read(Professor professor, Course course);

    ArrayList<Course> read(Group group);

    void delete(Group group, Course course);
}
