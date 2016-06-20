package product.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import product.dto.ProductDTO;

public interface ProductDAO {
	List<ProductDTO> productlist (String category)throws SQLException;
	List<ProductDTO> searchTopProduct() throws SQLException;
	ProductDTO read(Connection conn,String prd_no) throws SQLException;
}
