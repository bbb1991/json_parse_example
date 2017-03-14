package me.bbb1991;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.bbb1991.model.VacancyHolder;
import me.bbb1991.model2.Aqua;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

/**
 * Created by bbb1991 on 1/17/17.
 *
 * @author Bagdat Bimaganbetov
 * @author bagdat.bimaganbetov@gmail.com
 */

public class JsonParser {

    private static final String VACANCY_URL = "http://rabota.ngs.ru/api/v1/vacancies/";

    private static final String AQUA_URL = "http://docbooking.ru/rosbank/aquas.json";

    public static void main(String[] args) throws Exception {

        String vacanciesJson = IOUtils.toString(new URL(VACANCY_URL), "utf-8");

        VacancyHolder vacancyHolder = parseJson(vacanciesJson, VacancyHolder.class);

        vacancyHolder.getVacancies().forEach(System.out::println);

        String aquaJson = IOUtils.toString(new URL(AQUA_URL), "windows-1251");

        Aqua[] aquas = parseJson(aquaJson, Aqua[].class);

        Arrays.stream(aquas).forEach(System.out::println);
    }

    public static <T> T parseJson(String json, Class<T> t) throws IOException {
        return new ObjectMapper().readValue(json, t);
    }
}
