package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @describe 全局异常处理类:要和发生异常的类在一个包下。
 * @author hhf
 *  目前状态:关闭。
 */

//@ControllerAdvice//标注为异常处理类。
public class GlobalExceptionHandler {

	
	@ExceptionHandler(RuntimeException.class)//捕捉runtimeException异常。
	@ResponseBody
	public Map<String, Object> exceptionHandler(){
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("errorCode", 500);
		map.put("errorMsg", "发生异常");
		return map;
	}
	
}
