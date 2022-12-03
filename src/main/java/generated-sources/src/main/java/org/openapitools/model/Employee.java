package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.openapitools.model.Department;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.xml.bind.annotation.*;

import java.util.*;
import javax.annotation.Generated;

/**
 * Employee
 */

@JacksonXmlRootElement(localName = "Employee")
@XmlRootElement(name = "Employee")
@XmlAccessorType(XmlAccessType.FIELD)

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-26T00:53:16.090385300+13:00[Pacific/Auckland]")
public class Employee {

  @JsonProperty("id")
  @JacksonXmlProperty(localName = "id")
  private Long id;

  @JsonProperty("first_name")
  @JacksonXmlProperty(localName = "first_name")
  private String firstName;

  @JsonProperty("last_name")
  @JacksonXmlProperty(localName = "last_name")
  private String lastName;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    M("M"),
    
    F("F");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("gender")
  @JacksonXmlProperty(localName = "gender")
  private GenderEnum gender;

  @JsonProperty("birth_date")
  @JacksonXmlProperty(localName = "birth_date")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate birthDate;

  @JsonProperty("hire_date")
  @JacksonXmlProperty(localName = "hire_date")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate hireDate;

  @JsonProperty("Department")
  @JacksonXmlProperty(localName = "Department")
  private Department department;

  public Employee id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Employee firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  
  @Schema(name = "first_name", required = false)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Employee lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  
  @Schema(name = "last_name", required = false)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Employee gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  
  @Schema(name = "gender", required = false)
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public Employee birthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Get birthDate
   * @return birthDate
  */
  @Valid 
  @Schema(name = "birth_date", required = false)
  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public Employee hireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
    return this;
  }

  /**
   * Get hireDate
   * @return hireDate
  */
  @Valid 
  @Schema(name = "hire_date", required = false)
  public LocalDate getHireDate() {
    return hireDate;
  }

  public void setHireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
  }

  public Employee department(Department department) {
    this.department = department;
    return this;
  }

  /**
   * Get department
   * @return department
  */
  @Valid 
  @Schema(name = "Department", required = false)
  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(this.id, employee.id) &&
        Objects.equals(this.firstName, employee.firstName) &&
        Objects.equals(this.lastName, employee.lastName) &&
        Objects.equals(this.gender, employee.gender) &&
        Objects.equals(this.birthDate, employee.birthDate) &&
        Objects.equals(this.hireDate, employee.hireDate) &&
        Objects.equals(this.department, employee.department);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, gender, birthDate, hireDate, department);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    hireDate: ").append(toIndentedString(hireDate)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

