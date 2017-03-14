package me.bbb1991.model2;

/**
 * Created by admin on 14.03.2017.
 */


        import java.io.Serializable;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;
        import com.fasterxml.jackson.annotation.JsonAnyGetter;
        import com.fasterxml.jackson.annotation.JsonAnySetter;
        import com.fasterxml.jackson.annotation.JsonIgnore;
        import com.fasterxml.jackson.annotation.JsonInclude;
        import com.fasterxml.jackson.annotation.JsonProperty;
        import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "global_id",
        "system_object_id",
        "Dataset",
        "RegisterID",
        "Photo",
        "Id",
        "ObjectName",
        "ObjectShortName",
        "FacilityType",
        "SportZoneName",
        "SportZoneType",
        "PropertyType",
        "DepartamentalAffiliationType",
        "AdmArea",
        "District",
        "Address",
        "Email",
        "WebSite",
        "HelpPhone",
        "ObjectOperOrgName",
        "ObjectOperOrgOgrn",
        "ObjectWorkingHours",
        "ObjectHasEquipmentRental",
        "ObjectHasTechService",
        "ObjectHasDressingRoom",
        "ObjectHasEatery",
        "ObjectHasToilet",
        "ObjectHasWifi",
        "ObjectHasCashMachine",
        "ObjectHasFirstAidPost",
        "ObjectHasMusic",
        "SportZoneLongitudeWGS84",
        "SportZoneLatitudeWGS84",
        "SportZoneUsagePeriodFrom",
        "SportZoneUsagePeriodTo",
        "SportZoneWorkingHours",
        "SportZoneStatus",
        "SportZoneArea",
        "SportZoneLength",
        "SportZoneWidth",
        "SportZoneLighting",
        "SportZoneSurfaceType",
        "SportZoneHasMusic",
        "SportZoneDisabilityFriendly",
        "SportZoneService",
        "geoData",
        "HelpPhoneExtension",
        "SportZoneEquipmentComments"
})
public class Aqua implements Serializable
{

