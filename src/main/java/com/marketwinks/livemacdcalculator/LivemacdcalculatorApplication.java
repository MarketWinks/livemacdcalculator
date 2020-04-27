package com.marketwinks.livemacdcalculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.marketwinks.livemacdcalculator.repository.UK_LSE_15Mins_LiveMarketMacdRepository;
import com.marketwinks.livemacdcalculator.repository.UK_LSE_15Mins_LiveMarketMacdjsonRepository;
import com.marketwinks.livemacdcalculator.repository.UK_LSE_30Mins_LiveMarketMacdRepository;
import com.marketwinks.livemacdcalculator.repository.UK_LSE_30Mins_LiveMarketMacdjsonRepository;
import com.marketwinks.livemacdcalculator.repository.UK_LSE_5Mins_LiveMarketMacdRepository;
import com.marketwinks.livemacdcalculator.repository.UK_LSE_5Mins_LiveMarketMacdjsonRepository;
import com.marketwinks.livemacdcalculator.repository.UK_LSE_5Mins_LiveMarketPriceRepository;
import com.marketwinks.livemacdcalculator.repository.UK_LSE_Daily_LiveMarketMacdRepository;
import com.marketwinks.livemacdcalculator.repository.UK_LSE_Daily_LiveMarketMacdjsonRepository;
import com.marketwinks.livemacdcalculator.repository.UK_LSE_Hourly_LiveMarketMacdRepository;
import com.marketwinks.livemacdcalculator.repository.UK_LSE_Hourly_LiveMarketMacdjsonRepository;
import com.marketwinks.livemacdcalculator.repository.UK_LSE_Monthly_LiveMarketMacdRepository;
import com.marketwinks.livemacdcalculator.repository.UK_LSE_Monthly_LiveMarketMacdjsonRepository;
import com.marketwinks.livemacdcalculator.repository.UK_LSE_Weekly_LiveMarketMacdRepository;
import com.marketwinks.livemacdcalculator.repository.UK_LSE_Weekly_LiveMarketMacdjsonRepository;

@SpringBootApplication
@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan(basePackages = { "com.*" })
@EnableMongoRepositories(basePackages = "com.marketwinks.livemacdcalculator.repository")
@EnableCaching
public class LivemacdcalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivemacdcalculatorApplication.class, args);
	}

	@Autowired
	UK_LSE_5Mins_LiveMarketPriceRepository UK_LSE_5Mins_LiveMarketPriceRepository;

	@Autowired
	UK_LSE_5Mins_LiveMarketMacdRepository UK_LSE_5Mins_LiveMarketMacdRepository;

	@Autowired
	UK_LSE_5Mins_LiveMarketMacdjsonRepository UK_LSE_5Mins_LiveMarketMacdjsonRepository;

	@Autowired
	UK_LSE_15Mins_LiveMarketMacdRepository UK_LSE_15Mins_LiveMarketMacdRepository;

	@Autowired
	UK_LSE_15Mins_LiveMarketMacdjsonRepository UK_LSE_15Mins_LiveMarketMacdjsonRepository;

	@Autowired
	UK_LSE_30Mins_LiveMarketMacdRepository UK_LSE_30Mins_LiveMarketMacdRepository;

	@Autowired
	UK_LSE_30Mins_LiveMarketMacdjsonRepository UK_LSE_30Mins_LiveMarketMacdjsonRepository;

	@Autowired
	UK_LSE_Hourly_LiveMarketMacdRepository UK_LSE_Hourly_LiveMarketMacdRepository;

	@Autowired
	UK_LSE_Hourly_LiveMarketMacdjsonRepository UK_LSE_Hourly_LiveMarketMacdjsonRepository;

	@Autowired
	UK_LSE_Daily_LiveMarketMacdRepository UK_LSE_Daily_LiveMarketMacdRepository;

	@Autowired
	UK_LSE_Daily_LiveMarketMacdjsonRepository UK_LSE_Daily_LiveMarketMacdjsonRepository;

	@Autowired
	UK_LSE_Weekly_LiveMarketMacdRepository UK_LSE_Weekly_LiveMarketMacdRepository;

	@Autowired
	UK_LSE_Weekly_LiveMarketMacdjsonRepository UK_LSE_Weekly_LiveMarketMacdjsonRepository;

	@Autowired
	UK_LSE_Monthly_LiveMarketMacdRepository UK_LSE_Monthly_LiveMarketMacdRepository;

	@Autowired
	UK_LSE_Monthly_LiveMarketMacdjsonRepository UK_LSE_Monthly_LiveMarketMacdjsonRepository;

}
