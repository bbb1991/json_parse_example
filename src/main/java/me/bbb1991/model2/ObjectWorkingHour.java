package me.bbb1991.model2;

/**
 * Created by admin on 14.03.2017.
 */


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "system_object_id",
        "global_object_id",
        "Hours",
        "DayOfWeek",
        "global_id"
})
public class ObjectWorkingHour implements Serializable
{

    @JsonProperty("system_object_id")
    private String systemObjectId;
    @JsonProperty("global_object_id")
    private Double globalObjectId;
    @JsonProperty("Hours")
    private String hours;
    @JsonProperty("DayOfWeek")
    private String dayOfWeek;
    @JsonProperty("global_id")
    private Double globalId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2187028036686309539L;

    @JsonProperty("system_object_id")
    public String getSystemObjectId() {
        return systemObjectId;
    }

    @JsonProperty("system_object_id")
    public void setSystemObjectId(String systemObjectId) {
        this.systemObjectId = systemObjectId;
    }

    @JsonProperty("global_object_id")
    public Double getGlobalObjectId() {
        return globalObjectId;
    }

    @JsonProperty("global_object_id")
    public void setGlobalObjectId(Double globalObjectId) {
        this.globalObjectId = globalObjectId;
    }

    @JsonProperty("Hours")
    public String getHours() {
        return hours;
    }

    @JsonProperty("Hours")
    public void setHours(String hours) {
        this.hours = hours;
    }

    @JsonProperty("DayOfWeek")
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    @JsonProperty("DayOfWeek")
    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @JsonProperty("global_id")
    public Double getGlobalId() {
        return globalId;
    }

    @JsonProperty("global_id")
    public void setGlobalId(Double globalId) {
        this.globalId = globalId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
