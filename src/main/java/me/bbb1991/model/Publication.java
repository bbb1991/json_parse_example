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
        "geo_id",
        "order_id",
        "vacancy_id",
        "company_id",
        "type",
        "action",
        "is_active",
        "is_free",
        "logo_in_list",
        "is_service_finished",
        "live_time",
        "expired_at",
        "published_at",
        "created_at",
        "is_dummy",
        "is_deleted",
        "prolong_data"
})
public class Publication implements Serializable {

    private final static long serialVersionUID = 4548661750178283593L;
    @JsonProperty("id")
    private long id;
    @JsonProperty("geo_id")
    private long geoId;
    @JsonProperty("order_id")
    private long orderId;
    @JsonProperty("vacancy_id")
    private long vacancyId;
    @JsonProperty("company_id")
    private long companyId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("action")
    private String action;
    @JsonProperty("is_active")
    private boolean isActive;
    @JsonProperty("is_free")
    private boolean isFree;
    @JsonProperty("logo_in_list")
    private boolean logoInList;
    @JsonProperty("is_service_finished")
    private boolean isServiceFinished;
    @JsonProperty("live_time")
    private long liveTime;
    @JsonProperty("expired_at")
    private String expiredAt;
    @JsonProperty("published_at")
    private String publishedAt;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("is_dummy")
    private boolean isDummy;
    @JsonProperty("is_deleted")
    private boolean isDeleted;
    @JsonProperty("prolong_data")
    private Object prolongData;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Publication() {
    }

