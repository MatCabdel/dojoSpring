package com.carlocation.carlocation.licensePlate;

import com.carlocation.carlocation.car.Car;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
public class LicensePlate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String numberPlate;

    @OneToOne(mappedBy = "licensePlate")
    @JsonIgnoreProperties("licensePlate")
    private Car car;
}
