package am.tteni.univer.controller;

import am.tteni.univer.common.model.Faculty;
import am.tteni.univer.common.model.University;
import am.tteni.univer.repository.implementations.FacultyRepositoryImpl;
import am.tteni.univer.repository.implementations.UniversityRepositoryImpl;
import am.tteni.univer.repository.interfaces.FacultyRepository;
import am.tteni.univer.repository.interfaces.UniversityRepository;

import java.util.ArrayList;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public class UniversityController {

    UniversityRepository universityRepository = new UniversityRepositoryImpl();
    FacultyRepository facultyRepository = new FacultyRepositoryImpl();

    public University addUniversity(String universityName) {
        University university = new University(universityName);
        universityRepository.create(university);
        return university;
    }

    public University getUniversity(String universityName) {
        return universityRepository.read(universityName);
    }

    public ArrayList<Faculty> getFacultiesInUniversity(University university) {
        university.setFaculties(facultyRepository.read(university));
        return university.getFaculties();
    }
}
