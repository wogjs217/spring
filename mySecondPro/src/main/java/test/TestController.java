package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController{
	@RequestMapping("/emp/test.do")
	public ModelAndView test(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","스프링에서 넘어온 데이터 anno");
		mav.setViewName("test");
		
		System.out.println("연습 : 어노테이션 기반 작업");
		
		return mav;	
	}
}
