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

    public FacultyDto getFaculty() {
        return facultyDto;
    }

    public void setFaculty(FacultyDto faculty) {
        this.facultyDto = faculty;
    }

    public List<GroupDto> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<GroupDto> groupList) {
        this.groupList = groupList;
    }
}
