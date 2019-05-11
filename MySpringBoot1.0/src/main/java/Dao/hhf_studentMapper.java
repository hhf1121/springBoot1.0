package Dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import Bean.hhf_student;

public interface hhf_studentMapper {

	@Select("select * from hhf_student;")
	public List<hhf_student> getSelectAll();
	
	
}
