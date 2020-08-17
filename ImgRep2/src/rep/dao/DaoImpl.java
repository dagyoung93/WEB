package rep.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.DBConnect;
import model.Rep;

public class DaoImpl implements Dao {
	private DBConnect db;
	public DaoImpl() {
		db = DBConnect.getInstance();
	}
	@Override
	public void insert(Rep rep) {
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;

		String sql="insert into reps values(seq_reps.nextval, ?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,rep.getWriter());
			pstmt.setString(2,rep.getContent());
			pstmt.setInt(3, rep.getImg_num());
			pstmt.executeUpdate();
			pstmt.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public ArrayList<Rep> selectByImg_num(int img_num) {
		// TODO Auto-generated method stub.
		Connection conn = db.getConnection();
		PreparedStatement pstmt = null;
		ArrayList<Rep> reps = new ArrayList<Rep>();
		ResultSet rs = null;
		String sql = "select * from reps where img_num=? order by num";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,img_num);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				reps.add(new Rep(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
			rs.close();
			pstmt.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return reps;
	}
}
