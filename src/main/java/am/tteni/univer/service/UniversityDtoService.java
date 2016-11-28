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
        universityDtoRepository.create(universityDto);
    }

    public UniversityDto getUniversityDto(int universityId) throws AppException {

        return null;
    }



}
