package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.service.TB_BoardDTOService;

@Controller
public class BoardDeleteController {
	@Autowired
	TB_BoardDTOService service;

	@RequestMapping(value = "/boarddelete.do", method = RequestMethod.GET)
	public ModelAndView runDelete(String BOARD_NO){
		//System.out.println("deleteControll연결 성공");
		service.boardDelete(BOARD_NO);
		return new ModelAndView("redirect:board.do?currentPageNo=1");
	}
}
