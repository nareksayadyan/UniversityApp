package am.tteni.univer.repository.implementations;

import am.tteni.univer.common.model.Professor;
import am.tteni.univer.common.universityexception.UniversityAppException;
import am.tteni.univer.repository.interfaces.ProfessorRepository;

/**
 * Created by Narek Sayadyan on 10.11.2016.
 */
public class ProfessorRepositoryImpl implements ProfessorRepository {

    @Override
    public Professor create(Professor obj) {
        return null;
    }

    @Override
    public Professor read(Professor obj) {
        return null;
    }

    @Override
    public boolean read(String username, String eMail) throws UniversityAppException {
//        throw new UniversityAppException("Username exist");
        return false;
    }

    @Override
    public Professor update(Professor obj) {
        return null;
    }

    @Override
    public void delete(Professor obj) {

    }
}
