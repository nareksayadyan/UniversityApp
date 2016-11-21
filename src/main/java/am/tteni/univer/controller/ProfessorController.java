package am.tteni.univer.controller;

import am.tteni.univer.common.model.Professor;
import am.tteni.univer.common.universityexception.UniversityAppException;
import am.tteni.univer.repository.implementations.ProfessorRepositoryImpl;
import am.tteni.univer.repository.interfaces.ProfessorRepository;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public class ProfessorController {

    ProfessorRepository professorRepository = new ProfessorRepositoryImpl();

    public void addProfessor(String firstName, String lastName, String username, String password, String eMail) throws UniversityAppException {
        Professor professor = null;
        if (isFreeProfessorUsernameEMail(username, eMail)) {
            professor = new Professor(firstName, lastName, username, password, eMail);
            professorRepository.create(professor);
        }
    }

    public boolean isFreeProfessorUsernameEMail(String username, String eMail) throws UniversityAppException {
        return professorRepository.read(username, eMail);
    }
}
