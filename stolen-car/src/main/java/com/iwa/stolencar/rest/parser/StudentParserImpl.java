package com.iwa.stolencar.rest.parser;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.iwa.stolencar.commos.dto.StudentDTO;
import com.iwa.stolencar.rest.vo.StudentVO;

@Component
public class StudentParserImpl implements StudentParser{

	@Override
	public StudentVO parseToStudentVO(StudentDTO dto) {
		if(dto == null)
			return null;
		
		StudentVO vo = new StudentVO();
		vo.setId(dto.getId());
		vo.setName(dto.getName());
		
		return vo;
	}

	@Override
	public List<StudentVO> parseToList(List<StudentDTO> dtos) {
		List<StudentVO> vos = new ArrayList<>();
		if(dtos == null)
			return vos;
		
		for(StudentDTO dto: dtos) {
			vos.add(this.parseToStudentVO(dto));
		}
		
		return vos;
	}

}
