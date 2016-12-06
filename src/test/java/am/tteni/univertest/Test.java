package am.tteni.univertest;

import am.tteni.univer.common.appexception.AppException;
import am.tteni.univer.common.dto.UniversityDto;
import am.tteni.univer.service.UniversityDtoService;

/**
 * Created by Narek on 10.11.2016.
 */
public class Test {
    public static void main(String[] args) {

        UniversityDtoService universityDtoService = new UniversityDtoService();

        UniversityDto universityDto = new UniversityDto("Yerevan State University", "Yerevan",
                "Yerevan", "Aleq Manukyan 1", "+37410987654", "0082");

        try {
            universityDtoService.addUniversityDto(universityDto);
        } catch (AppException e) {
            System.out.println(e);
        }


    }
}
