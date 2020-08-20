package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.DBConnect;
import model.MemberVO;

public class DaoImpl implements Dao {
	private DBConnect db;

	public DaoImpl() {
		db = DBConnect.getInstance();
	}
	@Override
	public ArrayList idList() {
		// TODO Auto-generated method stub
		ArrayList<MemberVO> data = new ArrayList<MemberVO>();
		ResultSet rs = null;
		PreparedStatement pstm = null;
		Connection conn = db.getConnection();
		
		String sql = "select id from member";
		try {
			pstm = conn.prepareStatement(sql);

			rs = pstm.executeQuery();
			
			while(rs.next()) {
			  data.add(new MemberVO(rs.getString(1)));
			}
			rs.close();
			pstm.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}

	    System.out.println(data);
		return data;

	}
	@Override
	public MemberVO findMember(String id) {
		// TODO Auto-generated method stub
		Connection conn = db.getConnection();
		ResultSet rs= null;
		String sql = "select * from member where id=?";
		
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, id);
			rs = pstm.executeQuery();
			if(rs.next()) {
				return new MemberVO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				rs.close();
			
				//pstm.close();
				
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
		}
		}
		return null;
	}
	@Override
	public void register(MemberVO vo) {
		// TODO Auto-generated method stub
		
		Connection conn = db.getConnection();
		
		String sql = "insert into member values(?,?,?,?)";
		
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, vo.getId());
			pstm.setString(2,vo.getPassword());
			pstm.setString(3,vo.getAddress());
			pstm.setString(4,vo.getName());
			
			
			pstm.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
