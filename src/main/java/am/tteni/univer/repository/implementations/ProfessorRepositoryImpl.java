package am.tteni.univer.repository.implementations;

import am.tteni.univer.common.dto.ProfessorDto;
import am.tteni.univer.repository.ProfessorRepository;

/**
 * Created by Narek Sayadyan on 10.11.2016.
 */
public class ProfessorRepositoryImpl implements ProfessorRepository {

    @Override
    public boolean read(String username, String eMail) {
        return false;
    }

    @Override
    public ProfessorDto create(ProfessorDto obj) {
        return null;
    }

    @Override
    public ProfessorDto read(ProfessorDto obj) {
        return null;
    }

    @Override
    public ProfessorDto update(ProfessorDto obj) {
        return null;
    }

    @Override
    public void delete(ProfessorDto obj) {

    }
}
