package board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import board.dto.TB_BoardDTO;
import common.common.CommandMap;

@Repository("boarddao")
public class TB_BoardDaoImpl implements TB_BoardDAO {

	@Autowired
	SqlSession sqlSession;

	@Override
	public List<TB_BoardDTO> getboardlist() {
		return sqlSession.selectList("kitri.board.list");
	}

	@Override
	public void boardinsert(Map<String, Object> map) {
		sqlSession.insert("kitri.board.insert",map);
	}

	@Override
	public List<Map<String, Object>> selectBoardlist(HashMap<String , Object> map) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("kitri.board.selectlist",map);
	}

	@Override
	public Map<String, Object> boardDetail(Map<String, Object> map) {
		return sqlSession.selectOne("kitri.board.detail", map);
	}

	@Override
	public void updatecount(Map<String, Object> map) {
		/*sqlSession.update("kitri.board.updatecount",map);*/
		
	}

	@Override
	public int getboardListSize() {
		return sqlSession.selectOne("kitri.board.listSize");
	}

	@Override
	public void boardDelete(String board_no) {
		// TODO Auto-generated method stub
		sqlSession.update("kitri.board.delete",board_no);
	}

	@Override
	public void boardUpdate(Map<String, Object> map) {
		sqlSession.update("kitri.board.update",map);
	}

}
