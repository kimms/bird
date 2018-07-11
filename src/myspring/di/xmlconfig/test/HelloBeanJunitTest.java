package myspring.di.xmlconfig.test;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:myspring/di/xmlconfig/config/hellobeans.xml")
public class HelloBeanJunitTest {
//	ApplicationContext context;

//	@Before
//	public void init() {
//		context = new GenericXmlApplicationContext("myspring/di/xmlconfig/config/hellobeans.xml");
//		System.out.println(context);
//	}

//	@Test
//	public void hellobean() {
//		Hello hello2 = (Hello)context.getBean("Hello");
//	}
	
	
	@Autowired
	DataSource dataSource;
	
	@Test
	public void db() {
		try {
			System.out.println(dataSource.getConnection());
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
	}
}
