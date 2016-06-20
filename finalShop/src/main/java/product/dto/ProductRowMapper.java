package product.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductRowMapper  implements RowMapper<ProductDTO>{

	@Override
	public ProductDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		System.out.println("?????????????????????????????????????????");
		// TODO Auto-generated method stub
		ProductDTO list= new ProductDTO(rs.getString(1),rs.getString(2),
				rs.getString(3));
		return list;
	}
	public ProductDTO mapRow(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
		ProductDTO list= new ProductDTO(rs.getString(1),rs.getString(2),
				rs.getString(3), rs.getString(4), rs.getInt(5), 
				rs.getString(6), rs.getString(7), rs.getString(8), 
				rs.getString(9), rs.getString(10), rs.getString(11), 
				rs.getString(12), rs.getString(13),rs.getString(14));
		return list;
	}

}
