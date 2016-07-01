package board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.service.TB_BoardDTOService;
import common.common.CommandMap;

@Controller
public class BoardWriteController {
	
	@Autowired
	TB_BoardDTOService service;
	
	@RequestMapping(value="/boardwrite.do",method=RequestMethod.GET)
	public String showBoardWritePage(){
		return "board/boardWrite";
	}
	
	@RequestMapping(value="/boardwrite.do",method=RequestMethod.POST)
	public ModelAndView runBoardwrite(CommandMap commandMap){
		service.boardinsert(commandMap.getMap());
		return new ModelAndView("redirect:board.do");
	}
}
