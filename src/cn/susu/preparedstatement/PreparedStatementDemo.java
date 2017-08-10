package cn.susu.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;

public class PreparedStatementDemo {
	private static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DBURL = "jdbc:oracle:thin:@localhost:1521:tsu";
	private static final String USER = "scott";
	private static final String PASSWORD = "tiger";
	public static void main(String[] args) throws Exception {
		String name = "Mr'SMITH"; 
		Date birthday = new Date();
		int age = 18;
		String note = "ÊÇ¸öÍá¹ûÈÊ";
		
		Class.forName(DBDRIVER);
		
		Connection conn = DriverManager.getConnection(DBURL);
		String sql = " INSERT INTO member(mid,name,birthday,age,note) VALUES "
				   + " (myseq.nextval,?,?,?,?) ";
		PreparedStatement stmt = conn.prepareStatement(sql);
	}

}
