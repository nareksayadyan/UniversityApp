package am.tteni.univer.repository.implementations;

import am.tteni.univer.common.dto.CourseDto;
import am.tteni.univer.common.dto.GroupDto;
import am.tteni.univer.common.dto.ProfessorDto;
import am.tteni.univer.common.dto.type.CourseTime;
import am.tteni.univer.common.dto.type.WeekDay;
import am.tteni.univer.repository.CourseRepository;

import java.util.ArrayList;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public class CourseRepositoryImpl implements CourseRepository {

    @Override
    public void create(GroupDto group, CourseDto course) {

    }

    @Override
    public boolean read(int auditoriumNumber, WeekDay weekDay, CourseTime courseTime) {
        return false;
    }

    @Override
    public boolean read(ProfessorDto professor, CourseDto course) {
        return false;
    }

    @Override
    public ArrayList<CourseDto> read(GroupDto group) {
        return null;
    }

    @Override
    public void delete(GroupDto group, CourseDto course) {

    }

    @Override
    public CourseDto create(CourseDto obj) {
        return null;
    }

    @Override
    public CourseDto read(CourseDto obj) {
        return null;
    }

    @Override
    public CourseDto update(CourseDto obj) {
        return null;
    }

    @Override
    public void delete(CourseDto obj) {

    }
}
