package com.iwa.stolencar.rest.parser;

import java.util.List;

import com.iwa.stolencar.commos.dto.AñoDTO;
import com.iwa.stolencar.commos.dto.DiaDTO;
import com.iwa.stolencar.commos.dto.EstadisticaDTO;
import com.iwa.stolencar.commos.dto.MesDTO;
import com.iwa.stolencar.rest.vo.AñoVO;
import com.iwa.stolencar.rest.vo.DiaVO;
import com.iwa.stolencar.rest.vo.EstadisticaVO;
import com.iwa.stolencar.rest.vo.MesVO;

public interface EstadisticasParser {

	List<EstadisticaVO> parseToEstadisticaVOList(List<EstadisticaDTO> dtos);
	EstadisticaVO parseToEstadisticaVO(EstadisticaDTO dto);
	
	List<AñoVO> parseToAñoVOList(List<AñoDTO> añoDTOs);
	AñoVO parserToAñoVO(AñoDTO añoDTO);
	
	List<MesVO> parseToMesDTOList(List<MesDTO> mesDTOs);
	MesVO parseToMesVO(MesDTO mesDTO);
	
	List<DiaVO> parseToDiaVOList(List<DiaDTO> diaDTOs);
	DiaVO parseToDiaVO(DiaDTO diaDTO);
}
