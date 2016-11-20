package am.tteni.univer.controller;

import am.tteni.univer.common.model.*;
import am.tteni.univer.common.universityexception.UniversityAppException;
import am.tteni.univer.repository.implementations.LessonRepositoryImpl;
import am.tteni.univer.repository.interfaces.LessonRepository;

import java.util.ArrayList;

/**
 * Created by Narek on 18.11.2016.
 */
public class LessonController {

    LessonRepository lessonRepository = new LessonRepositoryImpl();

    public void createLessonForGroup(Group group, Course course) throws UniversityAppException {
        Lesson lesson = new Lesson(group, course);
        lessonRepository.create(lesson);
    }

    public void createLessonForGroups(ArrayList<Group> groups, Course course) throws UniversityAppException {
        Lesson lesson = new Lesson(groups, course);
        lessonRepository.create(lesson);
    }

    public ArrayList<Lesson> getLessonsByStudent(Student student) {
        return lessonRepository.read(student);
    }

    public ArrayList<Lesson> getLessonsByGroup(Group group) {
        return lessonRepository.read(group);
    }

    public ArrayList<Lesson> getLessonsByFaculty(Faculty faculty) {
        return lessonRepository.read(faculty);
    }
}
