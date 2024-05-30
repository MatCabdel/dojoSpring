package com.carlocation.carlocation.car;

import com.carlocation.carlocation.booking.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/car")
public class CarController {

    private CarService service;

    @GetMapping("/get/all")
    public ResponseEntity<List<Car>> getAll() {
        List<Car> employees = service.getAll();

        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
}
