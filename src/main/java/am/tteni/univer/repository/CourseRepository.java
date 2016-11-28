package am.tteni.univer.repository;

import am.tteni.univer.common.dto.CourseDto;
import am.tteni.univer.common.dto.GroupDto;
import am.tteni.univer.common.dto.ProfessorDto;
import am.tteni.univer.common.dto.type.CourseTime;
import am.tteni.univer.common.dto.type.WeekDay;

import java.util.ArrayList;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public interface CourseRepository extends CRUD<CourseDto> {

    void create(GroupDto group, CourseDto course);

    boolean read(int auditoriumNumber, WeekDay weekDay, CourseTime courseTime);

    boolean read(ProfessorDto professor, CourseDto course);

    ArrayList<CourseDto> read(GroupDto group);

    void delete(GroupDto group, CourseDto course);
}
