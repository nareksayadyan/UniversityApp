package am.tteni.univer.common.model;

import java.util.ArrayList;

/**
 * Created by Narek on 17.11.2016.
 */
public class University {

    private int universityId;
    private String universityName;
    private ArrayList<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
    }

    public University(int universityId, String universityName) {
        this.universityId = universityId;
        this.universityName = universityName;
    }

    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId){
        this.universityId = universityId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(ArrayList<Faculty> faculties) {
        this.faculties = faculties;
    }
}
