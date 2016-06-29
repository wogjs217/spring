package board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import board.dao.TB_BoardDAO;
import board.dto.TB_BoardDTO;
import common.common.CommandMap;

@Service
public class TB_BoardDTOServiceImpl implements TB_BoardDTOService {
	
	@Autowired
	@Qualifier("boarddao")
	TB_BoardDAO dao;
	
	
	@Override
	public List<TB_BoardDTO> getboardlist() {
		return dao.getboardlist();
	}


	@Override
	public void boardinsert(Map<String, Object> map) {
		dao.boardinsert(map);
		
	}


	@Override
	public List<Map<String, Object>> selectBoardlist(HashMap<String , Object> map) {
		return dao.selectBoardlist(map);
	}


	@Override
	public Map<String, Object> boardDetail(Map<String, Object> map) {
		dao.updatecount(map);
		return dao.boardDetail(map);
	}


	@Override
	public int getboardListSize() {
		return dao.getboardListSize();
	}


}
