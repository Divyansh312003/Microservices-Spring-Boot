package com.currency_exchange;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<CurrencyExchange,Long> {
    CurrencyExchange findByFromAndTo(String from,String to);
}
