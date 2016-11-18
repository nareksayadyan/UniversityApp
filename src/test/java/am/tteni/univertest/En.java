package am.tteni.univertest;

import am.tteni.univer.common.model.type.CourseTime;
import am.tteni.univer.common.model.type.WeekDay;

import java.util.Currency;

/**
 * Created by Narek on 17.11.2016.
 */
public class En {
    public static void main(String[] args) {

        CourseTime courseTime = CourseTime.FIRST;

        WeekDay weekDay1 = WeekDay.MONDAY;
        WeekDay weekDay2 = WeekDay.FRIDAY;

        weekDay1 = WeekDay.TUESDAY;

        System.out.println(weekDay1.getValue() + " ### " + weekDay2.getValue());
        System.out.println(weekDay1 + " ### " + weekDay2);

        for (WeekDay aaa: WeekDay.values()) {
            System.out.println(aaa);
        }
    }
}
