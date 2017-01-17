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
        "icq",
        "skype",
        "email",
        "url",
        "street",
        "building",
        "room",
        "name",
        "firstname",
        "lastname",
        "patronymic",
        "phones",
        "city",
        "address_description",
        "coordinate",
        "address",
        "subway",
        "district",
        "microdistrict"
})
public class Contact implements Serializable {


    private final static long serialVersionUID = 7315453875011742275L;
    @JsonProperty("icq")
    private long icq;
    @JsonProperty("skype")
    private String skype;
    @JsonProperty("email")
    private Object email;
    @JsonProperty("url")
    private String url;
    @JsonProperty("street")
    private String street;
    @JsonProperty("building")
    private String building;
    @JsonProperty("room")
    private Object room;
    @JsonProperty("name")
    private String name;
    @JsonProperty("firstname")
    private Object firstname;
    @JsonProperty("lastname")
    private Object lastname;
    @JsonProperty("patronymic")
    private Object patronymic;
    @JsonProperty("phones")
    @Valid
    private List<Object> phones = null;
    @JsonProperty("city")
    @Valid
    private City city;
    @JsonProperty("address_description")
    private String addressDescription;
    @JsonProperty("coordinate")
    private Object coordinate;
    @JsonProperty("address")
    private String address;
    @JsonProperty("subway")
    private Object subway;
    @JsonProperty("district")
    private Object district;
    @JsonProperty("microdistrict")
    private Object microdistrict;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public Contact() {
    }

    /**
     * @param microdistrict
     * @param building
     * @param coordinate
     * @param addressDescription
     * @param street
     * @param lastname
     * @param icq
     * @param firstname
     * @param url
     * @param city
     * @param patronymic
     * @param phones
     * @param subway
     * @param address
     * @param email
     * @param name
     * @param district
     * @param skype
     * @param room
     */
    public Contact(long icq, String skype, Object email, String url, String street, String building, Object room, String name, Object firstname, Object lastname, Object patronymic, List<Object> phones, City city, String addressDescription, Object coordinate, String address, Object subway, Object district, Object microdistrict) {
        super();
        this.icq = icq;
        this.skype = skype;
        this.email = email;
        this.url = url;
        this.street = street;
        this.building = building;
        this.room = room;
        this.name = name;
        this.firstname = firstname;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.phones = phones;
        this.city = city;
        this.addressDescription = addressDescription;
        this.coordinate = coordinate;
        this.address = address;
        this.subway = subway;
        this.district = district;
        this.microdistrict = microdistrict;
    }

    @JsonProperty("icq")
    public long getIcq() {
        return icq;
    }

    @JsonProperty("icq")
    public void setIcq(long icq) {
        this.icq = icq;
    }

    public Contact withIcq(long icq) {
        this.icq = icq;
        return this;
    }

    @JsonProperty("skype")
    public String getSkype() {
        return skype;
    }

    @JsonProperty("skype")
    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Contact withSkype(String skype) {
        this.skype = skype;
        return this;
    }

    @JsonProperty("email")
    public Object getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(Object email) {
        this.email = email;
    }

