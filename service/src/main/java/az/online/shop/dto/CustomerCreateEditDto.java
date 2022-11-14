package az.online.shop.dto;

import az.online.shop.model.Role;
import java.time.LocalDate;

public record CustomerCreateEditDto(PersonalInfoCreateEditDto personalInfo,
                                    String firstName,
                                    String surname,
                                    String email,
                                    String password,
                                    Role role,
                                    LocalDate birthDate) {
}