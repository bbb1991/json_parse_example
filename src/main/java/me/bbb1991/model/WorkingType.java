
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
        "alias"
})
public class WorkingType implements Serializable {

    @JsonProperty("id")
    private long id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("alias")
    private Object alias;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    private final static long serialVersionUID = 7351434862555592106L;

    public WorkingType() {
    }

    public WorkingType(long id, String title, Object alias) {
        super();
        this.id = id;
        this.title = title;
        this.alias = alias;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public WorkingType withId(long id) {
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

    public WorkingType withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("alias")
    public Object getAlias() {
        return alias;
    }

    @JsonProperty("alias")
    public void setAlias(Object alias) {
        this.alias = alias;
    }

    public WorkingType withAlias(Object alias) {
        this.alias = alias;
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

    public WorkingType withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(title).append(alias).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof WorkingType)) {
            return false;
        }
        WorkingType rhs = ((WorkingType) other);
        return new EqualsBuilder().append(id, rhs.id).append(title, rhs.title).append(alias, rhs.alias).append(additionalProperties, rhs.additionalProperties).isEquals();
    }


    public int describeContents() {
        return 0;
    }

}
