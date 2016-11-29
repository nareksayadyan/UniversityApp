package am.tteni.univer.repository.implementations;

import am.tteni.univer.common.dto.UniversityDto;
import am.tteni.univer.repository.UniversityDtoRepository;

import java.sql.*;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public class UniversityDtoRepositoryImpl implements UniversityDtoRepository {

    private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/university?autoReconnect=true&useSSL=false";
    private static final String DB_USER = "java";
    private static final String DB_PASSWORD = "java";

    @Override
    public UniversityDto create(UniversityDto obj) {
        String sql = "INSERT INTO university "
                + "(university_id, name, city, region, address, phone, "
                + "zip_code, rector_id, first_prorector_id, second_prorector_id) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, obj.getUniversityId());
            ps.setString(2, obj.getName());
            ps.setString(3, obj.getCity());
            ps.setString(4, obj.getRegion());
            ps.setString(5, obj.getAddress());
            ps.setString(6, obj.getPhone());
            ps.setString(7, obj.getZipCode());
            ps.setInt(8, obj.getRectorId());
            ps.setInt(9, obj.getFirstProRectorId());
            ps.setInt(10, obj.getSecondProRectorId());

            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public UniversityDto read(UniversityDto obj) {
        return null;
    }

    @Override
    public UniversityDto read(String universityName) {
        UniversityDto university = null;
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
//                university = new UniversityDto(universityId, name);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return university;
    }
    @Override

    public UniversityDto read(int universityId) {
        return null;
    }

    @Override
    public UniversityDto update(UniversityDto obj) {
        return null;
    }

    @Override
    public void delete(UniversityDto obj) {

    }
}
