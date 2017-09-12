package com.iwa.stolencar.rest.parser.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.iwa.stolencar.commos.dto.MotoDTO;
import com.iwa.stolencar.rest.parser.MotoParser;
import com.iwa.stolencar.rest.vo.MotoVO;

@Component
public class MotoParserImpl implements MotoParser{

	@Override
	public List<MotoVO> parseToMotoVOList(List<MotoDTO> motoDTOs) {
		List<MotoVO> vos = new ArrayList<>();
		if(motoDTOs == null)
			return null;
		
		for(MotoDTO motoDTO: motoDTOs) {
			vos.add(this.parseToMotoVO(motoDTO));
		}
		
		return vos;
	}

	@Override
	public MotoVO parseToMotoVO(MotoDTO motoDTO) {
		if(motoDTO == null)
			return null;
		
		MotoVO motoVO = new MotoVO();
		motoVO.setId(motoDTO.getId());
		motoVO.setMark(motoDTO.getMark());
		motoVO.setKm(motoDTO.getKm());
		motoVO.setModelo(motoDTO.getModelo());
		motoVO.setYear(motoDTO.getYear());
		motoVO.setTitle("motorcycles");
		motoVO.setImage(motoDTO.getImage());
		
		return motoVO;
	}

}