    /**
     * @param liveTime
     * @param isDummy
     * @param isDeleted
     * @param type
     * @param expiredAt
     * @param prolongData
     * @param publishedAt
     * @param id
     * @param geoId
     * @param isActive
     * @param vacancyId
     * @param isFree
     * @param createdAt
     * @param action
     * @param logoInList
     * @param isServiceFinished
     * @param companyId
     * @param orderId
     */
    public Publication(long id, long geoId, long orderId, long vacancyId, long companyId, String type, String action, boolean isActive, boolean isFree, boolean logoInList, boolean isServiceFinished, long liveTime, String expiredAt, String publishedAt, String createdAt, boolean isDummy, boolean isDeleted, Object prolongData) {
        super();
        this.id = id;
        this.geoId = geoId;
        this.orderId = orderId;
        this.vacancyId = vacancyId;
        this.companyId = companyId;
        this.type = type;
        this.action = action;
        this.isActive = isActive;
        this.isFree = isFree;
        this.logoInList = logoInList;
        this.isServiceFinished = isServiceFinished;
        this.liveTime = liveTime;
        this.expiredAt = expiredAt;
        this.publishedAt = publishedAt;
        this.createdAt = createdAt;
        this.isDummy = isDummy;
        this.isDeleted = isDeleted;
        this.prolongData = prolongData;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public Publication withId(long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("geo_id")
    public long getGeoId() {
        return geoId;
    }

    @JsonProperty("geo_id")
    public void setGeoId(long geoId) {
        this.geoId = geoId;
    }

    public Publication withGeoId(long geoId) {
        this.geoId = geoId;
        return this;
    }

    @JsonProperty("order_id")
    public long getOrderId() {
        return orderId;
    }

    @JsonProperty("order_id")
    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Publication withOrderId(long orderId) {
        this.orderId = orderId;
        return this;
    }

    @JsonProperty("vacancy_id")
    public long getVacancyId() {
        return vacancyId;
    }

    @JsonProperty("vacancy_id")
    public void setVacancyId(long vacancyId) {
        this.vacancyId = vacancyId;
    }

    public Publication withVacancyId(long vacancyId) {
        this.vacancyId = vacancyId;
        return this;
    }

    @JsonProperty("company_id")
    public long getCompanyId() {
        return companyId;
    }

    @JsonProperty("company_id")
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public Publication withCompanyId(long companyId) {
        this.companyId = companyId;
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

    public Publication withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    public Publication withAction(String action) {
        this.action = action;
        return this;
    }

    @JsonProperty("is_active")
    public boolean isIsActive() {
        return isActive;
    }

    @JsonProperty("is_active")
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Publication withIsActive(boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    @JsonProperty("is_free")
    public boolean isIsFree() {
        return isFree;
    }

    @JsonProperty("is_free")
    public void setIsFree(boolean isFree) {
        this.isFree = isFree;
    }

    public Publication withIsFree(boolean isFree) {
        this.isFree = isFree;
        return this;
    }

    @JsonProperty("logo_in_list")
    public boolean isLogoInList() {
        return logoInList;
    }

    @JsonProperty("logo_in_list")
    public void setLogoInList(boolean logoInList) {
        this.logoInList = logoInList;
    }

    public Publication withLogoInList(boolean logoInList) {
        this.logoInList = logoInList;
        return this;
    }

    @JsonProperty("is_service_finished")
    public boolean isIsServiceFinished() {
        return isServiceFinished;
    }

    @JsonProperty("is_service_finished")
    public void setIsServiceFinished(boolean isServiceFinished) {
        this.isServiceFinished = isServiceFinished;
    }

    public Publication withIsServiceFinished(boolean isServiceFinished) {
        this.isServiceFinished = isServiceFinished;
        return this;
    }

    @JsonProperty("live_time")
    public long getLiveTime() {
        return liveTime;
    }

    @JsonProperty("live_time")
    public void setLiveTime(long liveTime) {
        this.liveTime = liveTime;
    }

    public Publication withLiveTime(long liveTime) {
        this.liveTime = liveTime;
        return this;
    }

    @JsonProperty("expired_at")
    public String getExpiredAt() {
        return expiredAt;
    }

    @JsonProperty("expired_at")
    public void setExpiredAt(String expiredAt) {
        this.expiredAt = expiredAt;
    }

    public Publication withExpiredAt(String expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }

    @JsonProperty("published_at")
    public String getPublishedAt() {
        return publishedAt;
    }

    @JsonProperty("published_at")
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Publication withPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Publication withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("is_dummy")
    public boolean isIsDummy() {
        return isDummy;
    }

    @JsonProperty("is_dummy")
    public void setIsDummy(boolean isDummy) {
        this.isDummy = isDummy;
    }

    public Publication withIsDummy(boolean isDummy) {
        this.isDummy = isDummy;
        return this;
    }

    @JsonProperty("is_deleted")
    public boolean isIsDeleted() {
        return isDeleted;
    }

    @JsonProperty("is_deleted")
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Publication withIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    @JsonProperty("prolong_data")
    public Object getProlongData() {
        return prolongData;
    }

    @JsonProperty("prolong_data")
    public void setProlongData(Object prolongData) {
        this.prolongData = prolongData;
    }

    public Publication withProlongData(Object prolongData) {
        this.prolongData = prolongData;
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

    public Publication withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(geoId).append(orderId).append(vacancyId).append(companyId).append(type).append(action).append(isActive).append(isFree).append(logoInList).append(isServiceFinished).append(liveTime).append(expiredAt).append(publishedAt).append(createdAt).append(isDummy).append(isDeleted).append(prolongData).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Publication)) {
            return false;
        }
        Publication rhs = ((Publication) other);
        return new EqualsBuilder().append(id, rhs.id).append(geoId, rhs.geoId).append(orderId, rhs.orderId).append(vacancyId, rhs.vacancyId).append(companyId, rhs.companyId).append(type, rhs.type).append(action, rhs.action).append(isActive, rhs.isActive).append(isFree, rhs.isFree).append(logoInList, rhs.logoInList).append(isServiceFinished, rhs.isServiceFinished).append(liveTime, rhs.liveTime).append(expiredAt, rhs.expiredAt).append(publishedAt, rhs.publishedAt).append(createdAt, rhs.createdAt).append(isDummy, rhs.isDummy).append(isDeleted, rhs.isDeleted).append(prolongData, rhs.prolongData).append(additionalProperties, rhs.additionalProperties).isEquals();
    }


    public int describeContents() {
        return 0;
    }

}
