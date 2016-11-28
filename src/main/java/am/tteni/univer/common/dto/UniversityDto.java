package am.tteni.univer.common.dto;

/**
 * Created by Narek on 24.11.2016.
 */
public class UniversityDto {

    private int universityId;
    private String name;
    private String city;
    private String region;
    private String address;
    private String phone;
    private String zipCode;
    private int RectorId;
    private int firstProRectorId;
    private int secondProRectorId;

    public UniversityDto() {
    }

    public UniversityDto(int universityId, String name, String city, String region, String address, String phone, String zipCode, int rectorId, int firstProRectorId, int secondProRectorId) {
        this.universityId = universityId;
        this.name = name;
        this.city = city;
        this.region = region;
        this.address = address;
        this.phone = phone;
        this.zipCode = zipCode;
        RectorId = rectorId;
        this.firstProRectorId = firstProRectorId;
        this.secondProRectorId = secondProRectorId;
    }

    public int getUniversityId() {
        return universityId;
    }

    public void setUniversityId(int universityId) {
        this.universityId = universityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getRectorId() {
        return RectorId;
    }

    public void setRectorId(int rectorId) {
        RectorId = rectorId;
    }

    public int getFirstProRectorId() {
        return firstProRectorId;
    }

    public void setFirstProRectorId(int firstProRectorId) {
        this.firstProRectorId = firstProRectorId;
    }

    public int getSecondProRectorId() {
        return secondProRectorId;
    }

    public void setSecondProRectorId(int secondProRectorId) {
        this.secondProRectorId = secondProRectorId;
    }
}
