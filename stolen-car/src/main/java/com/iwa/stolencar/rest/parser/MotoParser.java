package com.iwa.stolencar.rest.parser;

import java.util.List;

import com.iwa.stolencar.commos.dto.MotoDTO;
import com.iwa.stolencar.rest.vo.MotoVO;

public interface MotoParser {

	List<MotoVO> parseToMotoVOList(List<MotoDTO> motoDTOs);
	
	MotoVO parseToMotoVO(MotoDTO motoDTO);
}
