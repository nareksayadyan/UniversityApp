package repository.interfaces;

import common.model.Student;

/**
 * Created by Narek on 09.11.2016.
 */
public interface UserRepositoryInterface extends CRUD<Student> {

    Student read(String username);

}
