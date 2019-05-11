package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Bean.jpaHhfStudent;
import repository.UserRepository;

@RequestMapping("jpa")
@RestController
public class JpaHHFStudentController {

	@Autowired
	private UserRepository userRepository;
	
	
	//查询1
	@RequestMapping("/selectById")
	public String index(Integer id){
		System.out.println("--------------jpa");
		return userRepository.findOne(id).toString();
	}
	
	//查询2
	@RequestMapping("/selectAll")
	public List<jpaHhfStudent> selectAll(){
		System.out.println("--------------jpa");
		return userRepository.findAll();
	}
	
	//传了id->更新；不传id->新增：批量更新，此方法可能导致某些字段为null
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public List<jpaHhfStudent> save(@RequestBody List<jpaHhfStudent> jpaHhfStudent){
		System.out.println("--------------jpa");
		if(null==jpaHhfStudent||jpaHhfStudent.size()==0){
			throw new RuntimeException("对象为空");
		}
		return  userRepository.save(jpaHhfStudent);
	}
	
	
	//新增：表的id必须为自增，才可新增。
	@RequestMapping(value = "/saveNew", method = RequestMethod.POST)
	public jpaHhfStudent saveNew(@RequestBody jpaHhfStudent jpaHhfStudent) {
		System.out.println("--------------jpa---savenew");
		if (null == jpaHhfStudent) {
			throw new RuntimeException("对象为空");
		}
		return userRepository.saveAndFlush(jpaHhfStudent);
	}
	
}
