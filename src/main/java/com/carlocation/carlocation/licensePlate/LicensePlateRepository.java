package com.carlocation.carlocation.licensePlate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicensePlateRepository extends JpaRepository <LicensePlate, Long>{
}
