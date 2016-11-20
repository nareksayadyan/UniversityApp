package am.tteni.univer.repository.implementations;

import am.tteni.univer.common.model.Faculty;
import am.tteni.univer.common.model.Group;
import am.tteni.univer.common.model.Lesson;
import am.tteni.univer.common.model.Student;
import am.tteni.univer.repository.interfaces.LessonRepository;

import java.util.ArrayList;

/**
 * Created by Narek on 18.11.2016.
 */
public class LessonRepositoryImpl implements LessonRepository {

    @Override
    public ArrayList<Lesson> read(Student student) {
        return null;
    }

    @Override
    public ArrayList<Lesson> read(Group group) {
        return null;
    }

    @Override
    public ArrayList<Lesson> read(Faculty faculty) {
        return null;
    }

    @Override
    public Lesson create(Lesson obj) {
        return null;
    }

    @Override
    public Lesson read(Lesson obj) {
        return null;
    }

    @Override
    public Lesson update(Lesson obj) {
        return null;
    }

    @Override
    public void delete(Lesson obj) {

    }
}
