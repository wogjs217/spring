package product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import product.dto.ProductDTO;
import product.dto.ProductRowMapper;

@Repository("productdao")
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public List<ProductDTO> productlist(String category) throws SQLException {
		// TODO Auto-generated method stub
		
		if(category==null){
			return template.query("select * from tb_product", new ProductRowMapper());
			
		}else{

			return template.query("select * from tb_product where category_no=?", new ProductRowMapper());
		}
		
	}

	@Override
	public List<ProductDTO> searchTopProduct() throws SQLException {
		// TODO Auto-generated method stub
		return template.query("select PRD_NO,PRD_NM,IMG_GEN_FILE_NM from tb_product "
				+ "where PRD_NO in (select PRD_NO from topproduct)", new ProductRowMapper());
	}

	@Override
	public ProductDTO read(Connection conn, String prd_no) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
