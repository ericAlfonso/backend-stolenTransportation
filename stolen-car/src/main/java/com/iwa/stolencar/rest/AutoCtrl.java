package com.iwa.stolencar.rest;

import org.springframework.http.ResponseEntity;

@SuppressWarnings("rawtypes")
public interface AutoCtrl {
	
	ResponseEntity getCars();
	ResponseEntity getCarDetails(Integer carId);
	ResponseEntity getTopCars();
}