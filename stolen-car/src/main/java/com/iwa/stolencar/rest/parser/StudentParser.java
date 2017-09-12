package com.iwa.stolencar.rest.parser;

import java.util.List;

import com.iwa.stolencar.commos.dto.StudentDTO;
import com.iwa.stolencar.rest.vo.StudentVO;

public interface StudentParser {

	public List<StudentVO> parseToList(List<StudentDTO> dtos);
	StudentVO parseToStudentVO(StudentDTO dto);
}
