package emp.mybatis.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import emp.service.MyEmpService;
@Controller
public class ReadMybatisController{
	@Autowired
	MyEmpService service;
	@RequestMapping(value="/mybatisRead.do")
	public ModelAndView runRead(HttpServletRequest req
						,String id,String action){
		String viewInfo="";
		if(action.equals("read")){
			viewInfo = "mybatisread";
		}else{
			viewInfo = "update/form";
		}
		return
		new ModelAndView(viewInfo,"userInfo",service.read(id));
	}

}





