package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.sm1234.dao.CustomerMapper;
import cn.sm1234.domain.Customer;


public class MyBatisSpringTest {


    @Test
	public void test(){
		//1.加载spring配置
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.获取对象
		CustomerMapper customerMapper = (CustomerMapper)ac.getBean("customerMapper");
		
		//3.调用方法
		Customer customer = new Customer();
		customer.setName("Michael");
		customer.setGender("man");
		customer.setTelephone("020-888888");
		customer.setAddress("ShangHai GaoXing Town");
		
		customerMapper.saveCustomer(customer);
	}
}
