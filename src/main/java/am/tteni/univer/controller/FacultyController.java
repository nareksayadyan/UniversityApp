package am.tteni.univer.controller;

import am.tteni.univer.common.model.Faculty;
import am.tteni.univer.common.model.Group;
import am.tteni.univer.common.model.University;
import am.tteni.univer.common.universityexception.UniversityAppException;
import am.tteni.univer.repository.implementations.FacultyRepositoryImpl;
import am.tteni.univer.repository.implementations.GroupRepositoryImpl;
import am.tteni.univer.repository.interfaces.FacultyRepository;
import am.tteni.univer.repository.interfaces.GroupRepository;

import java.util.ArrayList;

/**
 * Created by Narek Sayadyan on 21.11.2016.
 */
public class FacultyController {

    FacultyRepository facultyRepository = new FacultyRepositoryImpl();
    GroupRepository groupRepository = new GroupRepositoryImpl();

    public Faculty addFacultyToUniversity(String facultyName, University university) throws UniversityAppException {
        Faculty faculty = null;
        if (isFreeFacultyName(facultyName, university)) {
            faculty = new Faculty(facultyName);
            facultyRepository.create(faculty, university);
        }
        return faculty;
    }

    public boolean isFreeFacultyName(String facultyName, University university) throws UniversityAppException {
        return facultyRepository.read(facultyName, university) == null;
    }

    public Faculty getFaculty(String facultyName, University university) throws UniversityAppException {
        return facultyRepository.read(facultyName, university);
    }

    public ArrayList<Group> getGroupsInFaculty(Faculty faculty) {
        faculty.setGroups(groupRepository.read(faculty));
        return faculty.getGroups();
    }
}
