package am.tteni.univer.repository;

import am.tteni.univer.common.dto.UniversityDto;

/**
 * Created by Narek Sayadyan on 18.11.2016.
 */
public interface UniversityDtoRepository extends CRUD<UniversityDto> {

    UniversityDto read(String universityName);
}
