package am.tteni.univertest;

/**
 * Created by Narek on 10.11.2016.
 */
public class Test {
    public static void main(String[] args) {

        UniversityController universityController = new UniversityController();

//        universityController.addUniversity("Politexnik");

        University university = universityController.getUniversity("Politexnik");
        System.out.println(university.getUniversityName() + " # " + university.getUniversityId());
    }
}
