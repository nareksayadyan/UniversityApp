package am.tteni.univer.repository.implementations;

import am.tteni.univer.common.dto.ProfessorDto;
import am.tteni.univer.repository.ProfessorRepository;

import java.sql.*;

/**
 * Created by Narek Sayadyan on 10.11.2016.
 */
public class ProfessorRepositoryImpl implements ProfessorRepository {

    private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/universityapp?autoReconnect=true&useSSL=false";
    private static final String DB_USER = "java";
    private static final String DB_PASSWORD = "java";

    @Override
    public boolean readByUsernameEmail(String username, String eMail) {
        boolean r = false;
        String sql = "SELECT * "
                + "FROM professor "
                + "WHERE username = ? AND e_mail = ?";
        try (Connection con = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)){

            ps.setString(1, username);
            ps.setString(2, eMail);
            r = ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return r;
    }

    /**
     *
     * @param firstname
     * @param lastname
     * @return
     */
    @Override
    public ProfessorDto readByName(String firstname, String lastname) {
        ProfessorDto professorDto = null;
        String sql = "SELECT * "
                + "FROM professor "
                + "WHERE firstname = ? AND lastname = ?";
        try (Connection con = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)){

            ps.setString(1, firstname);
            ps.setString(2, lastname);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                professorDto = createProfessorDtoFromResultSet(rs);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return professorDto;
    }

    /**
     *
     * @param professorId
     * @return
     */
    @Override
    public ProfessorDto readById(int professorId) {
        ProfessorDto professorDto = null;
        String sql = "SELECT * "
                + "FROM professor "
                + "WHERE professor_id = ?";
        try (Connection con = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            PreparedStatement ps = con.prepareStatement(sql)){

            ps.setInt(1, professorId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                professorDto = createProfessorDtoFromResultSet(rs);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return professorDto;
    }

    /**
     *
     * @param obj
     * @return
     */
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

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public ProfessorDto update(ProfessorDto obj) {
        String sql = "UPDATE professor "
                + "SET firstname = ?, lastname = ?, username = ?, password = ?, e_mail = ? "
                + "WHERE professor_id = ?";
        try (Connection con = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            PreparedStatement ps = con.prepareStatement(sql)){

            ps.setString(1, obj.getFirstname());
            ps.setString(2, obj.getLastname());
            ps.setString(3, obj.getUsername());
            ps.setString(4, obj.getPassword());
            ps.setString(5, obj.geteMail());
            ps.setInt(6, obj.getProfessorId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void delete(ProfessorDto obj) {

    }

    /**
     *
     * @param professorId
     */
    @Override
    public void delete(int professorId) {
        String sql = "DELETE FROM professor "
                + " WHERE professor_id = ?";
        try (Connection con = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            PreparedStatement ps = con.prepareStatement(sql)){

            ps.setInt(1, professorId);
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    /**
     *
     * @param rs
     * @return
     */
    private ProfessorDto createProfessorDtoFromResultSet(ResultSet rs) {
        ProfessorDto professorDto = null;
        try {
            int professorId = rs.getInt("professor_id");
            String firstname = rs.getString("firstname");
            String lastname = rs.getString("lastname");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String eMail = rs.getString("e_mail");
            professorDto = new ProfessorDto(professorId, firstname, lastname, username, password, eMail);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return professorDto;
    }
}
