package in.bham.service;

import java.util.List;
import java.util.Map;

public interface IEmployeeService {
	
	public int fetchEmployee();
	
	public String getNameById(int eno);
	
	public Map<String,Object> getEmployeeByno(int eno);
	
	public List<Map<String,Object>> getEmployeeListByAddr(String addr1);

}
