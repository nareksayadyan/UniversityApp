package am.tteni.univer.repository.interfaces;

import am.tteni.univer.common.model.Faculty;
import am.tteni.univer.common.model.Group;
import am.tteni.univer.common.universityexception.UniversityAppException;

/**
 * Created by Narek on 18.11.2016.
 */
public interface GroupRepository extends CRUD<Group> {

    Group create(Group group, Faculty faculty);

    Group read(int groupNumber, Faculty faculty) throws UniversityAppException;
}
