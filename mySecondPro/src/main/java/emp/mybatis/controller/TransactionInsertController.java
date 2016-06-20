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
public class TransactionInsertController {
		@Autowired
		MyEmpService service;
		
		//get������� ��û�ɶ� ������ �޼ҵ� - insert�������� response
		@RequestMapping(value="/txInsert.do", method=RequestMethod.GET)
		public String showPage(){
			return "tx/input";
		}
		
		//post������� ��û�ɶ� ������ �޼ҵ� - ���� db�� insert�� �ϱ� ���� ����� ����
		@RequestMapping(value="/txInsert.do", method=RequestMethod.POST)
		public ModelAndView runInsert(HttpServletRequest req, MyEmpDTO user, String id){
			System.out.println(user+"-----"+id);
			service.txinsert(user);
			return new ModelAndView("redirect:mybatislist.do");
		}
}
