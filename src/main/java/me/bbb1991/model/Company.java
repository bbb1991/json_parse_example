
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
        "logo",
        "interviews",
        "onedays",
        "photos",
        "show_logo",
        "state",
        "validate_state",
        "employees",
        "reviews"
})
public class Company implements Serializable {

    @JsonProperty("id")
    private long id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("logo")
    @Valid
    private Logo logo;
    @JsonProperty("interviews")
    @Valid
    private List<Object> interviews = null;
    @JsonProperty("onedays")
    @Valid
    private List<Object> onedays = null;
    @JsonProperty("photos")
    @Valid
    private List<Object> photos = null;
    @JsonProperty("show_logo")
    private boolean showLogo;
    @JsonProperty("state")
    private long state;
    @JsonProperty("validate_state")
    private long validateState;
    @JsonProperty("employees")
    @Valid
    private Employees employees;
    @JsonProperty("reviews")
    @Valid
    private Reviews reviews;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    private final static long serialVersionUID = 6766746851347765853L;

    public Company() {
    }

    public Company(long id, String title, Logo logo, List<Object> interviews, List<Object> onedays, List<Object> photos, boolean showLogo, long state, long validateState, Employees employees, Reviews reviews) {
        super();
        this.id = id;
        this.title = title;
        this.logo = logo;
        this.interviews = interviews;
        this.onedays = onedays;
        this.photos = photos;
        this.showLogo = showLogo;
        this.state = state;
        this.validateState = validateState;
        this.employees = employees;
        this.reviews = reviews;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public Company withId(long id) {
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

    public Company withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("logo")
    public Logo getLogo() {
        return logo;
    }

    @JsonProperty("logo")
    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    public Company withLogo(Logo logo) {
        this.logo = logo;
        return this;
    }

    @JsonProperty("interviews")
    public List<Object> getInterviews() {
        return interviews;
    }

    @JsonProperty("interviews")
    public void setInterviews(List<Object> interviews) {
        this.interviews = interviews;
    }

    public Company withInterviews(List<Object> interviews) {
        this.interviews = interviews;
        return this;
    }

    @JsonProperty("onedays")
    public List<Object> getOnedays() {
        return onedays;
    }

    @JsonProperty("onedays")
    public void setOnedays(List<Object> onedays) {
        this.onedays = onedays;
    }

    public Company withOnedays(List<Object> onedays) {
        this.onedays = onedays;
        return this;
    }

    @JsonProperty("photos")
    public List<Object> getPhotos() {
        return photos;
    }

    @JsonProperty("photos")
    public void setPhotos(List<Object> photos) {
        this.photos = photos;
    }

    public Company withPhotos(List<Object> photos) {
        this.photos = photos;
        return this;
    }

    @JsonProperty("show_logo")
    public boolean isShowLogo() {
        return showLogo;
    }

    @JsonProperty("show_logo")
    public void setShowLogo(boolean showLogo) {
        this.showLogo = showLogo;
    }

    public Company withShowLogo(boolean showLogo) {
        this.showLogo = showLogo;
        return this;
    }

    @JsonProperty("state")
    public long getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(long state) {
        this.state = state;
    }

    public Company withState(long state) {
        this.state = state;
        return this;
    }

    @JsonProperty("validate_state")
    public long getValidateState() {
        return validateState;
    }

    @JsonProperty("validate_state")
    public void setValidateState(long validateState) {
        this.validateState = validateState;
    }

    public Company withValidateState(long validateState) {
        this.validateState = validateState;
        return this;
    }

    @JsonProperty("employees")
    public Employees getEmployees() {
        return employees;
    }

    @JsonProperty("employees")
    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public Company withEmployees(Employees employees) {
        this.employees = employees;
        return this;
    }

    @JsonProperty("reviews")
    public Reviews getReviews() {
        return reviews;
    }

    @JsonProperty("reviews")
    public void setReviews(Reviews reviews) {
        this.reviews = reviews;
    }

    public Company withReviews(Reviews reviews) {
        this.reviews = reviews;
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

    public Company withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(title).append(logo).append(interviews).append(onedays).append(photos).append(showLogo).append(state).append(validateState).append(employees).append(reviews).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Company) == false) {
            return false;
        }
        Company rhs = ((Company) other);
        return new EqualsBuilder().append(id, rhs.id).append(title, rhs.title).append(logo, rhs.logo).append(interviews, rhs.interviews).append(onedays, rhs.onedays).append(photos, rhs.photos).append(showLogo, rhs.showLogo).append(state, rhs.state).append(validateState, rhs.validateState).append(employees, rhs.employees).append(reviews, rhs.reviews).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    public int describeContents() {
        return 0;
    }

}
