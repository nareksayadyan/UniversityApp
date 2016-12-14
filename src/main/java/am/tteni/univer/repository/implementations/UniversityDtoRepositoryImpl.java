package am.tteni.univer.repository.implementations;

import am.tteni.univer.common.dto.UniversityDto;
import am.tteni.univer.repository.UniversityDtoRepository;

import java.sql.*;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public class UniversityDtoRepositoryImpl implements UniversityDtoRepository {

    private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/universityapp?autoReconnect=true&useSSL=false";
    private static final String DB_USER = "java";
    private static final String DB_PASSWORD = "java";

    /**
     *
     * @param universityDto
     * @return
     */
    @Override
    public UniversityDto create(UniversityDto universityDto) {
        String sql = "INSERT INTO university "
                + "(name, city, region, address, phone, "
                + "zip_code, rector_id, first_prorector_id, second_prorector_id) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, universityDto.getName());
            ps.setString(2, universityDto.getCity());
            ps.setString(3, universityDto.getRegion());
            ps.setString(4, universityDto.getAddress());
            ps.setString(5, universityDto.getPhone());
            ps.setString(6, universityDto.getZipCode());
            ps.setInt(7, universityDto.getRectorId());
            ps.setInt(8, universityDto.getFirstProRectorId());
            ps.setInt(9, universityDto.getSecondProRectorId());

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

    /**
     *
     * @param universityName
     * @return
     */
    @Override
    public UniversityDto readByName(String universityName) {
        UniversityDto university = null;
        String sql = "SELECT * "
                + "FROM university "
                + "WHERE name = ?";
        try (Connection con = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, universityName);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int universityId = rs.getInt("university_id");
                String name = rs.getString("name");
                String city = rs.getString("city");
                String region = rs.getString("region");
                String address = rs.getString("address");
                String phone = rs.getString("phone");
                String zipCode = rs.getString("zip_code");
                int RectorId = rs.getInt("rector_id");
                int firstProRectorId = rs.getInt("first_prorector_id");
                int secondProRectorId = rs.getInt("second_prorector_id");
                university = new UniversityDto(universityId, name, city, region, address, phone, zipCode, RectorId, firstProRectorId, secondProRectorId);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return university;
    }

    /**
     *
     * @param universityId
     * @return
     */
    @Override
    public UniversityDto readById(int universityId) {
        UniversityDto university = null;
        String sql = "SELECT * "
                + "FROM university "
                + "WHERE university_id = ?";
        try (Connection con = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, universityId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int universityId1 = rs.getInt("university_id");
                String name = rs.getString("name");
                String city = rs.getString("city");
                String region = rs.getString("region");
                String address = rs.getString("address");
                String phone = rs.getString("phone");
                String zipCode = rs.getString("zip_code");
                int RectorId = rs.getInt("rector_id");
                int firstProRectorId = rs.getInt("first_prorector_id");
                int secondProRectorId = rs.getInt("second_prorector_id");
                university = new UniversityDto(universityId1, name, city, region, address, phone, zipCode, RectorId, firstProRectorId, secondProRectorId);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return university;
    }

    /**
     *
     * @param universityDto
     * @return
     */
    @Override
    public UniversityDto update(UniversityDto universityDto) {
        String sql = "UPDATE university "
                + "SET name = ?, city = ?, region = ?, address = ?, phone = ?, zip_code = ?, "
                + "rector_id = ?, first_prorector_id = ?, second_prorector_id = ? "
                + "WHERE university_id = ?";
        try (Connection con = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)){

            ps.setString(1, universityDto.getName());
            ps.setString(2, universityDto.getCity());
            ps.setString(3, universityDto.getRegion());
            ps.setString(4, universityDto.getAddress());
            ps.setString(5, universityDto.getPhone());
            ps.setString(6, universityDto.getZipCode());
            ps.setInt(7, universityDto.getRectorId());
            ps.setInt(8, universityDto.getFirstProRectorId());
            ps.setInt(9, universityDto.getSecondProRectorId());
            ps.setInt(10, universityDto.getUniversityId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void delete(UniversityDto obj) {

    }

    /**
     *
     * @param universityId
     * @param professorId
     */
    @Override
    public void setRector(int universityId, int professorId) {
        String sql = "UPDATE university " +
                "SET rector_id = ? " +
                "WHERE university_id = ?";

        try (Connection con = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, professorId);
            ps.setInt(2, universityId);
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    /**
     *
     * @param universityId
     * @param professorId
     */
    @Override
    public void setFirstProRector(int universityId, int professorId) {
        String sql = "UPDATE university " +
                "SET first_prorector_id = ? " +
                "WHERE university_id = ?";

        try (Connection con = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, professorId);
            ps.setInt(2, universityId);
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    /**
     *
     * @param universityId
     * @param professorId
     */
    @Override
    public void setSecondProRector(int universityId, int professorId) {
        String sql = "UPDATE university " +
                "SET second_prorector_id = ? " +
                "WHERE university_id = ?";

        try (Connection con = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, professorId);
            ps.setInt(2, universityId);
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
