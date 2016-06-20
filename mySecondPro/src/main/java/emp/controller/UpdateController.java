package emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;

@Controller
public class UpdateController {
		@Autowired
		MyEmpService service;
		
		@RequestMapping(value="/update.do", method=RequestMethod.GET)
		public String showPage(){
			return "update";
		}

		@RequestMapping(value="/update.do", method=RequestMethod.POST)
		public ModelAndView runInsert(HttpServletRequest req, MyEmpDTO userInfo, String id){
			System.out.println(req.getParameter("id"));
			System.out.println(userInfo);
			service.update(userInfo);
			return new ModelAndView("redirect:list.do");
		}
}