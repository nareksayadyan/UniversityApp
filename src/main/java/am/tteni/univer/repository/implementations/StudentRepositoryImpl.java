package am.tteni.univer.repository.implementations;

import am.tteni.univer.common.model.Group;
import am.tteni.univer.common.model.Student;
import am.tteni.univer.repository.interfaces.StudentRepository;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Narek on 09.11.2016.
 */
public class StudentRepositoryImpl implements StudentRepository {

    private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/university?autoReconnect=true&useSSL=false";
    private static final String DB_USER = "java";
    private static final String DB_PASSWORD = "java";

    @Override
    public boolean read(String username, String eMail) {
        return false;
    }

    @Override
    public ArrayList<Student> read(Group group) {
        return null;
    }

    @Override
    public Student create(Student obj) {

        String sql = "INSERT INTO student "
                + "(firstname, lastname, username, password, e_mail, study_year, study_semester) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(DB_CONNECTION);
             PreparedStatement ps = con.prepareStatement(sql)) {



            ps.execute();
        } catch (SQLException e) {

        }

        return null;
    }

    @Override
    public Student read(Student obj) {
        return null;
    }

    @Override
    public Student update(Student obj) {
        return null;
    }

    @Override
    public void delete(Student obj) {

    }
}
