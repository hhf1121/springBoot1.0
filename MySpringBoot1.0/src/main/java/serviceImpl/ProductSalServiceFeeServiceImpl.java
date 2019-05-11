package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Bean.ProductSalServiceFee;
import Dao.ProductSalServiceFeeMapper;
import service.ProductSalServiceFeeService;
@Service
public class ProductSalServiceFeeServiceImpl implements ProductSalServiceFeeService {

	
	@Autowired
	private ProductSalServiceFeeMapper  productSalServiceFeeMapper;
	
	
	
	@Override
	public List<ProductSalServiceFee> getSelectAll() {
		// TODO Auto-generated method stub
		return productSalServiceFeeMapper.getSelectAll();
	}

}
