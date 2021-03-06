package com.iwa.stolencar.rest;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iwa.stolencar.commos.MotoService;
import com.iwa.stolencar.commos.dto.MotoDTO;
import com.iwa.stolencar.commos.exception.NotFoundException;
import com.iwa.stolencar.rest.parser.MotoParser;
import com.iwa.stolencar.rest.vo.MotoVO;

@RestController
@RequestMapping("/motorcycles")
@SuppressWarnings("rawtypes")
public class MotoCtrlImpl implements MotoCtrl{
	
private static final Logger logger = Logger.getLogger(MotoCtrl.class);
	
	@Autowired private MotoService motoService;
	@Autowired private MotoParser motoParser;
	
	@Override
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity getMotorcycles() {
		logger.info("CTRL: getMotorcycles method");
		
		List<MotoDTO> motoDTOs = 
					this.motoService.getAllMotorcycles();
		
		if(logger.isTraceEnabled())
			logger.trace("Motos List " + motoDTOs.toString());
		
		List<MotoVO> motoVOs = 
				this.motoParser.parseToMotoVOList(motoDTOs);
	
		logger.debug("Ending getMotorcycles method");		
		return new ResponseEntity<>(motoVOs, HttpStatus.OK);
	}

	@Override
	@RequestMapping("/{motorcycleId}")
	public ResponseEntity getMotorcycleDetails(
			@PathVariable(name = "motorcycleId") Integer motorcycleId) {
		logger.info("CTRL: getMotorcycleDetails method");
		
		if(motorcycleId != null) {
			try {
				MotoDTO motoDTO = 
						this.motoService.getMotorcycleDeatails(motorcycleId);
				MotoVO motoVO = 
					this.motoParser.parseToMotoVO(motoDTO);
				
				if(logger.isTraceEnabled())
					logger.trace("AutoVO : " + motoVO);
				
				logger.debug("Ending getMotorcycleDetails method");
				return new ResponseEntity<>(motoVO, HttpStatus.OK);
				
			} catch (NotFoundException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
		
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@Override
	@RequestMapping(value="/top",  method = RequestMethod.GET)
	public ResponseEntity getTopMotorcycles() {
		logger.info("CTRL: getTopMotorcycles method");
		
		List<MotoDTO> motoDTOs = 
					this.motoService.getTopMotorcycles();
		
		if(logger.isTraceEnabled())
			logger.trace("Motos List " + motoDTOs.toString());
		
		List<MotoVO> motoVOs = 
				this.motoParser.parseToMotoVOList(motoDTOs);
	
		logger.debug("Ending getMotorcycles method");		
		return new ResponseEntity<>(motoVOs, HttpStatus.OK);
	}

}
