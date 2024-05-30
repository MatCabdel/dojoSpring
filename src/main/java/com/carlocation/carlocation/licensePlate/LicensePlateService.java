package com.carlocation.carlocation.licensePlate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicensePlateService {

    @Autowired
    private LicensePlateRepository repository;
}
