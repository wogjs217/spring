package board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import board.dto.TB_BoardDTO;
import common.common.CommandMap;

public interface TB_BoardDAO {
	
	List<TB_BoardDTO> getboardlist();
	void boardinsert(Map<String, Object> map);
	List<Map<String, Object>> selectBoardlist(HashMap<String , Object> map);
	Map<String, Object> boardDetail(Map<String, Object> map);
	void updatecount(Map<String, Object> map);
	int getboardListSize();
}









