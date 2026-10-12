package com.hotelbooking.system.service;

import com.hotelbooking.system.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
