package am.tteni.univer.repository.interfaces;

import am.tteni.univer.common.model.Faculty;
import am.tteni.univer.common.model.Group;
import am.tteni.univer.common.model.Lesson;
import am.tteni.univer.common.model.Student;

import java.util.ArrayList;

/**
 * Created by Narek on 18.11.2016.
 */
public interface LessonRepository extends CRUD<Lesson> {

    ArrayList<Lesson> read(Student student);

    ArrayList<Lesson> read(Group group);

    ArrayList<Lesson> read(Faculty faculty);
}
