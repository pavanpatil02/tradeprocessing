package com.db.tradeprocessing.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.tradeprocessing.model.Trade;

@Repository
public interface TradeRepository extends JpaRepository<Trade,String> {
}
