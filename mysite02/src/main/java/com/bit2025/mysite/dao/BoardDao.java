package com.bit2025.mysite.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit2025.mysite.vo.BoardVo;

public class BoardDao {
	
	public List<BoardVo> findAll() {
		List<BoardVo> result = new ArrayList<>();
		
		try (
			    Connection con = getConnection();
			    PreparedStatement pstmt = con.prepareStatement("select id, title, contents, hit, reg_time g_no, o_no, depth, user_id from board");
			    ResultSet rs = pstmt.executeQuery();
			) {
			    while(rs.next()) {
	 				Long id = rs.getLong(1);
	 				String title = rs.getString(2);
	 				String content = rs.getString(3);
	 				int hit = rs.getInt(4);
	 				Date reg_time = rs.getDate(5);
	 				int g_no = rs.getInt(6);
	 				int o_no = rs.getInt(7);
	 				int depth = rs.getInt(8);
	 				Long user_id = rs.getLong(9);
	 				
	 				BoardVo vo = new BoardVo();
	 				vo.setId(id);
	 				vo.setTitle(title);
	 				vo.setContents(content);
	 				vo.setHit(hit);
	 				vo.setReg_time(reg_time);
	 				vo.setG_no(g_no);
	 				vo.setN_no(o_no);
	 				vo.setDepth(depth);
	 				vo.setUser_id(user_id);
	 				
	 				result.add(vo);
	           }
	 			
			} catch (SQLException e) {
            	System.out.println("error: " + e);
		}
            return result;
	} 
		public int insert(BoardVo vo) {
			int count = 0;
			
			try (
				Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement("insert into board(title, contents, hit, reg_time, g_no, o_no, depth, user_id) values(?, ?, ?, now(), ?, ?, ?, ?");
				) {
				pstmt.setString(1, vo.getTitle());
				pstmt.setString(2, vo.getContents());
				pstmt.setInt(3, vo.getHit());
				pstmt.setInt(4, vo.getG_no());
				pstmt.setInt(5, vo.getO_no());
				pstmt.setInt(6, vo.getDepth());
				pstmt.setLong(7, vo.getUser_id());
				pstmt.setDate(8, vo.getReg_time());
					
					
					count = pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("error: " + e);
		}
			
			return count;
}
		
		public int deleteByIdDepthGroupAndUser(Long id, int depth, int g_no, Long user_id) {
			String sql = "delete from board where id = ? and depth = ? and g_no = ? and user_id = ?";
			
			int Count = 0;
			
			try (
				Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(sql)) {
				
				pstmt.setLong(1, id);
				pstmt.setInt(2, depth);
				pstmt.setInt(3, g_no);
				pstmt.setLong(4, user_id);
				
				depth = pstmt.executeUpdate();
			} catch (SQLException e) {
				System.out.println("error: " + e);
			}
			
			return Count;
					
		}
		
		private Connection getConnection() throws SQLException {
			Connection con = null;
			
			try {
				Class.forName("org.mariadb.jdbc.Driver");
			
				String url = "jdbc:mariadb://192.168.0.179:3306/webdb";
				con = DriverManager.getConnection(url, "webdb", "webdb");
			} catch (ClassNotFoundException e) {
				System.out.println("드라이버 로딩 실패:" + e);
			} 
			
			return con;
		}
}