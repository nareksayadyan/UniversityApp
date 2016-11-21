package am.tteni.univertest;

import am.tteni.univer.common.model.type.StudySemester;
import am.tteni.univer.common.model.type.StudyYear;
import am.tteni.univer.common.universityexception.UniversityAppException;
import am.tteni.univer.controller.StudentController;

/**
 * Created by Narek on 10.11.2016.
 */
public class Test {
    public static void main(String[] args) {

        Test test = new Test();

        test.addStudent("Testik1", "Yan1", "test1", "pass1", "test1@a.a", StudyYear.FIRST, StudySemester.FIRST, 1);

    }
    public void addStudent(String firstName, String lastName, String username, String password, String eMail, StudyYear studyYear, StudySemester studySemester, int groupNumber) {
        StudentController studentController = new StudentController();
        try {
            studentController.addStudent(firstName, lastName, username, password, eMail, studyYear, studySemester);
        } catch (UniversityAppException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }


}
