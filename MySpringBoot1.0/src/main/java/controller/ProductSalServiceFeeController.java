package controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Bean.ProductSalServiceFee;
import service.ProductSalServiceFeeService;

@RestController
@RequestMapping("/product")
public class ProductSalServiceFeeController {

	@Resource
	private ProductSalServiceFeeService productSalServiceFeeService;
	
	@RequestMapping("/selectList")
	public List<ProductSalServiceFee> getList(){
		return productSalServiceFeeService.getSelectAll();
	}
	
}
