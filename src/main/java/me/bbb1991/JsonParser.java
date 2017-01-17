package me.bbb1991;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.bbb1991.model.Vacancy;
import me.bbb1991.model.VacancyHolder;

import java.io.IOException;
import java.net.URL;

/**
 * Created by bbb1991 on 1/17/17.
 *
 * @author Bagdat Bimaganbetov
 * @author bagdat.bimaganbetov@gmail.com
 */

public class JsonParser {

    private static final String URL_JSON = "http://rabota.ngs.ru/api/v1/vacancies/";

    public static void main(String[] args) throws Exception {

        VacancyHolder vacancyHolder = parseJson(new URL(URL_JSON));

        for (Vacancy vacancy : vacancyHolder.getVacancies()) {
            System.out.println(vacancy);
        }
    }

    private static VacancyHolder parseJson(URL url) throws IOException {
        return new ObjectMapper().readValue(url, VacancyHolder.class);
    }

    public static Vacancy parseJson(String json) throws Exception {
        return new ObjectMapper().readValue(json, Vacancy.class);
    }
}
