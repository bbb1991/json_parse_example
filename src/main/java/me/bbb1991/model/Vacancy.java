package me.bbb1991.model;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "add_date",
        "owner_id",
        "header",
        "state",
        "validate_state",
        "visibility_type",
        "removal",
        "site_id",
        "bonus",
        "salary_min",
        "salary_max",
        "currency",
        "education",
        "experience_length",
        "working_type",
        "schedule",
        "publication",
        "user_type",
        "description",
        "contact",
        "address",
        "payment_type_alias",
        "payment_type",
        "company",
        "mod_date",
        "views",
        "is_anonymous",
        "owner",
        "is_moderated",
        "imported_via",
        "subways",
        "tags",
        "institutions",
        "jobs",
        "show_email",
        "show_phone",
        "use_messages",
        "is_commerce",
        "is_upped",
        "is_premium",
        "log_state_update",
        "favorite",
        "hided",
        "url",
        "salary_min_rub",
        "salary_max_rub",
        "rubrics",
        "requirements_short",
        "requirements",
        "priority",
        "salary",
        "salary_formatted",
        "can_accept_replies"
})
public class Vacancy implements Serializable {

    private final static long serialVersionUID = 1976891630350005724L;
    @JsonProperty("id")
    private long id;
    @JsonProperty("add_date")
    private String addDate;
    @JsonProperty("owner_id")
    private long ownerId;
    @JsonProperty("header")
    private String header;
    @JsonProperty("state")
    private long state;
    @JsonProperty("validate_state")
    private long validateState;
    @JsonProperty("visibility_type")
    private String visibilityType;
    @JsonProperty("removal")
    private boolean removal;
    @JsonProperty("site_id")
    private long siteId;
    @JsonProperty("bonus")
    private long bonus;
    @JsonProperty("salary_min")
    private long salaryMin;
    @JsonProperty("salary_max")
    private long salaryMax;
    @JsonProperty("currency")
    @Valid
    private Currency currency;
    @JsonProperty("education")
    @Valid
    private Education education;
    @JsonProperty("experience_length")
    @Valid
    private ExperienceLength experienceLength;
    @JsonProperty("working_type")
    @Valid
    private WorkingType workingType;
    @JsonProperty("schedule")
    @Valid
    private Schedule schedule;
    @JsonProperty("publication")
    @Valid
    private Publication publication;
    @JsonProperty("user_type")
    private String userType;
    @JsonProperty("description")
    private String description;
    @JsonProperty("contact")
    @Valid
    private Contact contact;
    @JsonProperty("address")
    private Object address;
    @JsonProperty("payment_type_alias")
    private String paymentTypeAlias;
    @JsonProperty("payment_type")
    @Valid
    private PaymentType paymentType;
    @JsonProperty("company")
    @Valid
    private Company company;
    @JsonProperty("mod_date")
    private String modDate;
    @JsonProperty("views")
    private long views;
    @JsonProperty("is_anonymous")
    private boolean isAnonymous;
    @JsonProperty("owner")
    @Valid
    private Owner owner;
    @JsonProperty("is_moderated")
    private boolean isModerated;
    @JsonProperty("imported_via")
    private Object importedVia;
    @JsonProperty("subways")
    @Valid
    private List<Object> subways = null;
    @JsonProperty("tags")
    @Valid
    private List<Object> tags = null;
    @JsonProperty("institutions")
    @Valid
    private List<Object> institutions = null;
    @JsonProperty("jobs")
    @Valid
    private List<Object> jobs = null;
    @JsonProperty("show_email")
    private boolean showEmail;
    @JsonProperty("show_phone")
    private boolean showPhone;
    @JsonProperty("use_messages")
    private boolean useMessages;
    @JsonProperty("is_commerce")
    private boolean isCommerce;
    @JsonProperty("is_upped")
    private boolean isUpped;
    @JsonProperty("is_premium")
    private boolean isPremium;
    @JsonProperty("log_state_update")
    private Object logStateUpdate;
    @JsonProperty("favorite")
    private boolean favorite;
    @JsonProperty("hided")
    private boolean hided;
    @JsonProperty("url")
    private String url;
    @JsonProperty("salary_min_rub")
    private long salaryMinRub;
    @JsonProperty("salary_max_rub")
    private long salaryMaxRub;
    @JsonProperty("rubrics")
    @Valid
    private List<Rubric> rubrics = null;
    @JsonProperty("requirements_short")
    private String requirementsShort;
    @JsonProperty("requirements")
    private String requirements;
    @JsonProperty("priority")
    private long priority;
    @JsonProperty("salary")
    private String salary;
    @JsonProperty("salary_formatted")
    private String salaryFormatted;
    @JsonProperty("can_accept_replies")
    private boolean canAcceptReplies;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<>();

