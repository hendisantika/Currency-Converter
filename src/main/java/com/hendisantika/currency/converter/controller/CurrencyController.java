package com.hendisantika.currency.converter.controller;

import com.hendisantika.currency.converter.model.Currency;
import com.hendisantika.currency.converter.model.Rates;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hendisantika on 5/1/17.
 */
@RestController
public class CurrencyController {

    @GetMapping("/currency")
    public ResponseEntity<Currency> getCurrencyEntity() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://api.fixer.io/latest?base={from}&symbols={to}";
        Map<String, String> map = new HashMap<String, String>();
        map.put("from", "SGD");
        map.put("name", "IDR");
        Rates rates = new Rates();
        rates.setIDR(9000.0);
        Currency currency = new Currency("IDR", new Date(), rates);
        ResponseEntity<Currency> entity = restTemplate.getForEntity(url, Currency.class, map);
        System.out.println("Base : " + entity.getBody().getBase());
        System.out.println("Date : " + entity.getBody().getDate());
        System.out.println("Rates : " + entity.getBody().getRates());

        return entity;
    }

    @GetMapping("/?base=SGD&symbols=IDR")
    public Currency getCurr() {
        RestTemplate restTemplate = new RestTemplate();
        Currency currency = restTemplate.getForObject("http://api.fixer.io/latest?base={from}&symbols={to}", Currency.class, 200);
        System.out.println("Base: " + currency.getBase());
        System.out.println("Date: " + currency.getDate());
        System.out.println("Rates2: " + currency.getRates());

        return currency;
    }
}
