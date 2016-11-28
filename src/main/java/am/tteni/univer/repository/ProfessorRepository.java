package am.tteni.univer.repository;

import am.tteni.univer.common.dto.ProfessorDto;

/**
 * Created by Narek Sayadyan on 10.11.2016.
 */
public interface ProfessorRepository extends CRUD<ProfessorDto> {

    boolean read(String username, String eMail);

}
