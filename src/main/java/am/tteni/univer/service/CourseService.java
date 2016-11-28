package am.tteni.univer.service;

import am.tteni.univer.common.appexception.AppException;
import am.tteni.univer.common.dto.CourseDto;
import am.tteni.univer.repository.implementations.CourseRepositoryImpl;
import am.tteni.univer.repository.CourseRepository;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public class CourseService {

    CourseRepository courseRepository = new CourseRepositoryImpl();

    /**
     *
     * @param course
     * @return
     * @throws AppException
     */
    public int addCourse(CourseDto course) throws AppException {
        CourseDto course = null;
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

    public void addGroupToCourse(GroupDto group, CourseDto course) {
        courseRepository.create(group, course);
    }

    public void deleteGroupFromCourse(GroupDto group, CourseDto course) {
        courseRepository.delete(group, course);
    }

    boolean auditoriumIsFree(int auditoriumNumber, WeekDay weekDay, CourseTime courseTime) {
        return courseRepository.read(auditoriumNumber, weekDay, courseTime);
    }

    boolean professorIsFree(ProfessorDto professor, CourseDto course) {
        return courseRepository.read(professor, course);
    }
}
