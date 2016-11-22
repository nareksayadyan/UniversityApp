package am.tteni.univer.repository.interfaces;

import am.tteni.univer.common.model.Faculty;
import am.tteni.univer.common.model.Group;

import java.util.ArrayList;

/**
 * Created by Narek on 18.11.2016.
 */
public interface GroupRepository extends CRUD<Group> {

    Group create(Group group, Faculty faculty);

    Group read(int groupNumber);

    ArrayList<Group> read(Faculty faculty);
}
