package am.tteni.univer.controller;

import am.tteni.univer.common.model.Faculty;
import am.tteni.univer.common.model.University;
import am.tteni.univer.common.universityexception.UniversityAppException;
import am.tteni.univer.repository.implementations.FacultyRepositoryImpl;
import am.tteni.univer.repository.interfaces.FacultyRepository;

/**
 * Created by Narek Sayadyan on 21.11.2016.
 */
public class FacultyController {

    FacultyRepository facultyRepository = new FacultyRepositoryImpl();

    public Faculty createFaculty(String facultyName) {
        Faculty faculty = new Faculty(facultyName);
        return faculty;
    }

    public void addFacultyToUniversity(String facultyName, University university) throws UniversityAppException {
        if (isFreeFacultyName(facultyName, university)) {
            facultyRepository.create(createFaculty(facultyName), university);
        }
    }

    public boolean isFreeFacultyName(String facultyName, University university) throws UniversityAppException {
        return facultyRepository.read(facultyName, university) == null;
    }

    public Faculty getFaculty(String facultyName, University university) throws UniversityAppException {
        return facultyRepository.read(facultyName, university);
    }
}
