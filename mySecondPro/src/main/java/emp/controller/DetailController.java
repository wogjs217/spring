package emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.service.MyEmpService;

@Controller
public class DetailController {
		@Autowired
		MyEmpService service;
		
		@RequestMapping(value="/detail.do", method=RequestMethod.GET)
		public ModelAndView showDetail(HttpServletRequest req, String id){
			ModelAndView mav = new ModelAndView();
			//mav.addObject("id", id);
			mav.setViewName("detail");
			return mav;
		}	
}
