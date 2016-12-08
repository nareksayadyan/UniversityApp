package am.tteni.univer.repository;

import am.tteni.univer.common.dto.UniversityDto;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public interface UniversityDtoRepository extends CRUD<UniversityDto> {

    UniversityDto readByName(String universityName);

    UniversityDto readById(int universityId);

    void setRector(int universityId, int professorId);

    void setFirstProRector(int universityId, int professorId);

    void setSecondProRector(int universityId, int professorId);
}