    public Contact withEmail(Object email) {
        this.email = email;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Contact withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    public Contact withStreet(String street) {
        this.street = street;
        return this;
    }

    @JsonProperty("building")
    public String getBuilding() {
        return building;
    }

    @JsonProperty("building")
    public void setBuilding(String building) {
        this.building = building;
    }

    public Contact withBuilding(String building) {
        this.building = building;
        return this;
    }

    @JsonProperty("room")
    public Object getRoom() {
        return room;
    }

    @JsonProperty("room")
    public void setRoom(Object room) {
        this.room = room;
    }

    public Contact withRoom(Object room) {
        this.room = room;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Contact withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("firstname")
    public Object getFirstname() {
        return firstname;
    }

    @JsonProperty("firstname")
    public void setFirstname(Object firstname) {
        this.firstname = firstname;
    }

    public Contact withFirstname(Object firstname) {
        this.firstname = firstname;
        return this;
    }

    @JsonProperty("lastname")
    public Object getLastname() {
        return lastname;
    }

    @JsonProperty("lastname")
    public void setLastname(Object lastname) {
        this.lastname = lastname;
    }

    public Contact withLastname(Object lastname) {
        this.lastname = lastname;
        return this;
    }

    @JsonProperty("patronymic")
    public Object getPatronymic() {
        return patronymic;
    }

    @JsonProperty("patronymic")
    public void setPatronymic(Object patronymic) {
        this.patronymic = patronymic;
    }

    public Contact withPatronymic(Object patronymic) {
        this.patronymic = patronymic;
        return this;
    }

    @JsonProperty("phones")
    public List<Object> getPhones() {
        return phones;
    }

    @JsonProperty("phones")
    public void setPhones(List<Object> phones) {
        this.phones = phones;
    }

    public Contact withPhones(List<Object> phones) {
        this.phones = phones;
        return this;
    }

    @JsonProperty("city")
    public City getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(City city) {
        this.city = city;
    }

    public Contact withCity(City city) {
        this.city = city;
        return this;
    }

    @JsonProperty("address_description")
    public String getAddressDescription() {
        return addressDescription;
    }

    @JsonProperty("address_description")
    public void setAddressDescription(String addressDescription) {
        this.addressDescription = addressDescription;
    }

    public Contact withAddressDescription(String addressDescription) {
        this.addressDescription = addressDescription;
        return this;
    }

    @JsonProperty("coordinate")
    public Object getCoordinate() {
        return coordinate;
    }

    @JsonProperty("coordinate")
    public void setCoordinate(Object coordinate) {
        this.coordinate = coordinate;
    }

    public Contact withCoordinate(Object coordinate) {
        this.coordinate = coordinate;
        return this;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    public Contact withAddress(String address) {
        this.address = address;
        return this;
    }

    @JsonProperty("subway")
    public Object getSubway() {
        return subway;
    }

    @JsonProperty("subway")
    public void setSubway(Object subway) {
        this.subway = subway;
    }

    public Contact withSubway(Object subway) {
        this.subway = subway;
        return this;
    }

    @JsonProperty("district")
    public Object getDistrict() {
        return district;
    }

    @JsonProperty("district")
    public void setDistrict(Object district) {
        this.district = district;
    }

    public Contact withDistrict(Object district) {
        this.district = district;
        return this;
    }

    @JsonProperty("microdistrict")
    public Object getMicrodistrict() {
        return microdistrict;
    }

    @JsonProperty("microdistrict")
    public void setMicrodistrict(Object microdistrict) {
        this.microdistrict = microdistrict;
    }

    public Contact withMicrodistrict(Object microdistrict) {
        this.microdistrict = microdistrict;
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

    public Contact withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(icq).append(skype).append(email).append(url).append(street).append(building).append(room).append(name).append(firstname).append(lastname).append(patronymic).append(phones).append(city).append(addressDescription).append(coordinate).append(address).append(subway).append(district).append(microdistrict).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Contact) == false) {
            return false;
        }
        Contact rhs = ((Contact) other);
        return new EqualsBuilder().append(icq, rhs.icq).append(skype, rhs.skype).append(email, rhs.email).append(url, rhs.url).append(street, rhs.street).append(building, rhs.building).append(room, rhs.room).append(name, rhs.name).append(firstname, rhs.firstname).append(lastname, rhs.lastname).append(patronymic, rhs.patronymic).append(phones, rhs.phones).append(city, rhs.city).append(addressDescription, rhs.addressDescription).append(coordinate, rhs.coordinate).append(address, rhs.address).append(subway, rhs.subway).append(district, rhs.district).append(microdistrict, rhs.microdistrict).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    public int describeContents() {
        return 0;
    }

}