    public Vacancy() {
    }

    public Vacancy(long id, String addDate, long ownerId, String header, long state, long validateState, String visibilityType, boolean removal, long siteId, long bonus, long salaryMin, long salaryMax, Currency currency, Education education, ExperienceLength experienceLength, WorkingType workingType, Schedule schedule, Publication publication, String userType, String description, Contact contact, Object address, String paymentTypeAlias, PaymentType paymentType, Company company, String modDate, long views, boolean isAnonymous, Owner owner, boolean isModerated, Object importedVia, List<Object> subways, List<Object> tags, List<Object> institutions, List<Object> jobs, boolean showEmail, boolean showPhone, boolean useMessages, boolean isCommerce, boolean isUpped, boolean isPremium, Object logStateUpdate, boolean favorite, boolean hided, String url, long salaryMinRub, long salaryMaxRub, List<Rubric> rubrics, String requirementsShort, String requirements, long priority, String salary, String salaryFormatted, boolean canAcceptReplies) {
        super();
        this.id = id;
        this.addDate = addDate;
        this.ownerId = ownerId;
        this.header = header;
        this.state = state;
        this.validateState = validateState;
        this.visibilityType = visibilityType;
        this.removal = removal;
        this.siteId = siteId;
        this.bonus = bonus;
        this.salaryMin = salaryMin;
        this.salaryMax = salaryMax;
        this.currency = currency;
        this.education = education;
        this.experienceLength = experienceLength;
        this.workingType = workingType;
        this.schedule = schedule;
        this.publication = publication;
        this.userType = userType;
        this.description = description;
        this.contact = contact;
        this.address = address;
        this.paymentTypeAlias = paymentTypeAlias;
        this.paymentType = paymentType;
        this.company = company;
        this.modDate = modDate;
        this.views = views;
        this.isAnonymous = isAnonymous;
        this.owner = owner;
        this.isModerated = isModerated;
        this.importedVia = importedVia;
        this.subways = subways;
        this.tags = tags;
        this.institutions = institutions;
        this.jobs = jobs;
        this.showEmail = showEmail;
        this.showPhone = showPhone;
        this.useMessages = useMessages;
        this.isCommerce = isCommerce;
        this.isUpped = isUpped;
        this.isPremium = isPremium;
        this.logStateUpdate = logStateUpdate;
        this.favorite = favorite;
        this.hided = hided;
        this.url = url;
        this.salaryMinRub = salaryMinRub;
        this.salaryMaxRub = salaryMaxRub;
        this.rubrics = rubrics;
        this.requirementsShort = requirementsShort;
        this.requirements = requirements;
        this.priority = priority;
        this.salary = salary;
        this.salaryFormatted = salaryFormatted;
        this.canAcceptReplies = canAcceptReplies;
    }

