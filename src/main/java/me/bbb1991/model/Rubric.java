
package me.bbb1991.model;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "title",
        "specialities"
})
public class Rubric implements Serializable {

    @JsonProperty("id")
    private long id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("specialities")
    @Valid
    private List<Speciality> specialities = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    private final static long serialVersionUID = -1893248182636130619L;

    /**
     * No args constructor for use in serialization
     */
    public Rubric() {
    }

    /**
     * @param id
     * @param title
     * @param specialities
     */
    public Rubric(long id, String title, List<Speciality> specialities) {
        super();
        this.id = id;
        this.title = title;
        this.specialities = specialities;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public Rubric withId(long id) {
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

    public Rubric withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("specialities")
    public List<Speciality> getSpecialities() {
        return specialities;
    }

    @JsonProperty("specialities")
    public void setSpecialities(List<Speciality> specialities) {
        this.specialities = specialities;
    }

    public Rubric withSpecialities(List<Speciality> specialities) {
        this.specialities = specialities;
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

    public Rubric withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(title).append(specialities).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rubric) == false) {
            return false;
        }
        Rubric rhs = ((Rubric) other);
        return new EqualsBuilder().append(id, rhs.id).append(title, rhs.title).append(specialities, rhs.specialities).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    public int describeContents() {
        return 0;
    }

}
