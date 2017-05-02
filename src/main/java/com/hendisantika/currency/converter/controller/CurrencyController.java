package com.hendisantika.currency.converter.controller;


/**
 * Created by hendisantika on 5/1/17.
 */
public class CurrencyController {

//    public ResponseEntity<Currency> getCurrency() {
//        RestTemplate restTemplate = new RestTemplate();
//        String url = "http://api.fixer.io/latest?base={from}&symbols={to}";
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("from", "SGD");
//        map.put("name", "IDR");
//        Currency currency = new Currency("IDR", new Date(), new Rates2(9000.0));
//        ResponseEntity<Currency> entity = restTemplate.getForEntity(url, Currency.class, map);
//        System.out.println("Base : " + entity.getBody().getBase());
//        System.out.println("Date : " + entity.getBody().getDate());
//        System.out.println("Rates2 : " + entity.getBody().getRates());
//
//        return ResponseEntity;
//
//    }

//    public Currency getCurrency(){
//        RestTemplate restTemplate = new RestTemplate();
//        Currency currency = restTemplate.getForObject("http://api.fixer.io/latest?base={from}&symbols={to}", Currency.class, 200);
//        System.out.println("Base: " + currency.getBase());
//        System.out.println("Date: " + currency.getDate());
//        System.out.println("Rates2: " + currency.getRates());
//
//        return currency;
//    }

//    GetMapping("/?base=SGD&symbols=IDR")
//    public Currency getCurr() {
//        return getCurrency();
//    }
}
