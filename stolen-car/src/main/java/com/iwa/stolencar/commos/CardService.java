package com.iwa.stolencar.commos;

import com.iwa.stolencar.commos.dto.CardDTO;
import com.iwa.stolencar.commos.exception.NotFoundException;

public interface CardService {

	void updateTransportationCard(Integer id, CardDTO cardDTO) throws NotFoundException;
	void deleteTransportationCard(Integer id, String cardTitle) throws NotFoundException;
}