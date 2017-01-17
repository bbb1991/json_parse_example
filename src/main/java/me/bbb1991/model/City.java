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
        "title",
        "locative"
})
public class City implements Serializable {

    private final static long serialVersionUID = -4204419665207178657L;
    @JsonProperty("id")
    private long id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("locative")
    private String locative;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public City() {
    }

    public City(long id, String title, String locative) {
        super();
        this.id = id;
        this.title = title;
        this.locative = locative;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public City withId(long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public City withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("locative")
    public String getLocative() {
        return locative;
    }

    @JsonProperty("locative")
    public void setLocative(String locative) {
        this.locative = locative;
    }

    public City withLocative(String locative) {
        this.locative = locative;
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

    public City withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(title).append(locative).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof City)) {
            return false;
        }
        City rhs = ((City) other);
        return new EqualsBuilder().append(id, rhs.id).append(title, rhs.title).append(locative, rhs.locative).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    public int describeContents() {
        return 0;
    }

}
