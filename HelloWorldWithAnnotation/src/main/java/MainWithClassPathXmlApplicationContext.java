

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.init.HelloWorld;
import com.sample.init.WelcomeComponent;

@Configuration
public class MainWithClassPathXmlApplicationContext {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

//		HelloWorld helloWorld = (HelloWorld) context.getBean(HelloWorld.class);
		String name = "Nitin";
//		helloWorld.setName(name);
//		helloWorld.printHello();
		
		WelcomeComponent welcomeComponent = (WelcomeComponent) context.getBean(WelcomeComponent.class);
		welcomeComponent.sayHello(name);
	}

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}
