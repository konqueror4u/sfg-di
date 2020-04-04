package com.di.dependencyInjection;

import com.di.dependencyInjection.examplebeans.FakeDataSource;
import com.di.dependencyInjection.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.di.dependencyInjection.controller", "com.di.dependencyInjection.service", "com.di.dependencyInjection.examplebeans", "com.di.dependencyInjection.config"})
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		/*MyController myController =  (MyController) ctx.getBean("myController");

		String greeting = myController.sayHelloWorld();
		System.out.println(greeting);
		PropertyInjectionController propertyInjectionController = (PropertyInjectionController) ctx.getBean("propertyInjectionController");
		System.out.println(propertyInjectionController.getGreeting());
		SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");
		System.out.println(setterInjectionController.getGreeting());
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayGreeting());*/

		FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUserName());

		FakeJmsBroker fakeJmsBroker =  ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUrl());
	}

}
