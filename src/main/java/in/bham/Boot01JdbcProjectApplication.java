package in.bham;

import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.bham.service.IEmployeeService;

@SpringBootApplication
public class Boot01JdbcProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Boot01JdbcProjectApplication.class, args);
		
		IEmployeeService service = context.getBean(IEmployeeService.class);
		List<Map<String,Object>> listByAddr = service.getEmployeeListByAddr("Surat");
		
		listByAddr.forEach(System.out::println);
	}

}
