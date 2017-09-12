package com.iwa.stolencar.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iwa.stolencar.commos.AutoService;
import com.iwa.stolencar.commos.dto.AutoDTO;
import com.iwa.stolencar.commos.exception.NotFoundException;
import com.iwa.stolencar.persistence.AutoDAO;
import com.iwa.stolencar.persistence.entities.Auto;

@Service
@Transactional
public class AutoServiceImpl implements AutoService{
	
	public static final Logger logger = Logger.getLogger(AutoService.class);
	
	@Autowired private AutoDAO autoDAO;

	@Override
	@Transactional(readOnly = true)
	public List<AutoDTO> getAllCars() {
		logger.info("SERVICE: getAllCars method");
		List<AutoDTO> dtos = new ArrayList<>();
		List<Auto> autos = this.autoDAO.getAll();
		
		autos.stream().forEach(auto -> {
			AutoDTO autoDTO = new AutoDTO();
			autoDTO.setId(auto.getId());
			autoDTO.setMark(auto.getMark());
			autoDTO.setKm(auto.getKm());
			autoDTO.setModelo(auto.getModelo());
			autoDTO.setYear(auto.getYear());
			autoDTO.setImage(auto.getImage());
			dtos.add(autoDTO);
		});
		
		logger.debug("Ending getAllCars service");
		return dtos;
	}

	@Override
	@Transactional(readOnly = true)
	public AutoDTO getCarDetails(Integer carId) throws NotFoundException{
		logger.info("SERVICE: getCarDetails method");
		logger.debug(" - car id : " + carId);
		
		Auto auto= this.autoDAO.getById(carId);
		
		if(auto == null) 
			throw new NotFoundException(" Car with id: " + carId + "is not found");
		
		AutoDTO autoDTO = new AutoDTO();
		autoDTO.setId(auto.getId());
		autoDTO.setKm(auto.getKm());
		autoDTO.setMark(auto.getMark());
		autoDTO.setModelo(auto.getModelo());
		autoDTO.setYear(auto.getYear());
		autoDTO.setImage(auto.getImage());
		
		return autoDTO;
	}

	@Override
	@Transactional(readOnly = true)
	public List<AutoDTO> getTopCars() {
		logger.info("SERVICE: getTopCars method");
		List<AutoDTO> dtos = new ArrayList<>();
		List<Auto> autos = this.autoDAO.getTopCars();
		
		autos.stream().forEach(auto -> {
			AutoDTO autoDTO = new AutoDTO();
			autoDTO.setId(auto.getId());
			autoDTO.setMark(auto.getMark());
			autoDTO.setKm(auto.getKm());
			autoDTO.setModelo(auto.getModelo());
			autoDTO.setYear(auto.getYear());
			autoDTO.setImage(auto.getImage());
			dtos.add(autoDTO);
		});
		
		logger.debug("Ending getTopCars service");
		return dtos;
	}
}
