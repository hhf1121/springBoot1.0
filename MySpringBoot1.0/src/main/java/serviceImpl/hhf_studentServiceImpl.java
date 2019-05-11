package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Bean.hhf_student;
import Dao.hhf_studentMapper;
import service.hhf_studentService;

@Service
public class hhf_studentServiceImpl implements hhf_studentService {

	@Autowired
	private hhf_studentMapper hhf_studentMapper;
	
	@Override
	public List<hhf_student> getSelectAll() {
		return hhf_studentMapper.getSelectAll();
	}

}
