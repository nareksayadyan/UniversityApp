package controller;

import common.model.Student;
import common.universityexception.UniversityAppException;
import repository.implementations.UserRepository;

/**
 * Created by Narek on 09.11.2016.
 */
public class RegisterController {

    UserRepository userRepository = new UserRepository();

    public Student registerStudent(String username, String password) throws UniversityAppException {
        Student student = null;
        if (isFreeStudentUsername(username)) {
            student = new Student(username, password);
            userRepository.create(student);
        } else {
            throw new UniversityAppException("username is used");
        }
        return student;
    }

    public boolean isFreeStudentUsername(String username) {
        return userRepository.read(username) == null;
    }

}
