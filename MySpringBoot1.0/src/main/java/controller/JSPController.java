package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//跳转jsp页面：使用@Controller
public class JSPController {

	@RequestMapping(value="/jsp")
	public String x(Model model,String code){
		if(StringUtils.isEmpty(code)){
			model.addAttribute("code", "没传code");
		}else{
			model.addAttribute("code", code);
		}
		return "springJSP";
	}
	
}
