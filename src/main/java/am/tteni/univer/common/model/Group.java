package am.tteni.univer.common.model;

import java.util.ArrayList;

/**
 * Created by Narek on 17.11.2016.
 */
public class Group {

    private int groupId;
    private int number;
    private ArrayList<Student> students;

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

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

}
