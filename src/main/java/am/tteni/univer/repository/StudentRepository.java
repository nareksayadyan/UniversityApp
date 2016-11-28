package am.tteni.univer.repository;

import am.tteni.univer.common.dto.GroupDto;
import am.tteni.univer.common.dto.StudentDto;

import java.util.ArrayList;

/**
 * Created by Narek on 09.11.2016.
 */
public interface StudentRepository extends CRUD<StudentDto> {

    boolean read(String username, String eMail);

    ArrayList<StudentDto> read(GroupDto group);
}
