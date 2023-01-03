package files.service;

import java.sql.SQLException;
import java.util.Map;

import files.dao.IFilesDAO;
import files.dao.FilesDAO;
import vo.FilesVO;

public class FilesService implements IFilesService{
	private static IFilesService instance = null;
	private IFilesDAO dao = null;
	private FilesService() {
		dao = FilesDAO.getInstance();
	}
	public static IFilesService getInstance() {
		if(instance == null) instance = new FilesService();
		return instance;
	}
	@Override
	public void insertFiles(Map<String, Object> map) throws SQLException {
		dao.insertFiles(map);
	}
	@Override
	public String selectFileCategoty(int file_category_no) throws SQLException {
		return dao.selectFileCategoty(file_category_no);
	}
	@Override
	public FilesVO selectFiles(Map<String, Object> map) throws SQLException {
		return dao.selectFiles(map);
	}
	
	@Override
	public int updateFiles(Map<String, Object> map) throws SQLException {
		return dao.updateFiles(map);
	}
	
	@Override
	public int searchFile(Map<String, Object> map) throws SQLException {
		return dao.searchFile(map);
	}

}
