package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import board.dao.TB_BoardDAO;
import board.dto.TB_BoardDTO;

@Service
public class TB_BoardDTOServiceImpl implements TB_BoardDTOService {
	
	@Autowired
	@Qualifier("boarddao")
	TB_BoardDAO dao;
	
	
	@Override
	public List<TB_BoardDTO> getboardlist() {
		return dao.getboardlist();
	}

}
