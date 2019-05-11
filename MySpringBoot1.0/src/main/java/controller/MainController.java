package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RequestMapping("/springBoot")
@RestController //所有的方法都默认@responseBody
public class MainController {

	//返回json
	@RequestMapping("/main")
	public String getMain(){
		return "main";
	}
	
	//全局异常
	@RequestMapping("/demoError")
	public Integer demoError(HttpServletRequest request){
		String name=request.getParameter("name");
		return Integer.valueOf(name);
	}
	
	
}
