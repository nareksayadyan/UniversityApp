package am.tteni.univer.common.dto;

/**
 * Created by Narek on 23.11.2016.
 */
public class FacultyDto {

    private int facultyId;
    private String name;
    private int universityId;
    private int buildingCorpus;
    private int decanId;
    private int proDecanId;
    private int decanRoomNumber;
    private String phon;

    public FacultyDto() {
    }

    public FacultyDto(int facultyId, String name, int universityId, int buildingCorpus, int decanId, int proDecanId, int decanRoomNumber, String phon) {
        this.facultyId = facultyId;
        this.name = name;
        this.universityId = universityId;
        this.buildingCorpus = buildingCorpus;
        this.decanId = decanId;
        this.proDecanId = proDecanId;
        this.decanRoomNumber = decanRoomNumber;
        this.phon = phon;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    public int getBuildingCorpus() {
        return buildingCorpus;
    }

    public void setBuildingCorpus(int buildingCorpus) {
        this.buildingCorpus = buildingCorpus;
    }

    public int getDecanId() {
        return decanId;
    }

    public void setDecanId(int decanId) {
        this.decanId = decanId;
    }

    public int getProDecanId() {
        return proDecanId;
    }

    public void setProDecanId(int proDecanId) {
        this.proDecanId = proDecanId;
    }

    public int getDecanRoomNumber() {
        return decanRoomNumber;
    }

    public void setDecanRoomNumber(int decanRoomNumber) {
        this.decanRoomNumber = decanRoomNumber;
    }

    public String getPhon() {
        return phon;
    }

    public void setPhon(String phon) {
        this.phon = phon;
    }
}
