package com.marketwinks.livemacdcalculator.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marketwinks.livemacdcalculator.model.uk_lse_5mins_livemarketprice;

@Repository
public interface UK_LSE_5Mins_LiveMarketPriceRepository extends MongoRepository<uk_lse_5mins_livemarketprice, String> {
}
