package am.tteni.univer.common.dto.type;

/**
 * Created by Narek on 17.11.2016.
 */
public enum WeekDay {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5);

    private int value;

    WeekDay(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
