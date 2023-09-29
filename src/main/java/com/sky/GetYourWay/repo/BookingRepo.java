package com.sky.GetYourWay.repo;

import com.sky.GetYourWay.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {

    List<Booking> findAllByUserUserId(Integer userId);
}
