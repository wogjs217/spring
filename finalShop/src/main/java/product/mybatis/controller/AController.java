package product.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AController{
	
	
	@RequestMapping(value="/a.do",method=RequestMethod.GET)
	public ModelAndView showBoardPage(){ //String pageNum
		System.out.println("aaaaaaaaaaaaaaaa");
		return null;
	}
}
