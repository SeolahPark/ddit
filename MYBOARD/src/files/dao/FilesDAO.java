package files.dao;

import java.sql.SQLException;
import java.util.Map;

import com.ibatis.sqlmap.client.SqlMapClient;

import config.SqlMapClientFactory;
import vo.FilesVO;

public class FilesDAO implements IFilesDAO{
	private static IFilesDAO instance = null;
	private SqlMapClient smc = null;
	
	private FilesDAO() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static IFilesDAO getInstance() {
		if(instance == null) instance = new FilesDAO();
		return instance;
	}
	
	@Override
	public void insertFiles(Map<String, Object> map) throws SQLException {
		smc.insert("files.insertFiles", map);
	}

	@Override
	public String selectFileCategoty(int file_category_no) throws SQLException {
		return (String) smc.queryForObject("files.selectFileCategoty", file_category_no);
	}

	@Override
	public FilesVO selectFiles(Map<String, Object> map) throws SQLException {
		return (FilesVO) smc.queryForObject("files.selectFiles", map);
	}

	@Override
	public int updateFiles(Map<String, Object> map) throws SQLException {
		return smc.update("files.updateFiles", map);
	}

	@Override
	public int searchFile(Map<String, Object> map) throws SQLException {
		return (int) smc.queryForObject("files.searchFile", map);
	}
	
}
