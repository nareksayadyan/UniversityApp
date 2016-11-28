package am.tteni.univer.common.dto;

/**
 * Created by Narek on 28.11.2016.
 */
public class GroupCourseMapDto {

    private int groupCourseMapDtoId;
    private int groupId;
    private int courseId;

    public GroupCourseMapDto() {
    }

    public GroupCourseMapDto(int groupCourseMapDtoId, int groupId, int courseId) {
        this.groupCourseMapDtoId = groupCourseMapDtoId;
        this.groupId = groupId;
        this.courseId = courseId;
    }

    public int getGroupCourseMapDtoId() {
        return groupCourseMapDtoId;
    }

    public void setGroupCourseMapDtoId(int groupCourseMapDtoId) {
        this.groupCourseMapDtoId = groupCourseMapDtoId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
