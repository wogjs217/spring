package emp.mybatis.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;

@Controller
public class LogoutController {
	@Autowired
	MyEmpService service;
	//post방식으로 요청될때 실행할 메소드 - 실제 db에 insert를 하기 위한 기능을 수행
	@RequestMapping(value="/logout.do",method=RequestMethod.GET)
	public String logout(HttpServletRequest req ,MyEmpDTO user){
		HttpSession ses =  req.getSession(false);
		if(ses!=null){
			
			ses.invalidate();
		}
		return "index";
	}
}





