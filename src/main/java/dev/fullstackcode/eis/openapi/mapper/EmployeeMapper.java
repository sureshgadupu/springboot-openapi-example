package dev.fullstackcode.eis.openapi.mapper;



import org.mapstruct.Context;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.openapitools.model.Employee;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

//
@Mapper (componentModel   = "spring")
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
    @Mapping(target = "department.employees", ignore = true)
    @Mappings(value = { @Mapping(source = "first_name",target= "firstName") , @Mapping(source = "last_name",target= "lastName") ,  @Mapping(source = "hire_date",target= "hireDate") ,  @Mapping(source = "birth_date",target= "birthDate") })
    org.openapitools.model.Employee toDto(dev.fullstackcode.eis.openapi.entity.Employee employee);
   // @Mappings(value = { @Mapping(source = "first_name",target= "firstName") , @Mapping(source = "last_name",target= "LastName") ,  @Mapping(source = "hire_date",target= "hireDate") ,  @Mapping(source = "birth_date",target= "birthDate") })
    dev.fullstackcode.eis.openapi.entity.Employee toEntity(Employee dto);
   // @Mapping(target = "department.employees", ignore = true)
    List<Employee> toList(List<dev.fullstackcode.eis.openapi.entity.Employee> employee);

    default OffsetDateTime map(String value) {
        LocalDateTime localDateTime = LocalDateTime.parse(value);
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("America/Sao_Paulo"));
        return  zonedDateTime.toOffsetDateTime();
    }
}
