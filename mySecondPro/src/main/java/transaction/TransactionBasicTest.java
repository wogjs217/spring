package transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//������ü�۾�
public class TransactionBasicTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "";
		Connection con = null;
		PreparedStatement ptmt = null;
		boolean state = false;// ������°�

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);

			con.setAutoCommit(false);//Ʈ������� ����
			sql = "insert into myemp values('2727', '1111', '1111', 1000, '111', '001', '1111')";
			ptmt = con.prepareStatement(sql);
			ptmt.executeUpdate();

			sql = "insert into myemp values('2828', '2222', '2222', 1000, '111', '001', '1111')";
			ptmt = con.prepareStatement(sql);
			ptmt.executeUpdate();

			sql = "insert into myemp value('2929', '3333', '3333', 1000, '111', '001', '1111')";
			ptmt = con.prepareStatement(sql);
			ptmt.executeUpdate();
			state = true;

		} catch (ClassNotFoundException e) {
			System.out.println("����̹��ε� ����");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (state) {
					con.commit();
				}else{
					con.rollback();
				}
				if(ptmt!=null)ptmt.close();
				if(con!=null)con.close();
			} catch (Exception e) {}
		}

	}

}
