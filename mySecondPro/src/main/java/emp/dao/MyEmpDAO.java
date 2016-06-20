package emp.dao;

import java.util.List;

import emp.dto.MyEmpDTO;

public interface MyEmpDAO {
	//ȸ���ο��� ��ȸ
	int count();
	//ȸ������
	void insert(MyEmpDTO user);
	//ȸ����������
	void update(MyEmpDTO userInfo);
	//ȸ��Ż��
	void delete(String id);
	//�α���
	MyEmpDTO login(MyEmpDTO loginUser);
	//ȸ����Ϻ���
	List<MyEmpDTO> getMemberList();
	//�ּҷ� �˻�
	List<MyEmpDTO> findByAddr(String addr);
	//ȸ����������
	MyEmpDTO read(String id);

}









