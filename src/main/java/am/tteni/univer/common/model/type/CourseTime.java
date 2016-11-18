package am.tteni.univer.common.model.type;

/**
 * Created by Narek on 17.11.2016.
 */
public enum CourseTime {

    FIRST(0),
    SECOND(1),
    THIRD(2),
    FOURTH(3);

    private final int value;
    CourseTime(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
