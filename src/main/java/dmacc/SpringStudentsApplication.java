package dmacc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Student;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.StudentRepository;

@SpringBootApplication
public class SpringStudentsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringStudentsApplication.class, args);
	}
		@Autowired
		StudentRepository repo;
		
		@Override
		public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Student joe = appContext.getBean("student", Student.class);
		joe.setFname("Joe");
		joe.setLname("Shilkaitis");
		joe.setAge(29);
		joe.setBeltRank("Black");
		repo.save(joe);
		
		((AbstractApplicationContext) appContext).close();
	}

}
