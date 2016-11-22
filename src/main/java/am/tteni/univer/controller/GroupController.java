package am.tteni.univer.controller;

import am.tteni.univer.common.model.Faculty;
import am.tteni.univer.common.model.Group;
import am.tteni.univer.common.model.Student;
import am.tteni.univer.repository.implementations.GroupRepositoryImpl;
import am.tteni.univer.repository.implementations.StudentRepositoryImpl;
import am.tteni.univer.repository.interfaces.GroupRepository;
import am.tteni.univer.repository.interfaces.StudentRepository;

import java.util.ArrayList;

/**
 * Created by Narek Sayadyan on 21.11.2016.
 */
public class GroupController {

    GroupRepository groupRepository = new GroupRepositoryImpl();
    StudentRepository studentRepository = new StudentRepositoryImpl();

    public Group addGroupToUniversity(int groupNumber, Faculty faculty) {
        Group group = null;
        if (isFreeGroupNumber(groupNumber)) {
            group = new Group(groupNumber);
            groupRepository.create(group, faculty);
        }
        return group;
    }

    public boolean isFreeGroupNumber(int groupNumber) {
        return groupRepository.read(groupNumber) == null;
    }

    public Group getGroup(int groupNumber) {
        return groupRepository.read(groupNumber);
    }

    public ArrayList<Student> getStudentsInGroup(Group group) {
        group.setStudents(studentRepository.read(group));
        return group.getStudents();
    }
}

