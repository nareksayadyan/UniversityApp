package am.tteni.univer.repository.interfaces;

import am.tteni.univer.common.model.Course;
import am.tteni.univer.common.model.Group;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public interface CourseReposirory extends CRUD<Course> {

    void createLesson(Group group, Course course);


}
