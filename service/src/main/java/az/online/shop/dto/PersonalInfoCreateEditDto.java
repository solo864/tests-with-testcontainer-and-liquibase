package az.online.shop.dto;

import az.online.shop.model.Gender;

public record PersonalInfoCreateEditDto(String phoneNumber,
                                        String address,
                                        Gender gender) {
}
