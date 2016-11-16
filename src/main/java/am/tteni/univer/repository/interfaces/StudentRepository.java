package am.tteni.univer.repository.interfaces;

import am.tteni.univer.common.model.Student;

/**
 * Created by Narek on 09.11.2016.
 */
public interface StudentRepository extends CRUD<Student> {

    Student read(String username);

}
