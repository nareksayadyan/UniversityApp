package am.tteni.univer.repository.interfaces;

import am.tteni.univer.common.model.Course;
import am.tteni.univer.common.model.Faculty;
import am.tteni.univer.common.model.Group;
import am.tteni.univer.common.model.Student;

import java.util.ArrayList;

/**
 * Created by Narek on 18.11.2016.
 */
public interface LessonRepository {

    ArrayList<Course> read(Student student);

    ArrayList<Course> read(Group group);

    ArrayList<Course> read(Faculty faculty);
}
