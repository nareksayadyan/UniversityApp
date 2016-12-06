package am.tteni.univer.service;

import am.tteni.univer.common.appexception.AppException;
import am.tteni.univer.common.dto.ProfessorDto;
import am.tteni.univer.common.dto.UniversityDto;
import am.tteni.univer.repository.UniversityDtoRepository;
import am.tteni.univer.repository.implementations.UniversityDtoRepositoryImpl;

/**
 * Created by Narek on 28.11.2016.
 */
public class UniversityDtoService {

    UniversityDtoRepository universityDtoRepository = new UniversityDtoRepositoryImpl();

    public void addUniversityDto(UniversityDto universityDto) throws AppException {
        if (isFreeUniversityName(universityDto.getName())) {
            universityDtoRepository.create(universityDto);
        } else {
            throw new AppException("The University name is busy");
        }
    }

    private boolean isFreeUniversityName(String name) {
        return universityDtoRepository.read(name) == null;
    }

    public UniversityDto getUniversityDtoById(int universityId) throws AppException {
        UniversityDto universityDto = universityDtoRepository.read(universityId);
        return universityDto;
    }

    public UniversityDto getUniversityDtoByName(String universityName) throws AppException {
        UniversityDto universityDto = universityDtoRepository.read(universityName);
        return universityDto;
    }

//    public void changeUniversityDto(UniversityDto universityDto) throws AppException {
//        universityDtoRepository.update(universityDto);
//    }

    public void setRectorToUniversityDto(int universityId, int professorID) {

    }

    public void setFirstProRectorToUniversityDto(int universityId, int professorID) {

    }

    public void setSecondProRectorToUniversityDto(int universityId, int professorID) {

    }
}
