package product.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import product.dto.ProductDTO;
import product.dto.ProductRowMapper;

@Repository("productmybatisdao")
public class ProductMybatisDAOImpl implements ProductDAO{
	
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<ProductDTO> productlist(String category) throws SQLException {
		
		
		if(category==null){
			return sqlSession.selectList("kitri.product.list");
			
		}else{

			return sqlSession.selectList("kitri.product.category_list",category);
		}
	}

	@Override
	public List<ProductDTO> searchTopProduct() throws SQLException {
		return sqlSession.selectList("kitri.product.toplist");
	}

	@Override
	public ProductDTO read(Connection conn, String prd_no) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
