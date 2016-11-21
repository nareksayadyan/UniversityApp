package am.tteni.univer.repository.interfaces;

import am.tteni.univer.common.model.Group;
import am.tteni.univer.common.model.Student;
import am.tteni.univer.common.universityexception.UniversityAppException;

/**
 * Created by Narek on 09.11.2016.
 */
public interface StudentRepository extends CRUD<Student> {

    boolean read(String username, String eMail) throws UniversityAppException;
}
