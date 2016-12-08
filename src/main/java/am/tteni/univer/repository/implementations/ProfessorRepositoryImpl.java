package am.tteni.univer.repository.implementations;

import am.tteni.univer.common.dto.ProfessorDto;
import am.tteni.univer.repository.ProfessorRepository;
//import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Narek Sayadyan on 10.11.2016.
 */
public class ProfessorRepositoryImpl implements ProfessorRepository {

    private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/universityapp?autoReconnect=true&useSSL=false";
    private static final String DB_USER = "java";
    private static final String DB_PASSWORD = "java";

    @Override
    public boolean readByUsernameEmail(String username, String eMail) {
        return false;
    }

    @Override
    public ProfessorDto create(ProfessorDto obj) {
        String sql = "INSERT INTO professor "
                + "(firstname, lastname, username, password, e_mail)"
                + " VALUES (?, ?, ?, ?, ?)";
        try (Connection con = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)){

            ps.setString(1, obj.getFirstname());
            ps.setString(2, obj.getLastname());
            ps.setString(3, obj.getUsername());
            ps.setString(4, obj.getPassword());
            ps.setString(5, obj.geteMail());

            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public ProfessorDto read(ProfessorDto obj) {
        return null;
    }

    @Override
    public ProfessorDto update(ProfessorDto obj) {
        return null;
    }

    @Override
    public void delete(ProfessorDto obj) {

    }

    @Override
    public ProfessorDto readByName(String firstname, String lastname) {
        return null;
    }

    @Override
    public ProfessorDto readById(int professorId) {
        return null;
    }
}