    @JsonProperty("global_id")
    private Integer globalId;
    @JsonProperty("system_object_id")
    private String systemObjectId;
    @JsonProperty("Dataset")
    private String dataset;
    @JsonProperty("RegisterID")
    private Double registerID;
    @JsonProperty("Photo")
    private List<String> photo = null;
    @JsonProperty("Id")
    private Double id;
    @JsonProperty("ObjectName")
    private String objectName;
    @JsonProperty("ObjectShortName")
    private String objectShortName;
    @JsonProperty("FacilityType")
    private String facilityType;
    @JsonProperty("SportZoneName")
    private String sportZoneName;
    @JsonProperty("SportZoneType")
    private String sportZoneType;
    @JsonProperty("PropertyType")
    private String propertyType;
    @JsonProperty("DepartamentalAffiliationType")
    private String departamentalAffiliationType;
    @JsonProperty("AdmArea")
    private String admArea;
    @JsonProperty("District")
    private String district;
    @JsonProperty("Address")
    private String address;
    @JsonProperty("Email")
    private String email;
    @JsonProperty("WebSite")
    private String webSite;
    @JsonProperty("HelpPhone")
    private String helpPhone;
    @JsonProperty("ObjectOperOrgName")
    private String objectOperOrgName;
    @JsonProperty("ObjectOperOrgOgrn")
    private String objectOperOrgOgrn;
    @JsonProperty("ObjectWorkingHours")
    private List<ObjectWorkingHour> objectWorkingHours = null;
    @JsonProperty("ObjectHasEquipmentRental")
    private String objectHasEquipmentRental;
    @JsonProperty("ObjectHasTechService")
    private String objectHasTechService;
    @JsonProperty("ObjectHasDressingRoom")
    private String objectHasDressingRoom;
    @JsonProperty("ObjectHasEatery")
    private String objectHasEatery;
    @JsonProperty("ObjectHasToilet")
    private String objectHasToilet;
    @JsonProperty("ObjectHasWifi")
    private String objectHasWifi;
    @JsonProperty("ObjectHasCashMachine")
    private String objectHasCashMachine;
    @JsonProperty("ObjectHasFirstAidPost")
    private String objectHasFirstAidPost;
    @JsonProperty("ObjectHasMusic")
    private String objectHasMusic;
    @JsonProperty("SportZoneLongitudeWGS84")
    private String sportZoneLongitudeWGS84;
    @JsonProperty("SportZoneLatitudeWGS84")
    private String sportZoneLatitudeWGS84;
    @JsonProperty("SportZoneUsagePeriodFrom")
    private String sportZoneUsagePeriodFrom;
    @JsonProperty("SportZoneUsagePeriodTo")
    private String sportZoneUsagePeriodTo;
    @JsonProperty("SportZoneWorkingHours")
    private List<SportZoneWorkingHour> sportZoneWorkingHours = null;
    @JsonProperty("SportZoneStatus")
    private String sportZoneStatus;
    @JsonProperty("SportZoneArea")
    private Double sportZoneArea;
    @JsonProperty("SportZoneLength")
    private Double sportZoneLength;
    @JsonProperty("SportZoneWidth")
    private Double sportZoneWidth;
    @JsonProperty("SportZoneLighting")
    private String sportZoneLighting;
    @JsonProperty("SportZoneSurfaceType")
    private String sportZoneSurfaceType;
    @JsonProperty("SportZoneHasMusic")
    private String sportZoneHasMusic;
    @JsonProperty("SportZoneDisabilityFriendly")
    private String sportZoneDisabilityFriendly;
    @JsonProperty("SportZoneService")
    private List<Object> sportZoneService = null;
    @JsonProperty("geoData")
    private GeoData geoData;
    @JsonProperty("HelpPhoneExtension")
    private String helpPhoneExtension;
    @JsonProperty("SportZoneEquipmentComments")
    private String sportZoneEquipmentComments;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1065221357433941883L;

    @JsonProperty("global_id")
    public Integer getGlobalId() {
        return globalId;
    }

    @JsonProperty("global_id")
    public void setGlobalId(Integer globalId) {
        this.globalId = globalId;
    }

    @JsonProperty("system_object_id")
    public String getSystemObjectId() {
        return systemObjectId;
    }

    @JsonProperty("system_object_id")
    public void setSystemObjectId(String systemObjectId) {
        this.systemObjectId = systemObjectId;
    }

    @JsonProperty("Dataset")
    public String getDataset() {
        return dataset;
    }

    @JsonProperty("Dataset")
    public void setDataset(String dataset) {
        this.dataset = dataset;
    }

    @JsonProperty("RegisterID")
    public Double getRegisterID() {
        return registerID;
    }

    @JsonProperty("RegisterID")
    public void setRegisterID(Double registerID) {
        this.registerID = registerID;
    }

    @JsonProperty("Photo")
    public List<String> getPhoto() {
        return photo;
    }

    @JsonProperty("Photo")
    public void setPhoto(List<String> photo) {
        this.photo = photo;
    }

    @JsonProperty("Id")
    public Double getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(Double id) {
        this.id = id;
    }

    @JsonProperty("ObjectName")
    public String getObjectName() {
        return objectName;
    }

    @JsonProperty("ObjectName")
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    @JsonProperty("ObjectShortName")
    public String getObjectShortName() {
        return objectShortName;
    }

    @JsonProperty("ObjectShortName")
    public void setObjectShortName(String objectShortName) {
        this.objectShortName = objectShortName;
    }

    @JsonProperty("FacilityType")
    public String getFacilityType() {
        return facilityType;
    }

    @JsonProperty("FacilityType")
    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    @JsonProperty("SportZoneName")
    public String getSportZoneName() {
        return sportZoneName;
    }

