

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sample.init.HelloWorld;
import com.sample.init.WelcomeComponent;

@Configuration
@ComponentScan(basePackages = "com.sample.init")
public class MainWithAnnotationConfigApplicationContext {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				MainWithAnnotationConfigApplicationContext.class);

		HelloWorld helloWorld = (HelloWorld) context.getBean(HelloWorld.class);
		String name = "Nitin";
		helloWorld.setName(name);
		helloWorld.printHello();
		
		WelcomeComponent welcomeComponent = (WelcomeComponent) context.getBean(WelcomeComponent.class);
		welcomeComponent.sayHello(name);
	}

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
}
