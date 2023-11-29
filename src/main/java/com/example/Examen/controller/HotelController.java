package com.example.Examen.controller;


import com.example.Examen.entity.Hotel;
import com.example.Examen.service.HotelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RestController
@RequestMapping("api/v1/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping
    public List<Hotel> getAll(){
        List<Hotel> hotels = hotelService.findAll();
        if (hotels == null){
            return null;
        }
        return hotels;
    }

    @GetMapping("/{id}")
    public Hotel getById(@PathVariable("id") Long id){
        Hotel hotels = hotelService.findById(id);
        if (hotels == null){
            return null;
        }
        return hotels;
    }

    @PostMapping("/add")
    public Hotel create(@RequestBody Hotel hotel){
        Hotel newHotel = hotelService.create(hotel);
        if (newHotel == null){
            return null;
        }
        return newHotel;
    }


}
