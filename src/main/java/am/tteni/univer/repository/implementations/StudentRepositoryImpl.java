package am.tteni.univer.repository.implementations;

import am.tteni.univer.common.model.Group;
import am.tteni.univer.common.model.Student;
import am.tteni.univer.repository.interfaces.StudentRepository;

import java.util.ArrayList;

/**
 * Created by Narek on 09.11.2016.
 */
public class StudentRepositoryImpl implements StudentRepository {

    @Override
    public boolean read(String username, String eMail) {
        return false;
    }

    @Override
    public ArrayList<Student> read(Group group) {
        return null;
    }

    @Override
    public Student create(Student obj) {
        return null;
    }

    @Override
    public Student read(Student obj) {
        return null;
    }

    @Override
    public Student update(Student obj) {
        return null;
    }

    @Override
    public void delete(Student obj) {

    }
}
