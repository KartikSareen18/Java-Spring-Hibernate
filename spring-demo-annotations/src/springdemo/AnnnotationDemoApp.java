package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnnotationDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Coach theCoach=context.getBean("myCoach",Coach.class);
		
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
		

	}

}