    @JsonProperty("SportZoneName")
    public void setSportZoneName(String sportZoneName) {
        this.sportZoneName = sportZoneName;
    }

    @JsonProperty("SportZoneType")
    public String getSportZoneType() {
        return sportZoneType;
    }

    @JsonProperty("SportZoneType")
    public void setSportZoneType(String sportZoneType) {
        this.sportZoneType = sportZoneType;
    }

    @JsonProperty("PropertyType")
    public String getPropertyType() {
        return propertyType;
    }

    @JsonProperty("PropertyType")
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    @JsonProperty("DepartamentalAffiliationType")
    public String getDepartamentalAffiliationType() {
        return departamentalAffiliationType;
    }

    @JsonProperty("DepartamentalAffiliationType")
    public void setDepartamentalAffiliationType(String departamentalAffiliationType) {
        this.departamentalAffiliationType = departamentalAffiliationType;
    }

    @JsonProperty("AdmArea")
    public String getAdmArea() {
        return admArea;
    }

    @JsonProperty("AdmArea")
    public void setAdmArea(String admArea) {
        this.admArea = admArea;
    }

    @JsonProperty("District")
    public String getDistrict() {
        return district;
    }

    @JsonProperty("District")
    public void setDistrict(String district) {
        this.district = district;
    }

