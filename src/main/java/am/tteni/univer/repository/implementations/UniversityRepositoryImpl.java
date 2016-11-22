package am.tteni.univer.repository.implementations;

import am.tteni.univer.common.model.University;
import am.tteni.univer.repository.interfaces.UniversityRepository;

import java.sql.*;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public class UniversityRepositoryImpl implements UniversityRepository {

    private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/university?autoReconnect=true&useSSL=false";
    private static final String DB_USER = "java";
    private static final String DB_PASSWORD = "java";

    @Override
    public University read(String universityName) {
        University university = null;
        String sql = "SELECT university_id, name "
                + "FROM university "
                + "WHERE name = ?";
        try (Connection con = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, universityName);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int universityId = rs.getInt("university_id");
                String name = rs.getString("name");
                university = new University(universityId, name);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return university;
    }

    @Override
    public University create(University obj) {
        String sql = "INSERT INTO university "
                + "(name) "
                + "VALUES (?)";
        try (Connection con = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, obj.getUniversityName());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public University read(University obj) {
        return null;
    }

    @Override
    public University update(University obj) {
        return null;
    }

    @Override
    public void delete(University obj) {

    }
}
