package am.tteni.univer.common.dto;

/**
 * Created by Narek on 17.11.2016.
 */
public class GroupDto {

    private int groupId;
    private int groupNumber;
    private int facultyId;

    public GroupDto() {
    }

    public GroupDto(int groupId, int groupNumber, int facultyId) {
        this.groupId = groupId;
        this.groupNumber = groupNumber;
        this.facultyId = facultyId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }
}
