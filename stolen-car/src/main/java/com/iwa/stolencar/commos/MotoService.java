package com.iwa.stolencar.commos;

import java.util.List;

import com.iwa.stolencar.commos.dto.MotoDTO;
import com.iwa.stolencar.commos.exception.NotFoundException;

public interface MotoService {

	List<MotoDTO> getAllMotorcycles();
	MotoDTO getMotorcycleDeatails(Integer motorcycleId) throws NotFoundException;
	List<MotoDTO> getTopMotorcycles();
}
