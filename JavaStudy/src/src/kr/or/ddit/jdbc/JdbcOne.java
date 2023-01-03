package kr.or.ddit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.or.ddit.util.SpaceUtil;

public class JdbcOne {
	// DB 사용 목적 : Data를 가용하기 위해서

	//
	// * JDBC 작성 단계 *
	// 0. 데이터베이스 접속 정보 입력.
	// 1. Connection 생성
	// 2. Statement 생성 (쿼리query 생성)
	// 3. Statement 실행 (쿼리 실행)
	// 4. ResultSet에서 결과 추출 (SELECT 경우)
	// 5. ResultSet, Statement, Connection 닫기
	//

	
	public static void main(String[] args) {

		
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "PSA93";
		String pwd = "java";
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
//		List<Map<String, Object>> rowList = null;

		try {
			conn = DriverManager.getConnection(url, user, pwd); // -> 카톡친추
			
			if (conn.isClosed()) {
				System.out.println("실패!");
			}
			
			String sql = " SELECT BO_NO,BO_TITLE,BO_WRITER,TO_CHAR(BO_DATE, 'MM-DD HH24:MI') AS BO_DATE,BO_HIT FROM NOTICE ";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			
			System.out.println("==================== 게시판 ====================");
			System.out.print(SpaceUtil.format("번호", 3, 0));
			System.out.print(SpaceUtil.format("제목", 20, 0));
			System.out.print(SpaceUtil.format("작성자", 10, 0));
			System.out.print(SpaceUtil.format("날짜", 10, 0));
			System.out.println(SpaceUtil.format("조회", 3, 0));
			System.out.println("------------------------------------------------");
			
			// 문제1)
			// 컬렉션 list를 사용하고
			// list에 db에서 넘겨받은 noitce 테이블 데이터 전부를 list에 담고 담은 리스트 모드 출력하세요
			// 이때 넘어온 데이터는 noitceVO객체에 담고 담은 NoticeVO 객체를list에 담아주세요.
			
//			(방법1 - List-Map 방법)
			List<Map<String, Object>> rowList = new ArrayList<Map<String,Object>>();
			while (rs.next()) {
				Map<String, Object> row = new HashMap<>();
				
				for (int i = 1; i <= columnCount; i++) {
					String key = rsmd.getColumnName(i);
					Object value = rs.getObject(i);
					row.put(key, value);
				}
				rowList.add(row);
			}
			for (int i = 0; i < rowList.size(); i++) {
				System.out.print(SpaceUtil.format(rowList.get(i).get("BO_NO"), 3, 0));
				System.out.print(SpaceUtil.format(rowList.get(i).get("BO_TITLE"), 20, 0));
				System.out.print(SpaceUtil.format(rowList.get(i).get("BO_WRITER"), 10, 0));
				System.out.print(SpaceUtil.format(rowList.get(i).get("BO_DATE"), 10, 0));
				System.out.println(SpaceUtil.format(rowList.get(i).get("BO_HIT"), 5, 0));
			}System.out.println("================================================");

////			(방법2 - NoticeVO방법)
//			List<NoticeVO> noticeList = new ArrayList<NoticeVO>();
//			while (rs.next()) {
//				NoticeVO nvo = new NoticeVO();
//				nvo.setBo_num(rs.getInt("BO_NO"));
//				nvo.setBo_title(rs.getString("BO_TITLE"));
//				nvo.setBo_write(rs.getString("BO_WRITER"));
//				nvo.setBo_date(rs.getString("BO_DATE"));
//				nvo.setBo_hit(rs.getInt("BO_HIT"));
//				noticeList.add(nvo);
//			}
//			for (int i = 0; i < noticeList.size(); i++) {
//				System.out.print(SpaceUtil.format(noticeList.get(i).getBo_num(), 3, 0));
//				System.out.print(SpaceUtil.format(noticeList.get(i).getBo_title(), 20, 0));
//				System.out.print(SpaceUtil.format(noticeList.get(i).getBo_write(), 10, 0));
//				System.out.print(SpaceUtil.format(noticeList.get(i).getBo_date(), 10, 0));
//				System.out.println(SpaceUtil.format(noticeList.get(i).getBo_hit(), 5, 0));
//			}			System.out.println("================================================");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) try { conn.close(); } catch(Exception e) {}
			if (rs != null)	try { rs.close(); } catch (Exception e) {}
			if (ps != null)	try { ps.close(); } catch (Exception e) {}
		}
	}

}
