package product.service;

import java.util.ArrayList;
import java.util.List;

import product.dto.ProductDTO;

public interface ProductService {
	
	List<ProductDTO> productlist(String category);	//ProductDAOImpl�� productlist()�� ȣ���ϴ� �޼ҵ�
	List<ProductDTO> searchTopProduct();
	ProductDTO read(String prd_no);
}
