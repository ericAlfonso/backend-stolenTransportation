package com.iwa.stolencar.rest;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iwa.stolencar.commos.CardService;
import com.iwa.stolencar.commos.dto.CardDTO;
import com.iwa.stolencar.commos.exception.NotFoundException;
import com.iwa.stolencar.rest.parser.CardParser;
import com.iwa.stolencar.rest.vo.CardVO;

@RestController
@RequestMapping("/cards")
@SuppressWarnings("rawtypes")
public class CardCtrlImpl implements CardCtrl{
	
	private static final Logger logger = Logger.getLogger(CardCtrl.class);
	
	@Autowired private CardParser cardParser;
	@Autowired private CardService cardService;
	
	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity updateTransportationCard(
			@PathVariable(value="id") Integer id, 
			@Valid @RequestBody CardVO cardVO, BindingResult bindingResult) {
		logger.info("CTRL: updateTransportationCard method");
		
		if(logger.isDebugEnabled())
			logger.debug("- id : " + id);
		
		if(logger.isTraceEnabled())
			logger.trace("CardVO received: " + cardVO);
		
		if (bindingResult.hasErrors())
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
		try {
			CardDTO cardDTO = this.cardParser.parseToCardDTO(cardVO);
			this.cardService.updateTransportationCard(id, cardDTO);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
		} catch (NotFoundException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@Override
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity deleteTransportationCard(
			@PathVariable(name = "id") Integer id, 
			@RequestParam(name = "title", required = true) String title) {
		logger.info("CTRL: deleteTransportationCard method");
		
		if(logger.isDebugEnabled()) {
			logger.debug("- Card id: " + id);
			logger.debug("- Card title: " + title);
		}
		
		try {
			this.cardService.deleteTransportationCard(id, title);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
		} catch (NotFoundException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
