package com.hendisantika.currency.converter;

import com.hendisantika.currency.converter.model.Currency;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CurrencyConverterDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConverterDemoApplication.class, args);
		getCurrency();

	}

	public static Currency getCurrency(){
		RestTemplate restTemplate = new RestTemplate();
		Currency currency = restTemplate.getForObject("http://api.fixer.io/latest?base={from}&symbols={to}", Currency.class, 200);
		System.out.println("Base: " + currency.getBase());
		System.out.println("Date: " + currency.getDate());
		System.out.println("Rates: " + currency.getRates());

		return currency;
	}
}
