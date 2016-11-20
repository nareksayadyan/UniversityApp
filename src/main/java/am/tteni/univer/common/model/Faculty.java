package am.tteni.univer.common.model;

import java.util.ArrayList;

/**
 * Created by Narek on 17.11.2016.
 */
public class Faculty {

    private int facultyId;
    private String facultyName;
    private ArrayList<Group> groups;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }
}
