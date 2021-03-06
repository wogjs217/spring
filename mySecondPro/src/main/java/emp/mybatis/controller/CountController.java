package emp.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import emp.service.MyEmpService;
//mybatis기반  - myemp의 인원수 구하기
@Controller
public class CountController{
	@Autowired
	MyEmpService service;
	@RequestMapping("/emp/count.do")
	public String getCount(){
		int result = service.count();
		System.out.println("인원수===>"+result);
		return "index";
	}
}