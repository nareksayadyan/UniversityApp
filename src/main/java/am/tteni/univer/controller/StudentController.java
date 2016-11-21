package am.tteni.univer.controller;

import am.tteni.univer.common.model.Group;
import am.tteni.univer.common.model.Student;
import am.tteni.univer.common.model.type.StudySemester;
import am.tteni.univer.common.model.type.StudyYear;
import am.tteni.univer.common.universityexception.UniversityAppException;
import am.tteni.univer.repository.implementations.LessonRepositoryImpl;
import am.tteni.univer.repository.implementations.StudentRepositoryImpl;
import am.tteni.univer.repository.interfaces.LessonRepository;
import am.tteni.univer.repository.interfaces.StudentRepository;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public class StudentController {

    StudentRepository studentRepository = new StudentRepositoryImpl();
    LessonRepository lessonRepository = new LessonRepositoryImpl();

    public Student addStudent(String firstName, String lastName, String username, String password, String eMail, StudyYear studyYear, StudySemester studySemester) throws UniversityAppException {
        Student student = null;
        if (isFreeStudentUsernameEMail(username, eMail)) {
            student = new Student(firstName, lastName, username, password, eMail, studyYear, studySemester);
            studentRepository.create(student);
        }
        return student;
    }

    public boolean isFreeStudentUsernameEMail(String username, String eMail) throws UniversityAppException{
        return studentRepository.read(username, eMail);
    }

    public Student addStudentToGroup(Student student, Group group) {
        student.setGroupNumber(group.getGroupNumber());
        studentRepository.update(student);
        return student;
    }

    public Student getStudentCourses(Student student) {
        student.setCourses(lessonRepository.read(student));
        return student;
    }
}
