package am.tteni.univer.repository.interfaces;

import am.tteni.univer.common.model.University;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public interface UniversityRepository extends CRUD<University> {

    University read(String universityName);
}
