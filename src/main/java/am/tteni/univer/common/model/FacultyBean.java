package am.tteni.univer.common.model;

import am.tteni.univer.common.FacultyDto;

import java.util.List;

/**
 * Created by Narek on 23.11.2016.
 */
public class FacultyBean {
    FacultyDto facultyDto;
    List<Group> groupList;

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }
}
