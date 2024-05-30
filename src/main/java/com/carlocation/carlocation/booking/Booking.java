package com.carlocation.carlocation.booking;

import com.carlocation.carlocation.car.Car;
import com.carlocation.carlocation.user.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String date;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnoreProperties("booking")
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnoreProperties("booking")
    @JoinColumn(name = "user_id")
    private User user;
}
