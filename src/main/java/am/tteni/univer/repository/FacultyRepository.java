package am.tteni.univer.repository;

import am.tteni.univer.common.dto.FacultyDto;
import am.tteni.univer.common.dto.UniversityDto;

import java.util.ArrayList;

/**
 * Created by Narek on 18.11.2016.
 */
public interface FacultyRepository extends CRUD<FacultyDto>{

    FacultyDto create(FacultyDto faculty, UniversityDto universityDto);

    FacultyDto read(String facultyName, UniversityDto universityDto);

    ArrayList<FacultyDto> read(UniversityDto universityDto);
}
