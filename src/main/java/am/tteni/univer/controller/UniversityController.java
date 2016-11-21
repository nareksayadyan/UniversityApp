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

    public University addUniversity(String universityName) {
        University university = new University(universityName);
        universityRepository.create(university);
        return university;
    }

    public University getUniversity(String universityName) {
        return universityRepository.read(universityName);
    }
}
