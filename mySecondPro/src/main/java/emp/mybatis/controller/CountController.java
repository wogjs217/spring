package emp.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import emp.service.MyEmpService;
//mybatis���  - myemp�� �ο��� ���ϱ�
@Controller
public class CountController{
	@Autowired
	MyEmpService service;
	@RequestMapping("/emp/count.do")
	public String getCount(){
		int result = service.count();
		System.out.println("�ο���===>"+result);
		return "index";
	}
}