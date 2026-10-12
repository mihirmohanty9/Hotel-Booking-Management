# Hotel Booking System

Spring Boot 3.4 + PostgreSQL + JWT + Stripe.

## Run
1. Create a PostgreSQL database named `hotel_booking`.
2. Set environment variables: `DB_USERNAME`, `DB_PASSWORD`, `JWT_SECRET`, `STRIPE_SECRET_KEY`, `STRIPE_WEBHOOK_SECRET`.
3. `./mvnw spring-boot:run`
4. Swagger UI: http://localhost:8080/api/v1/swagger-ui/index.html

## Features
Auth (JWT + refresh cookie), hotel/room/inventory admin APIs, hotel search, booking flow with guests,
Stripe checkout + webhook + refunds, dynamic pricing (surge, occupancy, urgency, holiday), hourly price scheduler.
