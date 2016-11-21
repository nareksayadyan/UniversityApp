package am.tteni.univer.repository.implementations;

import am.tteni.univer.common.model.Course;
import am.tteni.univer.common.model.Faculty;
import am.tteni.univer.common.model.Group;
import am.tteni.univer.common.model.Student;
import am.tteni.univer.repository.interfaces.LessonRepository;

import java.util.ArrayList;

/**
 * Created by Narek on 18.11.2016.
 */
public class LessonRepositoryImpl implements LessonRepository {

    @Override
    public ArrayList<Course> read(Student student) {
        return null;
    }

    @Override
    public ArrayList<Course> read(Group group) {
        return null;
    }

    @Override
    public ArrayList<Course> read(Faculty faculty) {
        return null;
    }
}
