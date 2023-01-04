package warp.spring.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import warp.spring.sfgdi.controllers.ConstructorInjectedController;
import warp.spring.sfgdi.controllers.MyController;
import warp.spring.sfgdi.controllers.PropertyInjectedController;
import warp.spring.sfgdi.controllers.SettterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");


		System.out.println(myController.getGreeting());
		//System.out.println(greeting);

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		SettterInjectedController settterInjectedController = (SettterInjectedController) ctx.getBean("settterInjectedController");
		System.out.println(settterInjectedController.getGreeting());

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}
}
