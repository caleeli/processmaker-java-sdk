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
import org.openapitools.client.model.CommentsEditable;

/**
 * Comments
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-03-25T15:15:59.617Z[GMT]")
public class Comments {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_COMMENTABLE_ID = "commentable_id";
  @SerializedName(SERIALIZED_NAME_COMMENTABLE_ID)
  private String commentableId;

  public static final String SERIALIZED_NAME_COMMENTABLE_TYPE = "commentable_type";
  @SerializedName(SERIALIZED_NAME_COMMENTABLE_TYPE)
  private String commentableType;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_HIDDEN = "hidden";
  @SerializedName(SERIALIZED_NAME_HIDDEN)
  private Boolean hidden;

  /**
   * Represents a business process definition.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    LOG("LOG"),
    
    MESSAGE("MESSAGE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public Comments id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Represents a business process definition.
   * @return id
  **/
  @ApiModelProperty(value = "Represents a business process definition.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Comments userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Represents a business process definition.
   * @return userId
  **/
  @ApiModelProperty(value = "Represents a business process definition.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Comments commentableId(String commentableId) {
    this.commentableId = commentableId;
    return this;
  }

   /**
   * Represents a business process definition.
   * @return commentableId
  **/
  @ApiModelProperty(value = "Represents a business process definition.")
  public String getCommentableId() {
    return commentableId;
  }

  public void setCommentableId(String commentableId) {
    this.commentableId = commentableId;
  }

  public Comments commentableType(String commentableType) {
    this.commentableType = commentableType;
    return this;
  }

   /**
   * Represents a business process definition.
   * @return commentableType
  **/
  @ApiModelProperty(value = "Represents a business process definition.")
  public String getCommentableType() {
    return commentableType;
  }

  public void setCommentableType(String commentableType) {
    this.commentableType = commentableType;
  }

  public Comments subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Represents a business process definition.
   * @return subject
  **/
  @ApiModelProperty(value = "Represents a business process definition.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Comments body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Represents a business process definition.
   * @return body
  **/
  @ApiModelProperty(value = "Represents a business process definition.")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Comments hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * Represents a business process definition.
   * @return hidden
  **/
  @ApiModelProperty(value = "Represents a business process definition.")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public Comments type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Represents a business process definition.
   * @return type
  **/
  @ApiModelProperty(value = "Represents a business process definition.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comments comments = (Comments) o;
    return Objects.equals(this.id, comments.id) &&
        Objects.equals(this.userId, comments.userId) &&
        Objects.equals(this.commentableId, comments.commentableId) &&
        Objects.equals(this.commentableType, comments.commentableType) &&
        Objects.equals(this.subject, comments.subject) &&
        Objects.equals(this.body, comments.body) &&
        Objects.equals(this.hidden, comments.hidden) &&
        Objects.equals(this.type, comments.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, commentableId, commentableType, subject, body, hidden, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comments {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    commentableId: ").append(toIndentedString(commentableId)).append("\n");
    sb.append("    commentableType: ").append(toIndentedString(commentableType)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

