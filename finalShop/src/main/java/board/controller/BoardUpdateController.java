package board.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.service.TB_BoardDTOService;
import common.common.CommandMap;

@Controller
public class BoardUpdateController {
	
	@Autowired
	TB_BoardDTOService service;

	@RequestMapping(value = "/boardupdate.do", method = RequestMethod.POST)
	public ModelAndView runUpdate(CommandMap commandMap){
		
		/*System.out.println(comandMap.get("mem_Id").toString());
		System.out.println("$$$$$$$$$$$$"+comandMap.get("title").toString());
		System.out.println(comandMap.get("board_no").toString());*/
		
		/*Map<String, Object> map = null;
		map.put("title", commandMap.get("title").toString());
		*/
		System.out.println(commandMap.getMap());
		service.boardUpdate(commandMap.getMap());
		return new ModelAndView("redirect:board.do?currentPageNo=1");
	}
}
