package am.tteni.univer.common.dto.type;

/**
 * Created by Narek on 10.11.2016.
 */
public enum StudyYear {
    FIRST(1),
    SECOND(2),
    THIRD(3),
    FOURTH(4);

    private int value;

    StudyYear(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
