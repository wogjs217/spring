package emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import emp.dao.MyEmpDAO;
import emp.dto.MyEmpDTO;
@Service
public class MyEmpServiceImpl implements MyEmpService {
	@Autowired
	@Qualifier("empmybatis")
	MyEmpDAO dao;
	@Override
	public int count() {
		return dao.count();
	}

	@Override
	public void insert(MyEmpDTO user) {
		dao.insert(user);
	}

	@Override
	public void update(MyEmpDTO userInfo) {
		dao.update(userInfo);
	}

	@Override
	public void delete(String id) {
		dao.delete(id);
	}

	@Override
	public MyEmpDTO login(MyEmpDTO loginUser) {
		return dao.login(loginUser);
	}

	@Override
	public List<MyEmpDTO> getMemberList() {
		// TODO Auto-generated method stub
		return dao.getMemberList();
	}

	@Override
	public List<MyEmpDTO> findByAddr(String addr) {
		// TODO Auto-generated method stub
		return dao.findByAddr(addr);
	}

	@Override
	public MyEmpDTO read(String id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}
	//Ʈ�����ó���� �׽�Ʈ�ϱ� ���� service�� insert
	@Override
	public void txinsert(MyEmpDTO user) {
		dao.insert(user);
		dao.insert(null);
		
	}

}











