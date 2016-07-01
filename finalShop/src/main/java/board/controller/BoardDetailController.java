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
public class BoardDetailController {

	@Autowired
	TB_BoardDTOService service;

	@RequestMapping(value = "/boarddetail.do", method = RequestMethod.GET)
	public ModelAndView showBoardWritePage(CommandMap commandMap) {
		ModelAndView mav = new ModelAndView();
		Map<String,Object> map = service.boardDetail(commandMap.getMap());
		map.put("board_no", commandMap.get("BOARD_NO").toString());
		/*System.out.println("디테일컨트롤:"+map.get("board_no").toString());*/
		mav.setViewName("board/boardDetail");
	    mav.addObject("map", map);
		return mav;
	}
}
