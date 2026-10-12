package com.hotelbooking.system.repository;

import com.hotelbooking.system.entity.Guest;
import com.hotelbooking.system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByUser(User user);
}