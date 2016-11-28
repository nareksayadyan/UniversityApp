package am.tteni.univer.common.bean;

import am.tteni.univer.common.dto.FacultyDto;
import am.tteni.univer.common.dto.GroupDto;

import java.util.List;

/**
 * Created by Narek on 23.11.2016.
 */
public class FacultyBean {
    FacultyDto facultyDto;
    List<GroupDto> groupList;

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public List<GroupDto> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<GroupDto> groupList) {
        this.groupList = groupList;
    }
}
