package com.iwa.stolencar.rest.parser;

import java.util.List;

import com.iwa.stolencar.commos.dto.AutoDTO;
import com.iwa.stolencar.rest.vo.AutoVO;

public interface AutoParser {

	List<AutoVO> parseToAutoVOList(List<AutoDTO> autoDTOs);
	
	AutoVO parseToAutoVO(AutoDTO autoDTO);
}
