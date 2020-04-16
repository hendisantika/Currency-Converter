package com.hendisantika.currency.converter;

import com.hendisantika.currency.converter.model.Currency;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CurrencyConverterDemoApplication {

	@Value("${base.url}")
	private String BASE_URL;

	private static final Logger log = LoggerFactory.getLogger(CurrencyConverterDemoApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(CurrencyConverterDemoApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	public static Currency getCurrency() {
		RestTemplate restTemplate = new RestTemplate();
//		Currency currency = restTemplate.getForObject("http://api.fixer.io/latest?base={from}&symbols={to}", Currency
//		.class, 200);
		Currency currency = restTemplate.getForObject("http://api.fixer.io/latest?base={from}&symbols={to}",
				Currency.class, 200);
		System.out.println("Base: " + currency.getBase());
		System.out.println("Date: " + currency.getDate());
		System.out.println("Rates2: " + currency.getRates());

		return currency;
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Currency currency = restTemplate.getForObject(
					BASE_URL, Currency.class);
			log.info(currency.toString());
		};
	}
}
