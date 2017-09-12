package com.iwa.stolencar.rest;

import org.springframework.http.ResponseEntity;

@SuppressWarnings("rawtypes")
public interface EstadisticasCtrl {

	ResponseEntity getDayStatistics(Integer statisticId);
	ResponseEntity getYearStatistics(Integer statisticId);
	ResponseEntity getMonthStatistics(Integer statisticId);
	ResponseEntity getStatistics();
}
