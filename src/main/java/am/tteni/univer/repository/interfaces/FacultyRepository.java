package am.tteni.univer.repository.interfaces;

import am.tteni.univer.common.model.Faculty;
import am.tteni.univer.common.model.University;
import am.tteni.univer.common.universityexception.UniversityAppException;

/**
 * Created by Narek on 18.11.2016.
 */
public interface FacultyRepository extends CRUD<Faculty>{

    Faculty create(Faculty faculty, University university);

//    boolean read(String facultyName, University university) throws UniversityAppException;

    Faculty read(String facultyName, University university) throws UniversityAppException;
}
