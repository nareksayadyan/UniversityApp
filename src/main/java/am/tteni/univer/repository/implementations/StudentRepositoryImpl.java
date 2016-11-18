package am.tteni.univer.repository.implementations;

import am.tteni.univer.common.model.Student;
import am.tteni.univer.common.universityexception.UniversityAppException;
import am.tteni.univer.repository.interfaces.StudentRepository;

/**
 * Created by Narek on 09.11.2016.
 */
public class StudentRepositoryImpl implements StudentRepository {

    @Override
    public Student create(Student obj) {
        return null;
    }

    @Override
    public Student read(Student obj) {
        return null;
    }

    @Override
    public boolean read(String username, String eMail) throws UniversityAppException {
//        throw new UniversityAppException("Username exist");
        return false;
    }

    @Override
    public Student update(Student obj) {
        return null;
    }

    @Override
    public void delete(Student obj) {

    }
}
