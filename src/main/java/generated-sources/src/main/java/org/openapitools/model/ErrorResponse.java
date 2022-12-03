package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ErrorModel;
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
 * ErrorResponse
 */

@JacksonXmlRootElement(localName = "ErrorResponse")
@XmlRootElement(name = "ErrorResponse")
@XmlAccessorType(XmlAccessType.FIELD)

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-26T00:53:16.090385300+13:00[Pacific/Auckland]")
public class ErrorResponse {

  @JsonProperty("errors")
  @JacksonXmlProperty(localName = "errors")
  @Valid
  private List<ErrorModel> errors = null;

  public ErrorResponse errors(List<ErrorModel> errors) {
    this.errors = errors;
    return this;
  }

  public ErrorResponse addErrorsItem(ErrorModel errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @Valid 
  @Schema(name = "errors", required = false)
  public List<ErrorModel> getErrors() {
    return errors;
  }

  public void setErrors(List<ErrorModel> errors) {
    this.errors = errors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.errors, errorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

