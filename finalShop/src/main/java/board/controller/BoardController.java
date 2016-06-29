package board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.service.TB_BoardDTOService;
import egovframework.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;

@Controller
public class BoardController {

	@Autowired
	TB_BoardDTOService service;

	@RequestMapping(value = "/board.do", method = RequestMethod.GET)
	public ModelAndView showBoardPage(String currentPageNo){

		
		int boardListSize = service.getboardListSize(); // 게시물의 총 갯수
		PaginationInfo paginationInfo = new PaginationInfo();
		paginationInfo.setCurrentPageNo(Integer.parseInt(currentPageNo)); //현재 페이지
		paginationInfo.setRecordCountPerPage(15); // 페이지당 게시물 수 15
		paginationInfo.setPageSize(10); //페이지 개수 10;
		paginationInfo.setTotalRecordCount(boardListSize);
		ModelAndView mav = new ModelAndView();
		
		int start = paginationInfo.getFirstRecordIndex();
		int end = start + paginationInfo.getRecordCountPerPage();
		
		HashMap<String , Object> map = new HashMap<String , Object>();
		
		map.put("start", start+1);
		map.put("end", end);
		
		System.out.println("::::::"+map.get("start"));
		System.out.println("::::::"+map.get("end"));
		
		
		List<Map<String,Object>> boardlist = service.selectBoardlist(map);
		
		
		mav.addObject("paginationInfo", paginationInfo);
		mav.addObject("boardlist", boardlist);
		mav.setViewName("board/board");
		return mav;
	}
}
