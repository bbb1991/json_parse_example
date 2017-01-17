package me.bbb1991;

import me.bbb1991.model.Vacancy;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bbb1991 on 1/17/17.
 *
 * @author Bagdat Bimaganbetov
 * @author bagdat.bimaganbetov@gmail.com
 */
public class JsonParserTest {

    private String exampleJson = "{ " +
            "   \"id\": 57898321, " +
            "   \"add_date\": \"2013-02-19T13:40:58+0700\", " +
            "   \"owner_id\": 147577791, " +
            "   \"header\": \"Директор магазина\", " +
            "   \"state\": 1, " +
            "   \"validate_state\": 1, " +
            "   \"visibility_type\": \"viewAll\", " +
            "   \"removal\": false, " +
            "   \"site_id\": 574, " +
            "   \"bonus\": 0, " +
            "   \"salary_min\": 20000, " +
            "   \"salary_max\": 0, " +
            "   \"currency\": { " +
            "    \"id\": 299, " +
            "    \"title\": \"руб.\", " +
            "    \"alias\": \"RUR\" " +
            "   }, " +
            "   \"education\": { " +
            "    \"id\": 387, " +
            "    \"title\": \"высшее\", " +
            "    \"alias\": null " +
            "   }, " +
            "   \"experience_length\": { " +
            "    \"id\": 3003, " +
            "    \"title\": \"3-5 лет\" " +
            "   }, " +
            "   \"working_type\": { " +
            "    \"id\": 309, " +
            "    \"title\": \"полная занятость\", " +
            "    \"alias\": null " +
            "   }, " +
            "   \"schedule\": { " +
            "    \"id\": 305, " +
            "    \"title\": \"полный рабочий день\", " +
            "    \"alias\": null " +
            "   }, " +
            "   \"publication\": { " +
            "    \"id\": 7424351, " +
            "    \"geo_id\": 1222, " +
            "    \"order_id\": 32791701, " +
            "    \"vacancy_id\": 57898321, " +
            "    \"company_id\": 9277432, " +
            "    \"type\": \"business\", " +
            "    \"action\": \"activate\", " +
            "    \"is_active\": true, " +
            "    \"is_free\": false, " +
            "    \"logo_in_list\": true, " +
            "    \"is_service_finished\": false, " +
            "    \"live_time\": 2581444, " +
            "    \"expired_at\": \"2017-02-16T11:09:04+07:00\", " +
            "    \"published_at\": \"2017-01-17T14:05:00+07:00\", " +
            "    \"created_at\": \"2017-01-17T14:05:00+07:00\", " +
            "    \"is_dummy\": false, " +
            "    \"is_deleted\": false, " +
            "    \"prolong_data\": null " +
            "   }, " +
            "   \"user_type\": \"employer\", " +
            "   \"description\": \"<p>Обязанности : работа с персоналом (подбор сотрудников, обучение, табелирование, контроль за работой);<br>работа с ассортиментом ( заказ товара, приемка товара,участвует в инвентаризации );работа с клиентской сетью;взаимодействие с представителями администрации, контролирующими органами.</p><p>Полная материальная ответственность. Работа в 1С Предприятие 8 версии.</p><p>Требования: высшее образование и стаж работы более 3 лет.</p><p>Условия: стажировка один месяц,график работы 5/2, полный соц пакет,оформление согласно ТК РФ.</p>\", " +
            "   \"contact\": { " +
            "    \"icq\": 0, " +
            "    \"skype\": \"\", " +
            "    \"email\": null, " +
            "    \"url\": \"http://www.3abey.ru\", " +
            "    \"street\": \"\", " +
            "    \"building\": \"\", " +
            "    \"room\": null, " +
            "    \"name\": \"Александр\", " +
            "    \"firstname\": null, " +
            "    \"lastname\": null, " +
            "    \"patronymic\": null, " +
            "    \"phones\": [], " +
            "    \"city\": { " +
            "     \"id\": 574, " +
            "     \"title\": \"Прокопьевск\", " +
            "     \"locative\": \"Прокопьевске\" " +
            "    }, " +
            "    \"address_description\": \"\", " +
            "    \"coordinate\": null, " +
            "    \"address\": \"Прокопьевск\", " +
            "    \"subway\": null, " +
            "    \"district\": null, " +
            "    \"microdistrict\": null " +
            "   }, " +
            "   \"address\": null, " +
            "   \"payment_type_alias\": \"range\", " +
            "   \"payment_type\": { " +
            "    \"id\": 2989, " +
            "    \"title\": \"10\", " +
            "    \"alias\": \"payment_weight_range\" " +
            "   }, " +
            "   \"company\": { " +
            "    \"id\": 9277432, " +
            "    \"title\": \"Сеть магазинов \\\"ЗАБЕЙ\\\"\", " +
            "    \"logo\": { " +
            "     \"id\": \"5582356c69fd6fb7208b4567\", " +
            "     \"url\": \"https://cdn3.zp.ru/job/attaches/2015/06/e5/d4/e5d46ed7b3e70fdcd80b51bdc935a920.png\", " +
            "     \"size\": null " +
            "    }, " +
            "    \"interviews\": [], " +
            "    \"onedays\": [], " +
            "    \"photos\": [], " +
            "    \"show_logo\": true, " +
            "    \"state\": 1, " +
            "    \"validate_state\": 0, " +
            "    \"employees\": { " +
            "     \"id\": 5, " +
            "     \"title\": \"свыше 300\" " +
            "    }, " +
            "    \"reviews\": { " +
            "     \"average\": 0, " +
            "     \"count\": 0 " +
            "    } " +
            "   }, " +
            "   \"mod_date\": \"2017-01-17T20:41:57+0700\", " +
            "   \"views\": 36, " +
            "   \"is_anonymous\": false, " +
            "   \"owner\": { " +
            "    \"id\": 147577791, " +
            "    \"type\": \"employer\", " +
            "    \"photo\": null " +
            "   }, " +
            "   \"is_moderated\": true, " +
            "   \"imported_via\": null, " +
            "   \"subways\": [], " +
            "   \"tags\": [], " +
            "   \"institutions\": [], " +
            "   \"jobs\": [], " +
            "   \"show_email\": true, " +
            "   \"show_phone\": true, " +
            "   \"use_messages\": true, " +
            "   \"is_commerce\": true, " +
            "   \"is_upped\": false, " +
            "   \"is_premium\": true, " +
            "   \"log_state_update\": null, " +
            "   \"favorite\": false, " +
            "   \"hided\": false, " +
            "   \"url\": \"/vacancy/Direktor_magazina?id=57898321\", " +
            "   \"salary_min_rub\": 20000, " +
            "   \"salary_max_rub\": 0, " +
            "   \"rubrics\": [ " +
            "    { " +
            "     \"id\": 20, " +
            "     \"title\": \"Высший менеджмент, руководители\", " +
            "     \"specialities\": [ " +
            "      { " +
            "       \"id\": 26, " +
            "       \"title\": \"Продажи, торговля \" " +
            "      } " +
            "     ] " +
            "    } " +
            "   ], " +
            "   \"requirements_short\": \"Высшее образование и стаж работы 3-5 лет\", " +
            "   \"requirements\": \"Высшее образование, стаж работы 3-5 лет, полная занятость\", " +
            "   \"priority\": 100, " +
            "   \"salary\": \"от 20 000 руб.\", " +
            "   \"salary_formatted\": \"от 20 000 руб.\", " +
            "   \"can_accept_replies\": true " +
            "  }";

    @Test
    public void test1() throws Exception {
        Vacancy vacancy = JsonParser.parseJson(exampleJson);
        Assert.assertEquals(57898321, vacancy.getId());
    }

}