package controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Bean.hhf_student;
import service.hhf_studentService;

@RestController
@RequestMapping("/hhf_student")
public class hhf_studentController {

	private static Logger log=Logger.getLogger(hhf_studentController.class);
	
	@Autowired
	private hhf_studentService hhf_studentService;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@RequestMapping(value="/selectList"/*,produces="text/plain;charset=UTF-8"*/)//produces：中文乱码
	@ResponseBody
	public List<hhf_student> getSelectAll() {
		System.err.println("==========getSelectAll===========");
		return hhf_studentService.getSelectAll();
	}

	// 返回jsp视图逻辑：跳转jsp页面：使用@Controller、本Controller使用的是@RestController（返回json字符串，而不是视图名）
	@RequestMapping(value = "/springBootJSP")
	public String testJsp(Model model,@RequestParam(value="name",required=true)String name) {
		System.out.println("========JSP");
		model.addAttribute("name",name);
		return "springJSP";
	}
	
	
	//整合jdbc
	@RequestMapping("/selectListByJDBC")
	@ResponseBody
	@Transactional//开事务
	public  String updateByJDBC(Integer id,String name){
		System.out.println("------------------------");
		int x=jdbcTemplate.update("insert into hhf_student value(5,'e',11,'q')");
//		int y=1/0;
//		System.out.println(x+y);
		return "successInsert";
	}
	
	//打印日志
	@RequestMapping("/log")
	@ResponseBody
	public String getLog(){
		log.info("===========logInfo=========");
		return "log>>>";
	}
	
	
}
