package com.example.Examen.service;

import com.example.Examen.entity.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {

    Hotel create(Hotel hotel);

    List<Hotel> findByLowerPrice(double price);

    Hotel findById(Long id);

    List<Hotel> findAll();
}
