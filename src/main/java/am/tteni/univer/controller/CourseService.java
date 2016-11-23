package am.tteni.univer.controller;

import am.tteni.univer.common.model.Course;
import am.tteni.univer.common.model.Group;
import am.tteni.univer.common.model.Professor;
import am.tteni.univer.common.model.type.CourseTime;
import am.tteni.univer.common.model.type.WeekDay;
import am.tteni.univer.common.universityexception.UniversityAppException;
import am.tteni.univer.repository.implementations.CourseRepositoryImpl;
import am.tteni.univer.repository.interfaces.CourseRepository;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public class CourseService {

    CourseRepository courseRepository = new CourseRepositoryImpl();

    /**
     *
     * @param course
     * @return
     * @throws UniversityAppException
     */
    public int addCourse(Course course) throws UniversityAppException {
        Course course = null;
        if (auditoriumIsFree(auditoriumNumber, weekDay, courseTime)) {
            course = new Course(subject, auditoriumNumber, weekDay, courseTime);
            courseRepository.create(course);
        } else {
            throw new UniversityAppException("Au");
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

    public void addGroupToCourse(Group group, Course course) {
        courseRepository.create(group, course);
    }

    public void deleteGroupFromCourse(Group group, Course course) {
        courseRepository.delete(group, course);
    }

    boolean auditoriumIsFree(int auditoriumNumber, WeekDay weekDay, CourseTime courseTime) {
        return courseRepository.read(auditoriumNumber, weekDay, courseTime);
    }

    boolean professorIsFree(Professor professor, Course course) {
        return courseRepository.read(professor, course);
    }
}
