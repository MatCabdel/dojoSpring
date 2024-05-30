package com.carlocation.carlocation.car;

import com.carlocation.carlocation.booking.Booking;
import com.carlocation.carlocation.licensePlate.LicensePlate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String brand;
    private String color;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "licensePlate_id")
    @JsonIgnoreProperties("car")
    private LicensePlate licensePlate;

    @OneToMany(mappedBy = "car")
    @JsonIgnoreProperties("car")
    private List<Booking> booking = new ArrayList<>();
}