    @JsonProperty("id")
    public long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public Vacancy withId(long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("add_date")
    public String getAddDate() {
        return addDate;
    }

    @JsonProperty("add_date")
    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    public Vacancy withAddDate(String addDate) {
        this.addDate = addDate;
        return this;
    }

    @JsonProperty("owner_id")
    public long getOwnerId() {
        return ownerId;
    }

    @JsonProperty("owner_id")
    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public Vacancy withOwnerId(long ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    @JsonProperty("header")
    public String getHeader() {
        return header;
    }

    @JsonProperty("header")
    public void setHeader(String header) {
        this.header = header;
    }

    public Vacancy withHeader(String header) {
        this.header = header;
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

    public Vacancy withState(long state) {
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

    public Vacancy withValidateState(long validateState) {
        this.validateState = validateState;
        return this;
    }

    @JsonProperty("visibility_type")
    public String getVisibilityType() {
        return visibilityType;
    }

    @JsonProperty("visibility_type")
    public void setVisibilityType(String visibilityType) {
        this.visibilityType = visibilityType;
    }

    public Vacancy withVisibilityType(String visibilityType) {
        this.visibilityType = visibilityType;
        return this;
    }

    @JsonProperty("removal")
    public boolean isRemoval() {
        return removal;
    }

    @JsonProperty("removal")
    public void setRemoval(boolean removal) {
        this.removal = removal;
    }

    public Vacancy withRemoval(boolean removal) {
        this.removal = removal;
        return this;
    }

    @JsonProperty("site_id")
    public long getSiteId() {
        return siteId;
    }

    @JsonProperty("site_id")
    public void setSiteId(long siteId) {
        this.siteId = siteId;
    }

    public Vacancy withSiteId(long siteId) {
        this.siteId = siteId;
        return this;
    }

    @JsonProperty("bonus")
    public long getBonus() {
        return bonus;
    }

    @JsonProperty("bonus")
    public void setBonus(long bonus) {
        this.bonus = bonus;
    }

    public Vacancy withBonus(long bonus) {
        this.bonus = bonus;
        return this;
    }

    @JsonProperty("salary_min")
    public long getSalaryMin() {
        return salaryMin;
    }

    @JsonProperty("salary_min")
    public void setSalaryMin(long salaryMin) {
        this.salaryMin = salaryMin;
    }

    public Vacancy withSalaryMin(long salaryMin) {
        this.salaryMin = salaryMin;
        return this;
    }

    @JsonProperty("salary_max")
    public long getSalaryMax() {
        return salaryMax;
    }

    @JsonProperty("salary_max")
    public void setSalaryMax(long salaryMax) {
        this.salaryMax = salaryMax;
    }

    public Vacancy withSalaryMax(long salaryMax) {
        this.salaryMax = salaryMax;
        return this;
    }

    @JsonProperty("currency")
    public Currency getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Vacancy withCurrency(Currency currency) {
        this.currency = currency;
        return this;
    }

    @JsonProperty("education")
    public Education getEducation() {
        return education;
    }

    @JsonProperty("education")
    public void setEducation(Education education) {
        this.education = education;
    }

    public Vacancy withEducation(Education education) {
        this.education = education;
        return this;
    }

    @JsonProperty("experience_length")
    public ExperienceLength getExperienceLength() {
        return experienceLength;
    }

    @JsonProperty("experience_length")
    public void setExperienceLength(ExperienceLength experienceLength) {
        this.experienceLength = experienceLength;
    }

    public Vacancy withExperienceLength(ExperienceLength experienceLength) {
        this.experienceLength = experienceLength;
        return this;
    }

    @JsonProperty("working_type")
    public WorkingType getWorkingType() {
        return workingType;
    }

    @JsonProperty("working_type")
    public void setWorkingType(WorkingType workingType) {
        this.workingType = workingType;
    }

    public Vacancy withWorkingType(WorkingType workingType) {
        this.workingType = workingType;
        return this;
    }

    @JsonProperty("schedule")
    public Schedule getSchedule() {
        return schedule;
    }

    @JsonProperty("schedule")
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Vacancy withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    @JsonProperty("publication")
    public Publication getPublication() {
        return publication;
    }

    @JsonProperty("publication")
    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public Vacancy withPublication(Publication publication) {
        this.publication = publication;
        return this;
    }

    @JsonProperty("user_type")
    public String getUserType() {
        return userType;
    }

    @JsonProperty("user_type")
    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Vacancy withUserType(String userType) {
        this.userType = userType;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Vacancy withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("contact")
    public Contact getContact() {
        return contact;
    }

    @JsonProperty("contact")
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Vacancy withContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    @JsonProperty("address")
    public Object getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Object address) {
        this.address = address;
    }

    public Vacancy withAddress(Object address) {
        this.address = address;
        return this;
    }

    @JsonProperty("payment_type_alias")
    public String getPaymentTypeAlias() {
        return paymentTypeAlias;
    }

    @JsonProperty("payment_type_alias")
    public void setPaymentTypeAlias(String paymentTypeAlias) {
        this.paymentTypeAlias = paymentTypeAlias;
    }

    public Vacancy withPaymentTypeAlias(String paymentTypeAlias) {
        this.paymentTypeAlias = paymentTypeAlias;
        return this;
    }

    @JsonProperty("payment_type")
    public PaymentType getPaymentType() {
        return paymentType;
    }

    @JsonProperty("payment_type")
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public Vacancy withPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    @JsonProperty("company")
    public Company getCompany() {
        return company;
    }

    @JsonProperty("company")
    public void setCompany(Company company) {
        this.company = company;
    }

    public Vacancy withCompany(Company company) {
        this.company = company;
        return this;
    }

    @JsonProperty("mod_date")
    public String getModDate() {
        return modDate;
    }

    @JsonProperty("mod_date")
    public void setModDate(String modDate) {
        this.modDate = modDate;
    }

    public Vacancy withModDate(String modDate) {
        this.modDate = modDate;
        return this;
    }

    @JsonProperty("views")
    public long getViews() {
        return views;
    }

    @JsonProperty("views")
    public void setViews(long views) {
        this.views = views;
    }

    public Vacancy withViews(long views) {
        this.views = views;
        return this;
    }

    @JsonProperty("is_anonymous")
    public boolean isIsAnonymous() {
        return isAnonymous;
    }

    @JsonProperty("is_anonymous")
    public void setIsAnonymous(boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public Vacancy withIsAnonymous(boolean isAnonymous) {
        this.isAnonymous = isAnonymous;
        return this;
    }

    @JsonProperty("owner")
    public Owner getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Vacancy withOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    @JsonProperty("is_moderated")
    public boolean isIsModerated() {
        return isModerated;
    }

    @JsonProperty("is_moderated")
    public void setIsModerated(boolean isModerated) {
        this.isModerated = isModerated;
    }

    public Vacancy withIsModerated(boolean isModerated) {
        this.isModerated = isModerated;
        return this;
    }

    @JsonProperty("imported_via")
    public Object getImportedVia() {
        return importedVia;
    }

    @JsonProperty("imported_via")
    public void setImportedVia(Object importedVia) {
        this.importedVia = importedVia;
    }

    public Vacancy withImportedVia(Object importedVia) {
        this.importedVia = importedVia;
        return this;
    }

    @JsonProperty("subways")
    public List<Object> getSubways() {
        return subways;
    }

    @JsonProperty("subways")
    public void setSubways(List<Object> subways) {
        this.subways = subways;
    }

    public Vacancy withSubways(List<Object> subways) {
        this.subways = subways;
        return this;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public Vacancy withTags(List<Object> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("institutions")
    public List<Object> getInstitutions() {
        return institutions;
    }

    @JsonProperty("institutions")
    public void setInstitutions(List<Object> institutions) {
        this.institutions = institutions;
    }

    public Vacancy withInstitutions(List<Object> institutions) {
        this.institutions = institutions;
        return this;
    }

    @JsonProperty("jobs")
    public List<Object> getJobs() {
        return jobs;
    }

    @JsonProperty("jobs")
    public void setJobs(List<Object> jobs) {
        this.jobs = jobs;
    }

    public Vacancy withJobs(List<Object> jobs) {
        this.jobs = jobs;
        return this;
    }

    @JsonProperty("show_email")
    public boolean isShowEmail() {
        return showEmail;
    }

    @JsonProperty("show_email")
    public void setShowEmail(boolean showEmail) {
        this.showEmail = showEmail;
    }

    public Vacancy withShowEmail(boolean showEmail) {
        this.showEmail = showEmail;
        return this;
    }

    @JsonProperty("show_phone")
    public boolean isShowPhone() {
        return showPhone;
    }

    @JsonProperty("show_phone")
    public void setShowPhone(boolean showPhone) {
        this.showPhone = showPhone;
    }

    public Vacancy withShowPhone(boolean showPhone) {
        this.showPhone = showPhone;
        return this;
    }

    @JsonProperty("use_messages")
    public boolean isUseMessages() {
        return useMessages;
    }

    @JsonProperty("use_messages")
    public void setUseMessages(boolean useMessages) {
        this.useMessages = useMessages;
    }

    public Vacancy withUseMessages(boolean useMessages) {
        this.useMessages = useMessages;
        return this;
    }

    @JsonProperty("is_commerce")
    public boolean isIsCommerce() {
        return isCommerce;
    }

    @JsonProperty("is_commerce")
    public void setIsCommerce(boolean isCommerce) {
        this.isCommerce = isCommerce;
    }

    public Vacancy withIsCommerce(boolean isCommerce) {
        this.isCommerce = isCommerce;
        return this;
    }

    @JsonProperty("is_upped")
    public boolean isIsUpped() {
        return isUpped;
    }

    @JsonProperty("is_upped")
    public void setIsUpped(boolean isUpped) {
        this.isUpped = isUpped;
    }

    public Vacancy withIsUpped(boolean isUpped) {
        this.isUpped = isUpped;
        return this;
    }

    @JsonProperty("is_premium")
    public boolean isIsPremium() {
        return isPremium;
    }

    @JsonProperty("is_premium")
    public void setIsPremium(boolean isPremium) {
        this.isPremium = isPremium;
    }

    public Vacancy withIsPremium(boolean isPremium) {
        this.isPremium = isPremium;
        return this;
    }

    @JsonProperty("log_state_update")
    public Object getLogStateUpdate() {
        return logStateUpdate;
    }

    @JsonProperty("log_state_update")
    public void setLogStateUpdate(Object logStateUpdate) {
        this.logStateUpdate = logStateUpdate;
    }

    public Vacancy withLogStateUpdate(Object logStateUpdate) {
        this.logStateUpdate = logStateUpdate;
        return this;
    }

    @JsonProperty("favorite")
    public boolean isFavorite() {
        return favorite;
    }

    @JsonProperty("favorite")
    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public Vacancy withFavorite(boolean favorite) {
        this.favorite = favorite;
        return this;
    }

    @JsonProperty("hided")
    public boolean isHided() {
        return hided;
    }

    @JsonProperty("hided")
    public void setHided(boolean hided) {
        this.hided = hided;
    }

    public Vacancy withHided(boolean hided) {
        this.hided = hided;
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

    public Vacancy withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("salary_min_rub")
    public long getSalaryMinRub() {
        return salaryMinRub;
    }

    @JsonProperty("salary_min_rub")
    public void setSalaryMinRub(long salaryMinRub) {
        this.salaryMinRub = salaryMinRub;
    }

    public Vacancy withSalaryMinRub(long salaryMinRub) {
        this.salaryMinRub = salaryMinRub;
        return this;
    }

    @JsonProperty("salary_max_rub")
    public long getSalaryMaxRub() {
        return salaryMaxRub;
    }

    @JsonProperty("salary_max_rub")
    public void setSalaryMaxRub(long salaryMaxRub) {
        this.salaryMaxRub = salaryMaxRub;
    }

    public Vacancy withSalaryMaxRub(long salaryMaxRub) {
        this.salaryMaxRub = salaryMaxRub;
        return this;
    }

    @JsonProperty("rubrics")
    public List<Rubric> getRubrics() {
        return rubrics;
    }

    @JsonProperty("rubrics")
    public void setRubrics(List<Rubric> rubrics) {
        this.rubrics = rubrics;
    }

    public Vacancy withRubrics(List<Rubric> rubrics) {
        this.rubrics = rubrics;
        return this;
    }

    @JsonProperty("requirements_short")
    public String getRequirementsShort() {
        return requirementsShort;
    }

    @JsonProperty("requirements_short")
    public void setRequirementsShort(String requirementsShort) {
        this.requirementsShort = requirementsShort;
    }

    public Vacancy withRequirementsShort(String requirementsShort) {
        this.requirementsShort = requirementsShort;
        return this;
    }

    @JsonProperty("requirements")
    public String getRequirements() {
        return requirements;
    }

    @JsonProperty("requirements")
    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public Vacancy withRequirements(String requirements) {
        this.requirements = requirements;
        return this;
    }

    @JsonProperty("priority")
    public long getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(long priority) {
        this.priority = priority;
    }

    public Vacancy withPriority(long priority) {
        this.priority = priority;
        return this;
    }

    @JsonProperty("salary")
    public String getSalary() {
        return salary;
    }

    @JsonProperty("salary")
    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Vacancy withSalary(String salary) {
        this.salary = salary;
        return this;
    }

    @JsonProperty("salary_formatted")
    public String getSalaryFormatted() {
        return salaryFormatted;
    }

    @JsonProperty("salary_formatted")
    public void setSalaryFormatted(String salaryFormatted) {
        this.salaryFormatted = salaryFormatted;
    }

    public Vacancy withSalaryFormatted(String salaryFormatted) {
        this.salaryFormatted = salaryFormatted;
        return this;
    }

    @JsonProperty("can_accept_replies")
    public boolean isCanAcceptReplies() {
        return canAcceptReplies;
    }

    @JsonProperty("can_accept_replies")
    public void setCanAcceptReplies(boolean canAcceptReplies) {
        this.canAcceptReplies = canAcceptReplies;
    }

    public Vacancy withCanAcceptReplies(boolean canAcceptReplies) {
        this.canAcceptReplies = canAcceptReplies;
        return this;
    }

//    @Override
//    public String toString() {
//        return ToStringBuilder.reflectionToString(this);
//    }


    @Override
    public String toString() {
        return "Vacancy{" +
                "id=" + id +
                ", header='" + header + '\'' +
                '}';
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Vacancy withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(addDate).append(ownerId).append(header).append(state).append(validateState).append(visibilityType).append(removal).append(siteId).append(bonus).append(salaryMin).append(salaryMax).append(currency).append(education).append(experienceLength).append(workingType).append(schedule).append(publication).append(userType).append(description).append(contact).append(address).append(paymentTypeAlias).append(paymentType).append(company).append(modDate).append(views).append(isAnonymous).append(owner).append(isModerated).append(importedVia).append(subways).append(tags).append(institutions).append(jobs).append(showEmail).append(showPhone).append(useMessages).append(isCommerce).append(isUpped).append(isPremium).append(logStateUpdate).append(favorite).append(hided).append(url).append(salaryMinRub).append(salaryMaxRub).append(rubrics).append(requirementsShort).append(requirements).append(priority).append(salary).append(salaryFormatted).append(canAcceptReplies).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Vacancy)) {
            return false;
        }
        Vacancy rhs = ((Vacancy) other);
        return new EqualsBuilder().append(id, rhs.id).append(addDate, rhs.addDate).append(ownerId, rhs.ownerId).append(header, rhs.header).append(state, rhs.state).append(validateState, rhs.validateState).append(visibilityType, rhs.visibilityType).append(removal, rhs.removal).append(siteId, rhs.siteId).append(bonus, rhs.bonus).append(salaryMin, rhs.salaryMin).append(salaryMax, rhs.salaryMax).append(currency, rhs.currency).append(education, rhs.education).append(experienceLength, rhs.experienceLength).append(workingType, rhs.workingType).append(schedule, rhs.schedule).append(publication, rhs.publication).append(userType, rhs.userType).append(description, rhs.description).append(contact, rhs.contact).append(address, rhs.address).append(paymentTypeAlias, rhs.paymentTypeAlias).append(paymentType, rhs.paymentType).append(company, rhs.company).append(modDate, rhs.modDate).append(views, rhs.views).append(isAnonymous, rhs.isAnonymous).append(owner, rhs.owner).append(isModerated, rhs.isModerated).append(importedVia, rhs.importedVia).append(subways, rhs.subways).append(tags, rhs.tags).append(institutions, rhs.institutions).append(jobs, rhs.jobs).append(showEmail, rhs.showEmail).append(showPhone, rhs.showPhone).append(useMessages, rhs.useMessages).append(isCommerce, rhs.isCommerce).append(isUpped, rhs.isUpped).append(isPremium, rhs.isPremium).append(logStateUpdate, rhs.logStateUpdate).append(favorite, rhs.favorite).append(hided, rhs.hided).append(url, rhs.url).append(salaryMinRub, rhs.salaryMinRub).append(salaryMaxRub, rhs.salaryMaxRub).append(rubrics, rhs.rubrics).append(requirementsShort, rhs.requirementsShort).append(requirements, rhs.requirements).append(priority, rhs.priority).append(salary, rhs.salary).append(salaryFormatted, rhs.salaryFormatted).append(canAcceptReplies, rhs.canAcceptReplies).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    public int describeContents() {
        return 0;
    }

}
