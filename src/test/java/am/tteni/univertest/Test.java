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



//        professorDtoService.deleteProfessor(9);

//        ProfessorDto professorDto = new ProfessorDto(11, "profik7", "profikyan7", "prof7", "profpass7", "lololol@am.am");

//        professorDtoService.changeProfessorDto(professorDto);

//        ProfessorDto professorDto1 = new ProfessorDto("profik8", "profikyan8", "prof8", "profpass8", "prof8@uni.am");
//        ProfessorDto professorDto2 = new ProfessorDto("profik2", "profikyan2", "prof2", "profpass2", "prof2@uni.am");
//        ProfessorDto professorDto3 = new ProfessorDto("profik3", "profikyan3", "prof3", "profpass3", "prof3@uni.am");
//        ProfessorDto professorDto4 = new ProfessorDto("profik4", "profikyan4", "prof4", "profpass4", "prof4@uni.am");
//        ProfessorDto professorDto5 = new ProfessorDto("profik5", "profikyan5", "prof5", "profpass5", "prof5@uni.am");
//        ProfessorDto professorDto6 = new ProfessorDto("profik6", "profikyan6", "prof6", "profpass6", "prof6@uni.am");

        try {
            ProfessorDto professorDto = professorDtoService.getProfessorDtoById(115);
//            ProfessorDto professorDto = professorDtoService.getProfessorDtoByName("profik7", "profikyan7");
            System.out.println(professorDto.geteMail());
//            professorDtoService.addProfessorDto(professorDto1);
//            professorDtoService.addProfessorDto(professorDto2);
//            professorDtoService.addProfessorDto(professorDto3);
//            professorDtoService.addProfessorDto(professorDto4);
//            professorDtoService.addProfessorDto(professorDto5);
//            professorDtoService.addProfessorDto(professorDto6);
        } catch (AppException e) {
            System.out.println(e.getMsg());
        }

//        UniversityDto universityDto1 = new UniversityDto("Yerevan State University", "Yerevan", "Yerevan", "Aleq Manukyan 1", "+37410987654", "0082", 1, 4, 5);
//        try {
//            universityDtoService.addUniversityDto(universityDto1);
//        } catch (AppException e) {
//            System.out.println(e.getMsg());
//        }
//
//        UniversityDto universityDto2 = new UniversityDto("Politexnik", "Yerevan", "Yerevan", "Teryan 44/3", "+37410444444", "0089", 3, 3, 3);
//        try {
//            universityDtoService.addUniversityDto(universityDto2);
//        } catch (AppException e) {
//            System.out.println(e.getMsg());
//        }
//
//        UniversityDto universityDto3 = new UniversityDto("Ijevan University", "Ijevan", "Tavush", "Manukyan 20", "+37460555777", "01082", 4, 1 ,1);
//        try {
//            universityDtoService.addUniversityDto(universityDto3);
//        } catch (AppException e) {
//            System.out.println(e.getMsg());
//        }
    }
}
