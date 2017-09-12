package com.iwa.stolencar.rest.parser;

import com.iwa.stolencar.commos.dto.CardDTO;
import com.iwa.stolencar.rest.vo.CardVO;

public interface CardParser {

	CardDTO parseToCardDTO(CardVO cardVO);
}
