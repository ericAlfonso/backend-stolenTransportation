package com.iwa.stolencar.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iwa.stolencar.commos.MotoService;
import com.iwa.stolencar.commos.dto.MotoDTO;
import com.iwa.stolencar.commos.exception.NotFoundException;
import com.iwa.stolencar.persistence.MotoDAO;
import com.iwa.stolencar.persistence.entities.Moto;

@Service
@Transactional
public class MotoServiceImpl implements MotoService{
	
	public static final Logger logger = Logger.getLogger(MotoService.class);
	
	@Autowired private MotoDAO motoDAO;

	@Override
	@Transactional(readOnly = true) 
	public List<MotoDTO> getAllMotorcycles() {
		logger.info("SERVICE: getAllMotorcycles method");
		List<MotoDTO> dtos = new ArrayList<>();
		List<Moto> motos = this.motoDAO.getAll();
		
		motos.stream().forEach(moto -> {
			MotoDTO motoDTO = new MotoDTO();
			motoDTO.setId(moto.getId());
			motoDTO.setMark(moto.getMark());
			motoDTO.setKm(moto.getKm());
			motoDTO.setModelo(moto.getModelo());
			motoDTO.setYear(moto.getYear());
			motoDTO.setImage(moto.getImage());
			dtos.add(motoDTO);
		});
		
		logger.debug("Ending getAllMotorcycles service");
		return dtos;
	}

	@Override
	public MotoDTO getMotorcycleDeatails(Integer motorcycleId) throws NotFoundException {
		logger.info("SERVICE: getMotorcycleDeatails method");
		logger.debug(" - motorcycle id : " + motorcycleId);
		
		Moto moto = this.motoDAO.getById(motorcycleId);
		
		if(moto == null) 
			throw new NotFoundException(
					" Motorcycle with id: " + motorcycleId + "is not found");
		
		MotoDTO motoDTO = new MotoDTO();
		motoDTO.setId(moto.getId());
		motoDTO.setKm(moto.getKm());
		motoDTO.setMark(moto.getMark());
		motoDTO.setModelo(moto.getModelo());
		motoDTO.setYear(moto.getYear());
		motoDTO.setImage(moto.getImage());
		
		return motoDTO;
	}

	@Override
	@Transactional(readOnly = true) 
	public List<MotoDTO> getTopMotorcycles() {
		logger.info("SERVICE: getTopMotorcycles method");
		List<MotoDTO> dtos = new ArrayList<>();
		List<Moto> motos = this.motoDAO.getTopMotorcycles();
		
		motos.stream().forEach(moto -> {
			MotoDTO motoDTO = new MotoDTO();
			motoDTO.setId(moto.getId());
			motoDTO.setMark(moto.getMark());
			motoDTO.setKm(moto.getKm());
			motoDTO.setModelo(moto.getModelo());
			motoDTO.setYear(moto.getYear());
			motoDTO.setImage(moto.getImage());
			dtos.add(motoDTO);
		});
		
		logger.debug("Ending getTopMotorcycles service");
		return dtos;
	}

}
