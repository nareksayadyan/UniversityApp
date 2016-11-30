package am.tteni.univertest;

import am.tteni.univer.common.appexception.AppException;
import am.tteni.univer.common.dto.ProfessorDto;
import am.tteni.univer.common.dto.UniversityDto;
import am.tteni.univer.service.ProfessorDtoService;
import am.tteni.univer.service.UniversityDtoService;

/**
 * Created by Narek on 10.11.2016.
 */
public class Test {
    public static void main(String[] args) {

        UniversityDtoService universityDtoService = new UniversityDtoService();
        ProfessorDtoService professorDtoService = new ProfessorDtoService();

        ProfessorDto professorDto1 = new ProfessorDto();
        ProfessorDto professorDto2 = new ProfessorDto();
        ProfessorDto professorDto3 = new ProfessorDto();
        ProfessorDto professorDto4 = new ProfessorDto();
        ProfessorDto professorDto5 = new ProfessorDto();





        UniversityDto universityDto1 = new UniversityDto("Yerevan State University", "Yerevan", "Yerevan", "Aleq Manukyan 1", "+37410987654", "0082");
        try {
            universityDtoService.addUniversityDto(universityDto1);
        } catch (AppException e) {
            System.out.println(e);
        }

        UniversityDto universityDto2 = new UniversityDto("Politexnik", "Yerevan", "Yerevan", "Teryan 44/3", "+37410444444", "0089");
        try {
            universityDtoService.addUniversityDto(universityDto2);
        } catch (AppException e) {
            System.out.println(e);
        }

        UniversityDto universityDto3 = new UniversityDto("Ijevan University", "Ijevan", "Tavush", "Manukyan 20", "+37460555777", "01082");
        try {
            universityDtoService.addUniversityDto(universityDto3);
        } catch (AppException e) {
            System.out.println(e);
        }



    }
}
