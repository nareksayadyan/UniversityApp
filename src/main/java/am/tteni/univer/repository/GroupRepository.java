package am.tteni.univer.repository;

import am.tteni.univer.common.dto.GroupDto;

import java.util.ArrayList;

/**
 * Created by Narek on 18.11.2016.
 */
public interface GroupRepository extends CRUD<GroupDto> {

    GroupDto create(GroupDto group, Faculty faculty);

    GroupDto read(int groupNumber);

    ArrayList<GroupDto> read(Faculty faculty);
}
