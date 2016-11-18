package am.tteni.univer.common.model.type;

/**
 * Created by Narek on 17.11.2016.
 */
public enum CourseTime {
    FIRST(1),
    SECOND(2),
    THIRD(3),
    FOURTH(4),
    FIFTH(5),
    SIXTH(6),
    SEVENTH(7);

    private int value;

    CourseTime(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
