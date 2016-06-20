package board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.dto.TB_BoardDTO;
import board.service.TB_BoardDTOService;

@Controller
public class BoardController {
	
	@Autowired
	TB_BoardDTOService service;
	
	@RequestMapping(value="/board.do",method=RequestMethod.GET)
	public ModelAndView showBoardPage(){ //String pageNum
		System.out.println("board.do ¿¬°á");
		ModelAndView mav = new ModelAndView();
		List<TB_BoardDTO> boardlist =service.getboardlist();
		mav.addObject("boardlist",boardlist);
		mav.setViewName("board");
		return mav;
	}
}
