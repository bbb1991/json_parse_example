
package me.bbb1991.model;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "type",
        "photo"
})
public class Owner implements Serializable {

    @JsonProperty("id")
    private long id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("photo")
    private Object photo;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    private final static long serialVersionUID = -6520917749954824170L;

    /**
     * No args constructor for use in serialization
     */
    public Owner() {
    }

    /**
     * @param id
     * @param type
     * @param photo
     */
    public Owner(long id, String type, Object photo) {
        super();
        this.id = id;
        this.type = type;
        this.photo = photo;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public Owner withId(long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Owner withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("photo")
    public Object getPhoto() {
        return photo;
    }

    @JsonProperty("photo")
    public void setPhoto(Object photo) {
        this.photo = photo;
    }

    public Owner withPhoto(Object photo) {
        this.photo = photo;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Owner withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(type).append(photo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Owner)) {
            return false;
        }
        Owner rhs = ((Owner) other);
        return new EqualsBuilder().append(id, rhs.id).append(type, rhs.type).append(photo, rhs.photo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    public int describeContents() {
        return 0;
    }

}
