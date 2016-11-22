package am.tteni.univer.repository.interfaces;

import am.tteni.univer.common.model.Professor;

/**
 * Created by Narek Sayadyan on 10.11.2016.
 */
public interface ProfessorRepository extends CRUD<Professor> {

    boolean read(String username, String eMail);

}
