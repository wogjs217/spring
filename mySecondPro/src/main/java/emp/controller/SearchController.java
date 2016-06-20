package emp.controller;

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
public class SearchController{
	@Autowired
	MyEmpService service;
	
	@RequestMapping(value="/search.do", method=RequestMethod.GET)
	public String showSearch(){
		return "search";
	}
	
	@RequestMapping(value="/search.do", method=RequestMethod.POST)
	public ModelAndView runSearch(HttpServletRequest req, String search){
		ModelAndView mav = new ModelAndView();
		List<MyEmpDTO> userlist = service.findByAddr(req.getParameter("search"));
		mav.addObject("userlist",userlist);
		mav.setViewName("searchlist");
		return mav;
	}
}