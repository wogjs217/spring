package product.service;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import product.dao.ProductDAO;
import product.dao.ProductDAOImpl;
import product.dto.ProductDTO;

@Service
public class ProductServiceImpl implements ProductService {
	
	
	@Autowired
	@Qualifier("productmybatisdao")
	ProductDAO dao;

	@Override
	public List<ProductDTO> productlist(String category) {
		try {
			return dao.productlist(category);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		return null;
	}

	@Override
	public List<ProductDTO> searchTopProduct() {
		// TODO Auto-generated method stub
		try {
			return dao.searchTopProduct();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ProductDTO read(String prd_no) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
