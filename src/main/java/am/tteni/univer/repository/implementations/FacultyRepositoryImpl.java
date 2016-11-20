package am.tteni.univer.repository.implementations;

import am.tteni.univer.common.model.Faculty;
import am.tteni.univer.common.model.University;
import am.tteni.univer.common.universityexception.UniversityAppException;
import am.tteni.univer.repository.interfaces.FacultyRepository;

/**
 * Created by Narek on 18.11.2016.
 */
public class FacultyRepositoryImpl implements FacultyRepository {

    @Override
    public Faculty create(Faculty faculty, University university) {
        return null;
    }

    @Override
    public Faculty read(String facultyName, University university) throws UniversityAppException {
        return null;
    }

    @Override
    public Faculty create(Faculty obj) {
        return null;
    }

    @Override
    public Faculty read(Faculty obj) {
        return null;
    }

    @Override
    public Faculty update(Faculty obj) {
        return null;
    }

    @Override
    public void delete(Faculty obj) {

    }
}
