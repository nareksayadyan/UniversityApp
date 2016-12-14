package am.tteni.univertest;

import am.tteni.univer.common.appexception.AppException;
import am.tteni.univer.common.dto.ProfessorDto;
import am.tteni.univer.common.dto.UniversityDto;
import am.tteni.univer.repository.implementations.ProfessorRepositoryImpl;
import am.tteni.univer.repository.implementations.UniversityDtoRepositoryImpl;
import am.tteni.univer.service.ProfessorDtoService;
import am.tteni.univer.service.UniversityDtoService;

/**
 * Created by Narek on 10.11.2016.
 */
public class Test {
    public static void main(String[] args) {

        UniversityDtoService universityDtoService = new UniversityDtoService();
        ProfessorDtoService professorDtoService = new ProfessorDtoService();




//        UniversityDto universityDtoForChange = null;
//        try {
//            universityDtoForChange = universityDtoService.getUniversityDtoById(4);
//            System.out.println(universityDtoForChange.getName());
//            universityDtoForChange.setName("Goris`s Medical State University");
//            universityDtoService.changeUniversityDto(universityDtoForChange);
//            System.out.println(universityDtoForChange.getName());
//        } catch (AppException e) {
//            System.out.println(e.getMsg());
//        }

//        "Goris State University", "Goris", "Syunik", "Mets Mher 24", "+37410454545", "0409", 1, 2, 3);

//        try {
//            System.out.println(universityDtoService.getUniversityDtoById(2).getAddress());
//        } catch (AppException e) {
//            e.printStackTrace();
//        }

//        ProfessorRepositoryImpl repository = new ProfessorRepositoryImpl();
//        System.out.println(repository.readByUsernameEmail("prof1", ""));


//        professorDtoService.deleteProfessor(9);
//        ProfessorDto professorDto = new ProfessorDto(11, "profik7", "profikyan7", "prof7", "profpass7", "lololol@am.am");
//        professorDtoService.changeProfessorDto(professorDto);

//        ProfessorDto professorDto1 = new ProfessorDto("profik9", "profikyan9", "prof9", "profpass9", "prof9@uni.am");
//        ProfessorDto professorDto2 = new ProfessorDto("profik2", "profikyan2", "prof2", "profpass2", "prof2@uni.am");
//        ProfessorDto professorDto3 = new ProfessorDto("profik3", "profikyan3", "prof3", "profpass3", "prof3@uni.am");
//        ProfessorDto professorDto4 = new ProfessorDto("profik4", "profikyan4", "prof4", "profpass4", "prof4@uni.am");
//        ProfessorDto professorDto5 = new ProfessorDto("profik5", "profikyan5", "prof5", "profpass5", "prof5@uni.am");
//        ProfessorDto professorDto6 = new ProfessorDto("profik6", "profikyan6", "prof6", "profpass6", "prof6@uni.am");

//        try {
//            ProfessorDto professorDto = professorDtoService.getProfessorDtoById(44);
//            System.out.println(professorDto.geteMail());
//            ProfessorDto professorDto10 = professorDtoService.getProfessorDtoByName("4profik7", "profikyan7");
//            System.out.println(professorDto10.geteMail());
//            professorDtoService.addProfessorDto(professorDto1);
//            professorDtoService.addProfessorDto(professorDto2);
//            professorDtoService.addProfessorDto(professorDto3);
//            professorDtoService.addProfessorDto(professorDto4);
//            professorDtoService.addProfessorDto(professorDto5);
//            professorDtoService.addProfessorDto(professorDto6);
//        } catch (AppException e) {
//            System.out.println(e.getMsg());
//        }

//        UniversityDto universityDto1 = new UniversityDto("Goris State University", "Goris", "Syunik", "Mets Mher 24", "+37410454545", "0409", 1, 2, 3);
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
