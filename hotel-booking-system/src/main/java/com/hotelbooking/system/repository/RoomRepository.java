package com.hotelbooking.system.repository;

import com.hotelbooking.system.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
