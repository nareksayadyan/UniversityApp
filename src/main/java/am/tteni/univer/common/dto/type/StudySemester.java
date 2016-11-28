package am.tteni.univer.common.dto.type;

/**
 * Created by Narek Sayadyan on 10.11.2016.
 */
public enum StudySemester {
    FIRST(1),
    SECOND(2);

    private int value;

    StudySemester(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
