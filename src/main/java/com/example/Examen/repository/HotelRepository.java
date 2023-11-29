package com.example.Examen.repository;

import com.example.Examen.entity.Hotel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("hotelRepository")
public interface HotelRepository extends JpaRepository<Hotel, Long> {

    @Query(value = "SELECT h FROM Hotel h where h.price < ?1")
    List<Hotel> findByLowerPrice(double price);
}
