package am.tteni.univer.controller;

import am.tteni.univer.common.model.Student;
import am.tteni.univer.common.model.type.StudySemester;
import am.tteni.univer.common.model.type.StudyYear;
import am.tteni.univer.common.universityexception.UniversityAppException;
import am.tteni.univer.repository.implementations.StudentRepositoryImpl;
import am.tteni.univer.repository.interfaces.StudentRepository;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public class StudentController {

    StudentRepository studentRepository = new StudentRepositoryImpl();



    public void registerStudent(String firstName, String lastName, String username, String password, String eMail, StudyYear studyYear, StudySemester studySemester, int groupNumber) throws UniversityAppException {
        Student student = null;
        if (isFreeStudentUsernameEMail(username, eMail)) {
            student = new Student(firstName, lastName, username, password, eMail, studyYear, studySemester, groupNumber);
            studentRepository.create(student);
        }
    }

    public boolean isFreeStudentUsernameEMail(String username, String eMail) throws UniversityAppException{
        return studentRepository.read(username, eMail);
    }
}
