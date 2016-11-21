package am.tteni.univer.controller;

import am.tteni.univer.common.model.Faculty;
import am.tteni.univer.common.model.Group;
import am.tteni.univer.repository.implementations.GroupRepositoryImpl;
import am.tteni.univer.repository.interfaces.GroupRepository;

/**
 * Created by Narek Sayadyan on 21.11.2016.
 */
public class GroupController {

    GroupRepository groupRepository = new GroupRepositoryImpl();

    public Group addGroup(int groupNumber, Faculty faculty) {
        Group group = null;
        if (isFreeGroupNumber(groupNumber, faculty)) {
            group = new Group(groupNumber);
            groupRepository.create(group, faculty);
        }
        return group;
    }

    public boolean isFreeGroupNumber(int groupNumber, Faculty faculty) {
        return groupRepository.read(groupNumber, faculty) == null;
    }

//    public Group getGroup(int groupNumber, Faculty faculty) {
//        Group group = groupRepository.read(new Group(groupNumber), faculty);
//        return group;
//    }
}

