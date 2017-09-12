package com.iwa.stolencar.rest.parser.impl;

import org.springframework.stereotype.Component;

import com.iwa.stolencar.commos.dto.CardDTO;
import com.iwa.stolencar.rest.parser.CardParser;
import com.iwa.stolencar.rest.vo.CardVO;

@Component
public class CardParserImpl implements CardParser{

	@Override
	public CardDTO parseToCardDTO(CardVO cardVO) {
		if(cardVO == null)
			return null;
		
		CardDTO cardDTO = new CardDTO();
		cardDTO.setMark(cardVO.getMark());
		cardDTO.setTitle(cardVO.getTitle());
		
		return cardDTO;
	}
}
