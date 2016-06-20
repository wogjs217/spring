package emp.mybatis.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;

@Controller
public class InsertMybatisController {
	@Autowired
	MyEmpService service;
	//post������� ��û�ɶ� ������ �޼ҵ� - ���� db�� insert�� �ϱ� ���� ����� ����
	@RequestMapping(value="/mybatisinsert.do",method=RequestMethod.POST)
	public ModelAndView runInsert(HttpServletRequest req, MyEmpDTO user){
	
		service.insert(user);
		return new ModelAndView("redirect:mybatislist.do");
	}
}








