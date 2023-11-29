package com.example.Examen.service.impl;

import com.example.Examen.entity.Hotel;
import com.example.Examen.repository.HotelRepository;
import com.example.Examen.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel){
        Hotel newHotel = new Hotel();

        newHotel.setName(hotel.getName());
        newHotel.setPrice(hotel.getPrice());
        newHotel.setStartDate(hotel.getStartDate());
        newHotel.setEndDate(hotel.getEndDate());
        hotelRepository.save(newHotel);
        return newHotel;
    }



    @Override
    public Hotel findById(Long id){
        return hotelRepository.findById(id).orElse(null);
    }

    @Override
    public List<Hotel> findByLowerPrice(double price){
        return hotelRepository.findByLowerPrice(price);
    }
    @Override
    public List<Hotel> findAll(){
        return hotelRepository.findAll();
    }
}
