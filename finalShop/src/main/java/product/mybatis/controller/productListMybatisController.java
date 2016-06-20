package product.mybatis.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.junit.runner.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import product.dto.ProductDTO;
import product.service.ProductService;

@Controller
public class productListMybatisController {
	@Autowired
	ProductService service;
	
	@RequestMapping(value="/prdlist.do",method=RequestMethod.GET)
	public ModelAndView showProductlist(HttpServletRequest request,String category, String pathurl){
		ModelAndView mav = new ModelAndView();
		String forwardview="";//forward될 view
		
		List<ProductDTO> prdlist = service.productlist(category);
		
		mav.addObject("prdlist",prdlist);
		
		
		if(category==null){
			//아코디언 이미지에 보여질 상품을 추가
			List<ProductDTO> toplist = 
					service.searchTopProduct();
			mav.addObject("toplist",toplist);
			mav.setViewName("/layout/indexLayout");
		}else{
			mav.addObject("pathurl",pathurl);
			mav.setViewName("/layout/mainLayout");
		}
		
		return mav;
	}
}
