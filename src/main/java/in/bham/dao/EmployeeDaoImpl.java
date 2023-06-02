package in.bham.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {
	
	private static final String GET_LIST_EMPLOYEE ="select eid,ename,eage,eaddr from employee where eaddr=?";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int getEmployee() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getEmpByno(int eno) {
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
		
		
		return jdbcTemplate.queryForList(GET_LIST_EMPLOYEE,addr1);
	}

}
