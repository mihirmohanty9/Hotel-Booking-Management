package com.hotelbooking.system.strategy;

import com.hotelbooking.system.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
