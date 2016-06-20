package emp.mybatis.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;
@Controller
public class SearchMybatisController{
	@Autowired
	MyEmpService service;
	
	/*@RequestMapping(value="/mybatisSearch.do", method=RequestMethod.GET)
	public String showSearch(){
		return "search";
	}*/
	
	//post방식으로 요청될때 실행할 메소드 - 실제 db에 insert를 하기 위한 기능을 수행
	@RequestMapping(value="/mybatisSearch.do",method=RequestMethod.POST)
	public ModelAndView showSearch(HttpServletRequest req
						,String search){
		ModelAndView mav = new ModelAndView();
		List<MyEmpDTO> userlist =	service.findByAddr(search); 
		mav.addObject("userlist", userlist);
		mav.setViewName("search");
		return mav;
	}

}





