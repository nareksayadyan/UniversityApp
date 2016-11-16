package am.tteni.univertest;

import am.tteni.univer.controller.RegisterController;

/**
 * Created by Narek on 10.11.2016.
 */
public class Test {
    public static void main(String[] args) {

        Test test = new Test();
        test.register("testik1", "passtest1");

    }
    public void register(String u, String p) {
        RegisterController registerController = new RegisterController();
//        try {
//            registerController.registerStudent(u, p);
//        } catch (UniversityAppException e) {
//            e.printStackTrace();
//            System.out.println(e);
//        }
    }
}
