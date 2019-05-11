package Dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import Bean.ProductSalServiceFee;

public interface ProductSalServiceFeeMapper {

	
	@Select("select * from product_sal_service_fee;")
	public List<ProductSalServiceFee> getSelectAll();
	
}
