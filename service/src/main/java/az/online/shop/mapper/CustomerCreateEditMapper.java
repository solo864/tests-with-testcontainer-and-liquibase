package az.online.shop.mapper;

import az.online.shop.dto.CustomerCreateEditDto;
import az.online.shop.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerCreateEditMapper implements Mapper<CustomerCreateEditDto, Customer> {

    private final PersonalInfoCreateEditMapper personalInfoCreateEditMapper;

    @Override
    public Customer map(CustomerCreateEditDto object) {
        Customer customer = new Customer();
        copy(object, customer);
        return customer;
    }


    @Override
    public Customer map(CustomerCreateEditDto fromObject, Customer toObject) {
        copy(fromObject, toObject);
        return toObject;
    }

    private void copy(CustomerCreateEditDto object, Customer customer) {
        customer.setPassword(object.password());
        customer.setSurname(object.surname());
        customer.setFirstName(object.firstName());
        customer.setRole(object.role());
        customer.setEmail(object.email());
        customer.setBirthDate(object.birthDate());
        customer.setPersonalInfo(personalInfoCreateEditMapper.map(object.personalInfo()));
    }
}