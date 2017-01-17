
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
        "average",
        "count"
})
public class Reviews implements Serializable {

    @JsonProperty("average")
    private long average;
    @JsonProperty("count")
    private long count;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    private final static long serialVersionUID = -3597537564634226850L;

    /**
     * No args constructor for use in serialization
     */
    public Reviews() {
    }

    /**
     * @param count
     * @param average
     */
    public Reviews(long average, long count) {
        super();
        this.average = average;
        this.count = count;
    }

    @JsonProperty("average")
    public long getAverage() {
        return average;
    }

    @JsonProperty("average")
    public void setAverage(long average) {
        this.average = average;
    }

    public Reviews withAverage(long average) {
        this.average = average;
        return this;
    }

    @JsonProperty("count")
    public long getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(long count) {
        this.count = count;
    }

    public Reviews withCount(long count) {
        this.count = count;
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

    public Reviews withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(average).append(count).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Reviews)) {
            return false;
        }
        Reviews rhs = ((Reviews) other);
        return new EqualsBuilder().append(average, rhs.average).append(count, rhs.count).append(additionalProperties, rhs.additionalProperties).isEquals();
    }


    public int describeContents() {
        return 0;
    }

}
