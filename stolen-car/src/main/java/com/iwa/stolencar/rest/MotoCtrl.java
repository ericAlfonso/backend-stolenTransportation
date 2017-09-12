package com.iwa.stolencar.rest;

import org.springframework.http.ResponseEntity;

@SuppressWarnings("rawtypes")
public interface MotoCtrl {
	
	ResponseEntity getMotorcycles();
	ResponseEntity getMotorcycleDetails(Integer motorcycleId);
	ResponseEntity getTopMotorcycles();
}
