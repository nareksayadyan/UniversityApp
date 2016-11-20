package am.tteni.univer.controller;

import am.tteni.univer.common.model.Faculty;
import am.tteni.univer.common.model.Group;
import am.tteni.univer.common.model.University;
import am.tteni.univer.common.universityexception.UniversityAppException;
import am.tteni.univer.repository.implementations.FacultyRepositoryImpl;
import am.tteni.univer.repository.implementations.GroupRepositoryImpl;
import am.tteni.univer.repository.implementations.UniversityRepositoryImpl;
import am.tteni.univer.repository.interfaces.FacultyRepository;
import am.tteni.univer.repository.interfaces.GroupRepository;
import am.tteni.univer.repository.interfaces.UniversityRepository;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public class UniversityController {

    UniversityRepository universityRepository = new UniversityRepositoryImpl();
    FacultyRepository facultyRepository = new FacultyRepositoryImpl();
    GroupRepository groupRepository = new GroupRepositoryImpl();

    public University createUniversity(String universityName) {
        University university = new University(universityName);
        universityRepository.create(university);
        return university;
    }

    public Faculty createFaculty(String facultyName) {
        Faculty faculty = new Faculty(facultyName);
        return faculty;
    }

    public Group createGroup(int groupNumber) {
        Group group = new Group(groupNumber);
        return group;
    }

    public void addFacultyToUniversity(String facultyName, University university) throws UniversityAppException {
        if (isFreeFacultyName(facultyName, university)) {
            facultyRepository.create(createFaculty(facultyName), university);
        }
    }

    public boolean isFreeFacultyName(String facultyName, University university) throws UniversityAppException {
        return facultyRepository.read(facultyName, university) == null;
    }

    public void addGroupToFaculty(int groupNumber, Faculty faculty) throws UniversityAppException{
        if (isFreeGroupNumber(groupNumber, faculty)) {
            groupRepository.create(createGroup(groupNumber), faculty);
        }
    }

    public boolean isFreeGroupNumber(int groupNumber, Faculty faculty) throws UniversityAppException {
        return groupRepository.read(groupNumber, faculty) == null;
    }

    public University getUniversity(String universityName) {
        return universityRepository.read(universityName);
    }

    public Faculty getFaculty(String facultyName, University university) throws UniversityAppException {
        return facultyRepository.read(facultyName, university);
    }

    public Group getGroup(int groupNumber, Faculty faculty) throws UniversityAppException {
        return groupRepository.read(groupNumber, faculty);
    }
}
