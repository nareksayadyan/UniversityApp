package am.tteni.univer.repository.implementations;

import am.tteni.univer.common.model.Faculty;
import am.tteni.univer.common.model.Group;
import am.tteni.univer.common.universityexception.UniversityAppException;
import am.tteni.univer.repository.interfaces.GroupRepository;

/**
 * Created by Narek on 18.11.2016.
 */
public class GroupRepositoryImpl implements GroupRepository {

    @Override
    public Group read(int groupNumber, Faculty faculty) {
//        throw new UniversityAppException("Group number exist in this faculty");
        return null;
    }

    @Override
    public Group create(Group group, Faculty faculty) {
        return null;
    }

    @Override
    public Group create(Group obj) {
        return null;
    }

    @Override
    public Group read(Group obj) {
        return null;
    }

    @Override
    public Group update(Group obj) {
        return null;
    }

    @Override
    public void delete(Group obj) {

    }
}
