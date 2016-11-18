package am.tteni.univer.common.model;

/**
 * Created by Narek on 17.11.2016.
 */
public class Group {

    private int groupId;
    private int number;
    private int facultyId;

    public Group(int number) {
        this.number = number;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }
}
