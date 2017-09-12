package com.iwa.stolencar.rest.parser.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.iwa.stolencar.commos.dto.AutoDTO;
import com.iwa.stolencar.rest.parser.AutoParser;
import com.iwa.stolencar.rest.vo.AutoVO;

@Component
public class AutoParserImpl implements AutoParser{

	@Override
	public List<AutoVO> parseToAutoVOList(List<AutoDTO> autoDTOs) {
		List<AutoVO> vos = new ArrayList<>();
		if(autoDTOs == null)
			return null;
		
		for(AutoDTO autoDTO: autoDTOs) {
			vos.add(this.parseToAutoVO(autoDTO));
		}
		
		return vos;
	}

	@Override
	public AutoVO parseToAutoVO(AutoDTO autoDTO) {
		if(autoDTO == null)
			return null;
		
		AutoVO autoVO = new AutoVO();
		autoVO.setId(autoDTO.getId());
		autoVO.setMark(autoDTO.getMark());
		autoVO.setKm(autoDTO.getKm());
		autoVO.setModelo(autoDTO.getModelo());
		autoVO.setYear(autoDTO.getYear());
		autoVO.setTitle("cars");
		autoVO.setImage(autoDTO.getImage());
		
		return autoVO;
	}

}
