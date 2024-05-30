package com.carlocation.carlocation.user;

import com.carlocation.carlocation.booking.Booking;
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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstname;
    private String lastname;

    @OneToMany(mappedBy = "user")
    @JsonIgnoreProperties("user")
    private List<Booking> booking = new ArrayList<>();
}
