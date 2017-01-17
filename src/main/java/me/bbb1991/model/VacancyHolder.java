package me.bbb1991.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by bbb1991 on 1/17/17.
 *
 * @author Bagdat Bimaganbetov
 * @author bagdat.bimaganbetov@gmail.com
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class VacancyHolder implements Serializable {

    @JsonProperty("vacancies")
    private List<Vacancy> vacancies;

    public VacancyHolder() {
    }

    public List<Vacancy> getVacancies() {
        return vacancies;
    }

    public void setVacancies(List<Vacancy> vacancies) {
        this.vacancies = vacancies;
    }
}
