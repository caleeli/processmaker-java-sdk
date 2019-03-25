/*
 * ProcessMaker API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@processmaker.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UsersEditable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-25T15:15:59.617Z[GMT]")
public class UsersEditable {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_FIRSTNAME = "firstname";
  @SerializedName(SERIALIZED_NAME_FIRSTNAME)
  private String firstname;

  public static final String SERIALIZED_NAME_LASTNAME = "lastname";
  @SerializedName(SERIALIZED_NAME_LASTNAME)
  private String lastname;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_POSTAL = "postal";
  @SerializedName(SERIALIZED_NAME_POSTAL)
  private String postal;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_FAX = "fax";
  @SerializedName(SERIALIZED_NAME_FAX)
  private String fax;

  public static final String SERIALIZED_NAME_CELL = "cell";
  @SerializedName(SERIALIZED_NAME_CELL)
  private String cell;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_DATETIME_FORMAT = "datetime_format";
  @SerializedName(SERIALIZED_NAME_DATETIME_FORMAT)
  private String datetimeFormat;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_IS_ADMINISTRATOR = "is_administrator";
  @SerializedName(SERIALIZED_NAME_IS_ADMINISTRATOR)
  private Boolean isAdministrator;

  public static final String SERIALIZED_NAME_LOGGEDIN_AT = "loggedin_at";
  @SerializedName(SERIALIZED_NAME_LOGGEDIN_AT)
  private String loggedinAt;

  /**
   * The attributes that are mass assignable.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public UsersEditable email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The attributes that are mass assignable.
   * @return email
  **/
  @ApiModelProperty(value = "The attributes that are mass assignable.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UsersEditable password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The attributes that are mass assignable.
   * @return password
  **/
  @ApiModelProperty(value = "The attributes that are mass assignable.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UsersEditable firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

   /**
   * The attributes that are mass assignable.
   * @return firstname
  **/
  @ApiModelProperty(value = "The attributes that are mass assignable.")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public UsersEditable lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

   /**
   * The attributes that are mass assignable.
   * @return lastname
  **/
  @ApiModelProperty(value = "The attributes that are mass assignable.")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public UsersEditable username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The attributes that are mass assignable.
   * @return username
  **/
  @ApiModelProperty(value = "The attributes that are mass assignable.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UsersEditable address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The attributes that are mass assignable.
   * @return address
  **/
  @ApiModelProperty(value = "The attributes that are mass assignable.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public UsersEditable city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The attributes that are mass assignable.
   * @return city
  **/
  @ApiModelProperty(value = "The attributes that are mass assignable.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public UsersEditable state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The attributes that are mass assignable.
   * @return state
  **/
  @ApiModelProperty(value = "The attributes that are mass assignable.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public UsersEditable postal(String postal) {
    this.postal = postal;
    return this;
  }

   /**
   * The attributes that are mass assignable.
   * @return postal
  **/
  @ApiModelProperty(value = "The attributes that are mass assignable.")
  public String getPostal() {
    return postal;
  }

  public void setPostal(String postal) {
    this.postal = postal;
  }

  public UsersEditable country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The attributes that are mass assignable.
   * @return country
  **/
  @ApiModelProperty(value = "The attributes that are mass assignable.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public UsersEditable phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * The attributes that are mass assignable.
   * @return phone
  **/
  @ApiModelProperty(value = "The attributes that are mass assignable.")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public UsersEditable fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * The attributes that are mass assignable.
   * @return fax
  **/
  @ApiModelProperty(value = "The attributes that are mass assignable.")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public UsersEditable cell(String cell) {
    this.cell = cell;
    return this;
  }

   /**
   * The attributes that are mass assignable.
   * @return cell
  **/
  @ApiModelProperty(value = "The attributes that are mass assignable.")
  public String getCell() {
    return cell;
  }

  public void setCell(String cell) {
    this.cell = cell;
  }

  public UsersEditable title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The attributes that are mass assignable.
   * @return title
  **/
  @ApiModelProperty(value = "The attributes that are mass assignable.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public UsersEditable timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * The attributes that are mass assignable.
   * @return timezone
  **/
  @ApiModelProperty(value = "The attributes that are mass assignable.")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public UsersEditable datetimeFormat(String datetimeFormat) {
    this.datetimeFormat = datetimeFormat;
    return this;
  }

   /**
   * The attributes that are mass assignable.
   * @return datetimeFormat
  **/
  @ApiModelProperty(value = "The attributes that are mass assignable.")
  public String getDatetimeFormat() {
    return datetimeFormat;
  }

  public void setDatetimeFormat(String datetimeFormat) {
    this.datetimeFormat = datetimeFormat;
  }

  public UsersEditable language(String language) {
    this.language = language;
    return this;
  }

   /**
   * The attributes that are mass assignable.
   * @return language
  **/
  @ApiModelProperty(value = "The attributes that are mass assignable.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public UsersEditable isAdministrator(Boolean isAdministrator) {
    this.isAdministrator = isAdministrator;
    return this;
  }

   /**
   * The attributes that are mass assignable.
   * @return isAdministrator
  **/
  @ApiModelProperty(value = "The attributes that are mass assignable.")
  public Boolean getIsAdministrator() {
    return isAdministrator;
  }

  public void setIsAdministrator(Boolean isAdministrator) {
    this.isAdministrator = isAdministrator;
  }

  public UsersEditable loggedinAt(String loggedinAt) {
    this.loggedinAt = loggedinAt;
    return this;
  }

   /**
   * The attributes that are mass assignable.
   * @return loggedinAt
  **/
  @ApiModelProperty(value = "The attributes that are mass assignable.")
  public String getLoggedinAt() {
    return loggedinAt;
  }

  public void setLoggedinAt(String loggedinAt) {
    this.loggedinAt = loggedinAt;
  }

  public UsersEditable status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The attributes that are mass assignable.
   * @return status
  **/
  @ApiModelProperty(value = "The attributes that are mass assignable.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersEditable usersEditable = (UsersEditable) o;
    return Objects.equals(this.email, usersEditable.email) &&
        Objects.equals(this.password, usersEditable.password) &&
        Objects.equals(this.firstname, usersEditable.firstname) &&
        Objects.equals(this.lastname, usersEditable.lastname) &&
        Objects.equals(this.username, usersEditable.username) &&
        Objects.equals(this.address, usersEditable.address) &&
        Objects.equals(this.city, usersEditable.city) &&
        Objects.equals(this.state, usersEditable.state) &&
        Objects.equals(this.postal, usersEditable.postal) &&
        Objects.equals(this.country, usersEditable.country) &&
        Objects.equals(this.phone, usersEditable.phone) &&
        Objects.equals(this.fax, usersEditable.fax) &&
        Objects.equals(this.cell, usersEditable.cell) &&
        Objects.equals(this.title, usersEditable.title) &&
        Objects.equals(this.timezone, usersEditable.timezone) &&
        Objects.equals(this.datetimeFormat, usersEditable.datetimeFormat) &&
        Objects.equals(this.language, usersEditable.language) &&
        Objects.equals(this.isAdministrator, usersEditable.isAdministrator) &&
        Objects.equals(this.loggedinAt, usersEditable.loggedinAt) &&
        Objects.equals(this.status, usersEditable.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, password, firstname, lastname, username, address, city, state, postal, country, phone, fax, cell, title, timezone, datetimeFormat, language, isAdministrator, loggedinAt, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersEditable {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postal: ").append(toIndentedString(postal)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    cell: ").append(toIndentedString(cell)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    datetimeFormat: ").append(toIndentedString(datetimeFormat)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    isAdministrator: ").append(toIndentedString(isAdministrator)).append("\n");
    sb.append("    loggedinAt: ").append(toIndentedString(loggedinAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

