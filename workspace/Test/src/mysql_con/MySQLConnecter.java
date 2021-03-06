package mysql_con;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnecter {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost/test?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC", "root", "1qazxsw2#EDC");
			System.out.println("MySQLに接続できました。");
			//SQL実行
			selectQuery(con);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			System.out.println(("JDBCドライバのダウンロードに失敗しました。"));
		} catch (SQLException e) {
			System.out.println("MySQLに接続できませんでした。");
			System.out.println("SQLException: " + e.getMessage());
		    System.out.println("SQLState: " + e.getSQLState());
		    System.out.println("VendorError: " + e.getErrorCode());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("MySQLのクローズに失敗しました。");
				}
			}
		}
	}

	private static void selectQuery(Connection con) throws SQLException {
		// TODO 自動生成されたメソッド・スタブ
		Statement stm = con.createStatement();
		String sql = "select * from denka_emp";
		ResultSet rs = stm.executeQuery(sql);

		while (rs.next()) {
			String bu_id = rs.getString("bu_id");
			String ka_id = rs.getString("ka_id");
			String name = rs.getString("name");
			System.out.println("取得結果-> " + bu_id + ":" + ka_id + ":" + name);

		}
	}

}
