package az.online.shop.mapper;

import az.online.shop.dto.PersonalInfoCreateEditDto;
import az.online.shop.entity.PersonalInfo;
import org.springframework.stereotype.Component;

@Component
public class PersonalInfoCreateEditMapper implements Mapper<PersonalInfoCreateEditDto, PersonalInfo>{

    @Override
    public PersonalInfo map(PersonalInfoCreateEditDto object) {
        return PersonalInfo.builder()
                .phoneNumber(object.phoneNumber())
                .address(object.address())
                .gender(object.gender())
                .build();
    }
}
