package board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import board.dto.TB_BoardDTO;

@Repository("boarddao")
public class TB_BoardDaoImpl implements TB_BoardDAO {

	@Autowired
	SqlSession sqlSession;

	@Override
	public List<TB_BoardDTO> getboardlist() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("kitri.board.list");
	}

}
