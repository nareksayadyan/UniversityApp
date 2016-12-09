package am.tteni.univer.service;
package am.tteni.univer.service;

import am.tteni.univer.common.appexception.AppException;
import am.tteni.univer.common.dto.CourseDto;
import am.tteni.univer.common.dto.GroupDto;
import am.tteni.univer.common.dto.ProfessorDto;
import am.tteni.univer.common.dto.type.CourseTime;
import am.tteni.univer.common.dto.type.WeekDay;
import am.tteni.univer.repository.implementations.CourseRepositoryImpl;
import am.tteni.univer.repository.CourseRepository;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public class CourseDtoService {

    CourseRepository courseRepository = new CourseRepositoryImpl();

    /**
     * Adding CourseDto to database.
     * @param courseDto
     * @throws AppException
     */
    public void addCourseDto(CourseDto courseDto) throws AppException {
        CourseDto courseDto = null;
        if (auditoriumIsFree(auditoriumNumber, weekDay, courseTime)) {
            course = new CourseDto(subject, auditoriumNumber, weekDay, courseTime);
            courseRepository.create(course);
        } else {
            throw new AppException("Au");
        }
        return course.getCourseId();
    }

    public int addProfessorToCourse(int professorId, int courseId) {
        if (professorIsFree(professor, course)){
            course.setProfessor(professor);
            courseRepository.update(course);
        }
        return course;
    }

    public void addGroupToCourse(GroupDto groupId, CourseDto courseId) {
        courseRepository.create(groupId, courseId);
    }

    private void deleteGroupFromCourse(int groupId, int courseId) {
        courseRepository.delete(groupId, courseId);
    }

    private boolean auditoriumIsFree(int auditoriumNumber, WeekDay weekDay, CourseTime courseTime) {
        return courseRepository.read(auditoriumNumber, weekDay, courseTime);
    }

    private boolean professorIsFree(int professorId, WeekDay weekDay, CourseTime courseTime) {
        return courseRepository.read(professorId, weekDay, courseTime);
    }
}
