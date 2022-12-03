package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Employee;
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
 * Department
 */

@JacksonXmlRootElement(localName = "Department")
@XmlRootElement(name = "Department")
@XmlAccessorType(XmlAccessType.FIELD)

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-26T00:53:16.090385300+13:00[Pacific/Auckland]")
public class Department {

  @JsonProperty("id")
  @JacksonXmlProperty(localName = "id")
  private Integer id;

  @JsonProperty("name")
  @JacksonXmlProperty(localName = "name")
  private String name;

  @JsonProperty("employees")
  @JacksonXmlProperty(localName = "employees")
  @Valid
  private List<Employee> employees = null;

  public Department id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Department name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Department employees(List<Employee> employees) {
    this.employees = employees;
    return this;
  }

  public Department addEmployeesItem(Employee employeesItem) {
    if (this.employees == null) {
      this.employees = new ArrayList<>();
    }
    this.employees.add(employeesItem);
    return this;
  }

  /**
   * Get employees
   * @return employees
  */
  @Valid 
  @Schema(name = "employees", required = false)
  public List<Employee> getEmployees() {
    return employees;
  }

  public void setEmployees(List<Employee> employees) {
    this.employees = employees;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Department department = (Department) o;
    return Objects.equals(this.id, department.id) &&
        Objects.equals(this.name, department.name) &&
        Objects.equals(this.employees, department.employees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, employees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Department {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    employees: ").append(toIndentedString(employees)).append("\n");
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

