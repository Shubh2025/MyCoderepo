package in.bham.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.bham.dao.IEmployeeDao;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeDao emplDao;

	@Override
	public int fetchEmployee() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNameById(int eno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getEmployeeByno(int eno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> getEmployeeListByAddr(String addr1) {
		// TODO Auto-generated method stub
		return emplDao.getEmployeeListByAddr(addr1);
	}

}
