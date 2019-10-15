package con.naveen.dependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/dependson_beans.xml");
		/*
		 * Laptop lap = context.getBean("laptop",Laptop.class);
		 * System.out.println(lap.getMotherboard());
		 */
		
	}
}
