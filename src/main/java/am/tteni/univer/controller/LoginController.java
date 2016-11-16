package am.tteni.univer.controller;

import am.tteni.univer.common.model.Student;
import am.tteni.univer.repository.implementations.StudentRepositoryImpl;
import am.tteni.univer.repository.interfaces.StudentRepository;

/**
 * Created by Narek on 09.11.2016.
 */
public class LoginController {

//    arji ardyoq mi hat abstract kam interface User sargel, u Studentn
//    u Professor impl kam extand anel dranic vor login method@ mi hat grem
//    veradarcnox tipn el User heto instanseof-ov kjogem ova login exel??


//    kam sax nuyn filderov user tox linen, heto (klini UserCategory) amen mi userin mi urish
//    tableum ktam kam stud kam prof kam staff arden amen meki arandzin
//    tableum kunenan iranc arandznahatuk filder

    StudentRepository studentRepository = new StudentRepositoryImpl();

    public Student login(String username, String password) {

        Student student = studentRepository.read(new Student(username, password));
        if (student == null) {
            return null;
        } else {
            return student;
        }

    }

}
