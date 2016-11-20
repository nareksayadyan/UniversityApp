package am.tteni.univer.common.model;

import java.util.ArrayList;

/**
 * Created by Narek on 17.11.2016.
 */
public class Group {

    private int groupId;
    private int groupNumber;
    private ArrayList<Student> students;

    public Group(int groupNumber) {
        this.groupNumber = groupNumber;
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

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

}
