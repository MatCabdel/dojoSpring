package com.carlocation.carlocation.licensePlate;

import com.carlocation.carlocation.booking.BookingService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/license-plate")
public class LicensePlateController {
    private LicensePlateService service;
}
