package controller;

import common.model.Student;
import common.model.type.StudySemester;
import common.model.type.StudyYear;
import common.universityexception.UniversityAppException;
import repository.implementations.StudentRepositoryImpl;
import repository.interfaces.StudentRepository;

/**
 * Created by Narek on 09.11.2016.
 */
public class RegisterController {

    StudentRepository studentRepository = new StudentRepositoryImpl();

    public Student registerStudent(String firstName, String lastName, String username, String password, String eMail, StudyYear studyYear, StudySemester studySession, int groupNumber) throws UniversityAppException {
        Student student = null;
        if (isFreeStudentUsername(username)) {
            student = new Student(firstName, lastName, username, password, eMail, studyYear, studySession, groupNumber);
            studentRepository.create(student);
        } else {
            throw new UniversityAppException("Username is used");
        }
        return student;
    }

    public boolean isFreeStudentUsername(String username) {
        return studentRepository.read(username) == null;
    }

}
