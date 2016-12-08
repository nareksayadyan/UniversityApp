package am.tteni.univer.service;

import am.tteni.univer.common.appexception.AppException;
import am.tteni.univer.common.dto.UniversityDto;
import am.tteni.univer.repository.UniversityDtoRepository;
import am.tteni.univer.repository.implementations.UniversityDtoRepositoryImpl;

/**
 * Created by Narek on 28.11.2016.
 */
public class UniversityDtoService {

    UniversityDtoRepository universityDtoRepository = new UniversityDtoRepositoryImpl();

    public void addUniversityDto(UniversityDto universityDto) throws AppException {
        if (universityDtoRepository.readByName(universityDto.getName()) == null) {
            universityDtoRepository.create(universityDto);
        } else {
            throw new AppException("The University name is busy");
        }
    }

    public UniversityDto getUniversityDtoByName(String universityName) throws AppException {
        UniversityDto universityDto = universityDtoRepository.readByName(universityName);
        return universityDto;
    }

    public UniversityDto getUniversityDtoById(int universityId) throws AppException {
        UniversityDto universityDto = universityDtoRepository.readById(universityId);
        return universityDto;
    }

    public void changeUniversityDto(UniversityDto universityDto) throws AppException {
        universityDtoRepository.update(universityDto);
    }

    public void setRectorToUniversityDto(int universityId, int professorID) {
        universityDtoRepository.setRector(universityId, professorID);
    }

    public void setFirstProRectorToUniversityDto(int universityId, int professorID) {
        universityDtoRepository.setFirstProRector(universityId, professorID);
    }

    public void setSecondProRectorToUniversityDto(int universityId, int professorID) {
        universityDtoRepository.setSecondProRector(universityId,professorID);
    }
}
