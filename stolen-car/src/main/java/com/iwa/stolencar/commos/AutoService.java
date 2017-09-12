package com.iwa.stolencar.commos;

import java.util.List;

import com.iwa.stolencar.commos.dto.AutoDTO;
import com.iwa.stolencar.commos.exception.NotFoundException;

public interface AutoService {

	List<AutoDTO> getAllCars();
	AutoDTO getCarDetails(Integer carId) throws NotFoundException;
	List<AutoDTO> getTopCars();
}