    @JsonProperty("Address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("Address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("Email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("Email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("WebSite")
    public String getWebSite() {
        return webSite;
    }

    @JsonProperty("WebSite")
    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    @JsonProperty("HelpPhone")
    public String getHelpPhone() {
        return helpPhone;
    }

    @JsonProperty("HelpPhone")
    public void setHelpPhone(String helpPhone) {
        this.helpPhone = helpPhone;
    }

    @JsonProperty("ObjectOperOrgName")
    public String getObjectOperOrgName() {
        return objectOperOrgName;
    }

    @JsonProperty("ObjectOperOrgName")
    public void setObjectOperOrgName(String objectOperOrgName) {
        this.objectOperOrgName = objectOperOrgName;
    }

    @JsonProperty("ObjectOperOrgOgrn")
    public String getObjectOperOrgOgrn() {
        return objectOperOrgOgrn;
    }

    @JsonProperty("ObjectOperOrgOgrn")
    public void setObjectOperOrgOgrn(String objectOperOrgOgrn) {
        this.objectOperOrgOgrn = objectOperOrgOgrn;
    }

    @JsonProperty("ObjectWorkingHours")
    public List<ObjectWorkingHour> getObjectWorkingHours() {
        return objectWorkingHours;
    }

    @JsonProperty("ObjectWorkingHours")
    public void setObjectWorkingHours(List<ObjectWorkingHour> objectWorkingHours) {
        this.objectWorkingHours = objectWorkingHours;
    }

    @JsonProperty("ObjectHasEquipmentRental")
    public String getObjectHasEquipmentRental() {
        return objectHasEquipmentRental;
    }

    @JsonProperty("ObjectHasEquipmentRental")
    public void setObjectHasEquipmentRental(String objectHasEquipmentRental) {
        this.objectHasEquipmentRental = objectHasEquipmentRental;
    }

    @JsonProperty("ObjectHasTechService")
    public String getObjectHasTechService() {
        return objectHasTechService;
    }

    @JsonProperty("ObjectHasTechService")
    public void setObjectHasTechService(String objectHasTechService) {
        this.objectHasTechService = objectHasTechService;
    }

    @JsonProperty("ObjectHasDressingRoom")
    public String getObjectHasDressingRoom() {
        return objectHasDressingRoom;
    }

    @JsonProperty("ObjectHasDressingRoom")
    public void setObjectHasDressingRoom(String objectHasDressingRoom) {
        this.objectHasDressingRoom = objectHasDressingRoom;
    }

    @JsonProperty("ObjectHasEatery")
    public String getObjectHasEatery() {
        return objectHasEatery;
    }

    @JsonProperty("ObjectHasEatery")
    public void setObjectHasEatery(String objectHasEatery) {
        this.objectHasEatery = objectHasEatery;
    }

    @JsonProperty("ObjectHasToilet")
    public String getObjectHasToilet() {
        return objectHasToilet;
    }

    @JsonProperty("ObjectHasToilet")
    public void setObjectHasToilet(String objectHasToilet) {
        this.objectHasToilet = objectHasToilet;
    }

    @JsonProperty("ObjectHasWifi")
    public String getObjectHasWifi() {
        return objectHasWifi;
    }

    @JsonProperty("ObjectHasWifi")
    public void setObjectHasWifi(String objectHasWifi) {
        this.objectHasWifi = objectHasWifi;
    }

    @JsonProperty("ObjectHasCashMachine")
    public String getObjectHasCashMachine() {
        return objectHasCashMachine;
    }

    @JsonProperty("ObjectHasCashMachine")
    public void setObjectHasCashMachine(String objectHasCashMachine) {
        this.objectHasCashMachine = objectHasCashMachine;
    }

    @JsonProperty("ObjectHasFirstAidPost")
    public String getObjectHasFirstAidPost() {
        return objectHasFirstAidPost;
    }

    @JsonProperty("ObjectHasFirstAidPost")
    public void setObjectHasFirstAidPost(String objectHasFirstAidPost) {
        this.objectHasFirstAidPost = objectHasFirstAidPost;
    }

    @JsonProperty("ObjectHasMusic")
    public String getObjectHasMusic() {
        return objectHasMusic;
    }

    @JsonProperty("ObjectHasMusic")
    public void setObjectHasMusic(String objectHasMusic) {
        this.objectHasMusic = objectHasMusic;
    }

    @JsonProperty("SportZoneLongitudeWGS84")
    public String getSportZoneLongitudeWGS84() {
        return sportZoneLongitudeWGS84;
    }

    @JsonProperty("SportZoneLongitudeWGS84")
    public void setSportZoneLongitudeWGS84(String sportZoneLongitudeWGS84) {
        this.sportZoneLongitudeWGS84 = sportZoneLongitudeWGS84;
    }

    @JsonProperty("SportZoneLatitudeWGS84")
    public String getSportZoneLatitudeWGS84() {
        return sportZoneLatitudeWGS84;
    }

    @JsonProperty("SportZoneLatitudeWGS84")
    public void setSportZoneLatitudeWGS84(String sportZoneLatitudeWGS84) {
        this.sportZoneLatitudeWGS84 = sportZoneLatitudeWGS84;
    }

    @JsonProperty("SportZoneUsagePeriodFrom")
    public String getSportZoneUsagePeriodFrom() {
        return sportZoneUsagePeriodFrom;
    }

    @JsonProperty("SportZoneUsagePeriodFrom")
    public void setSportZoneUsagePeriodFrom(String sportZoneUsagePeriodFrom) {
        this.sportZoneUsagePeriodFrom = sportZoneUsagePeriodFrom;
    }

    @JsonProperty("SportZoneUsagePeriodTo")
    public String getSportZoneUsagePeriodTo() {
        return sportZoneUsagePeriodTo;
    }

    @JsonProperty("SportZoneUsagePeriodTo")
    public void setSportZoneUsagePeriodTo(String sportZoneUsagePeriodTo) {
        this.sportZoneUsagePeriodTo = sportZoneUsagePeriodTo;
    }

    @JsonProperty("SportZoneWorkingHours")
    public List<SportZoneWorkingHour> getSportZoneWorkingHours() {
        return sportZoneWorkingHours;
    }

    @JsonProperty("SportZoneWorkingHours")
    public void setSportZoneWorkingHours(List<SportZoneWorkingHour> sportZoneWorkingHours) {
        this.sportZoneWorkingHours = sportZoneWorkingHours;
    }

    @JsonProperty("SportZoneStatus")
    public String getSportZoneStatus() {
        return sportZoneStatus;
    }

    @JsonProperty("SportZoneStatus")
    public void setSportZoneStatus(String sportZoneStatus) {
        this.sportZoneStatus = sportZoneStatus;
    }

    @JsonProperty("SportZoneArea")
    public Double getSportZoneArea() {
        return sportZoneArea;
    }

    @JsonProperty("SportZoneArea")
    public void setSportZoneArea(Double sportZoneArea) {
        this.sportZoneArea = sportZoneArea;
    }

    @JsonProperty("SportZoneLength")
    public Double getSportZoneLength() {
        return sportZoneLength;
    }

    @JsonProperty("SportZoneLength")
    public void setSportZoneLength(Double sportZoneLength) {
        this.sportZoneLength = sportZoneLength;
    }

    @JsonProperty("SportZoneWidth")
    public Double getSportZoneWidth() {
        return sportZoneWidth;
    }

    @JsonProperty("SportZoneWidth")
    public void setSportZoneWidth(Double sportZoneWidth) {
        this.sportZoneWidth = sportZoneWidth;
    }

    @JsonProperty("SportZoneLighting")
    public String getSportZoneLighting() {
        return sportZoneLighting;
    }

    @JsonProperty("SportZoneLighting")
    public void setSportZoneLighting(String sportZoneLighting) {
        this.sportZoneLighting = sportZoneLighting;
    }

    @JsonProperty("SportZoneSurfaceType")
    public String getSportZoneSurfaceType() {
        return sportZoneSurfaceType;
    }

    @JsonProperty("SportZoneSurfaceType")
    public void setSportZoneSurfaceType(String sportZoneSurfaceType) {
        this.sportZoneSurfaceType = sportZoneSurfaceType;
    }

    @JsonProperty("SportZoneHasMusic")
    public String getSportZoneHasMusic() {
        return sportZoneHasMusic;
    }

    @JsonProperty("SportZoneHasMusic")
    public void setSportZoneHasMusic(String sportZoneHasMusic) {
        this.sportZoneHasMusic = sportZoneHasMusic;
    }

    @JsonProperty("SportZoneDisabilityFriendly")
    public String getSportZoneDisabilityFriendly() {
        return sportZoneDisabilityFriendly;
    }

    @JsonProperty("SportZoneDisabilityFriendly")
    public void setSportZoneDisabilityFriendly(String sportZoneDisabilityFriendly) {
        this.sportZoneDisabilityFriendly = sportZoneDisabilityFriendly;
    }

    @JsonProperty("SportZoneService")
    public List<Object> getSportZoneService() {
        return sportZoneService;
    }

    @JsonProperty("SportZoneService")
    public void setSportZoneService(List<Object> sportZoneService) {
        this.sportZoneService = sportZoneService;
    }

    @JsonProperty("geoData")
    public GeoData getGeoData() {
        return geoData;
    }

    @JsonProperty("geoData")
    public void setGeoData(GeoData geoData) {
        this.geoData = geoData;
    }

    @JsonProperty("HelpPhoneExtension")
    public String getHelpPhoneExtension() {
        return helpPhoneExtension;
    }

    @JsonProperty("HelpPhoneExtension")
    public void setHelpPhoneExtension(String helpPhoneExtension) {
        this.helpPhoneExtension = helpPhoneExtension;
    }

    @JsonProperty("SportZoneEquipmentComments")
    public String getSportZoneEquipmentComments() {
        return sportZoneEquipmentComments;
    }

    @JsonProperty("SportZoneEquipmentComments")
    public void setSportZoneEquipmentComments(String sportZoneEquipmentComments) {
        this.sportZoneEquipmentComments = sportZoneEquipmentComments;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Aqua{" +
                "globalId=" + globalId +
                ", objectName='" + objectName + '\'' +
                '}';
    }
}





