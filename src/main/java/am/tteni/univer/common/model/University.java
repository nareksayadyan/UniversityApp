package am.tteni.univer.common.model;

/**
 * Created by Narek on 17.11.2016.
 */
public class University {

    private int universityId;
    private String universityName;

    public University(String universityName) {
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
}
