package am.tteni.univer.service;

import am.tteni.univer.common.appexception.AppException;
import am.tteni.univer.common.dto.ProfessorDto;
import am.tteni.univer.repository.ProfessorRepository;
import am.tteni.univer.repository.implementations.ProfessorRepositoryImpl;

/**
 * Created by Narek Sayadyan on 30.11.2016.
 */
public class ProfessorDtoService {

    ProfessorRepository professorRepository = new ProfessorRepositoryImpl();

    /**
     * Adding ProfessorDto to database
     * @param professorDto
     * @throws AppException
     */
    public void addProfessorDto(ProfessorDto professorDto) throws AppException{
        if (professorRepository.readByUsernameEmail(professorDto.getUsername(), professorDto.geteMail())) {
            throw new AppException("username or e-mail is used");
        } else {
            professorRepository.create(professorDto);
        }
    }

    /**
     *
     * @param firstname
     * @param lastname
     * @return
     * @throws AppException
     */
    public ProfessorDto getProfessorDtoByName(String firstname, String lastname) throws AppException {
        ProfessorDto professorDto = professorRepository.readByName(firstname, lastname);
        if(professorDto == null) {
            throw new AppException("There is not Professor by name " + firstname + " " + lastname);
        }
        return professorDto;
    }

    /**
     *
     * @param professorId
     * @return
     * @throws AppException
     */
    public ProfessorDto getProfessorDtoById(int professorId) throws AppException {
        ProfessorDto professorDto = professorRepository.readById(professorId);
        if (professorDto == null) {
            throw new AppException("There is not Professor with this credential");
        }
        return professorDto;
    }

    /**
     *
     * @param professorDto
     */
    public void changeProfessorDto(ProfessorDto professorDto) {
        professorRepository.update(professorDto);
    }

    /**
     *
     * @param professorId
     */
    public void deleteProfessor(int professorId) {
        professorRepository.delete(professorId);
    }
}
