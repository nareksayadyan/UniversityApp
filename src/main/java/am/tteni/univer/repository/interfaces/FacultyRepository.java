package am.tteni.univer.repository.interfaces;

import am.tteni.univer.common.model.Faculty;
import am.tteni.univer.common.model.University;

import java.util.ArrayList;

/**
 * Created by Narek on 18.11.2016.
 */
public interface FacultyRepository extends CRUD<Faculty>{

    Faculty create(Faculty faculty, University university);

    Faculty read(String facultyName, University university);

    ArrayList<Faculty> read(University university);
}
