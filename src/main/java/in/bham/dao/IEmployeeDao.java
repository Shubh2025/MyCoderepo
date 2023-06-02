package in.bham.dao;

import java.util.List;
import java.util.Map;

public interface IEmployeeDao {
	
	public int getEmployee();
	
	public String getEmpByno(int eno);
	
	public Map<String,Object> getEmployeeByno(int eno);
	
	public List<Map<String,Object>> getEmployeeListByAddr(String addr1);

}
