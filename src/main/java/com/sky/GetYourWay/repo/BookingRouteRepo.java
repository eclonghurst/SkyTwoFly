package com.sky.GetYourWay.repo;

import com.sky.GetYourWay.domain.BookingRoute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRouteRepo extends JpaRepository<BookingRoute, String> {
}
