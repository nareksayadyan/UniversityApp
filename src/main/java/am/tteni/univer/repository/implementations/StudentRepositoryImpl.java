package am.tteni.univer.repository.implementations;

import am.tteni.univer.common.dto.GroupDto;
import am.tteni.univer.common.dto.StudentDto;
import am.tteni.univer.repository.StudentRepository;

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
    public ArrayList<StudentDto> read(GroupDto group) {
        return null;
    }

    @Override
    public StudentDto create(StudentDto obj) {

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
    public StudentDto read(StudentDto obj) {
        return null;
    }

    @Override
    public StudentDto update(StudentDto obj) {
        return null;
    }

    @Override
    public void delete(StudentDto obj) {

    }
}
