package cars;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import cars.beans.Car;
import cars.controller.BeanConfiguration;
import cars.repository.CarRepository;

@SpringBootApplication
public class SpringCarsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringCarsApplication.class, args);
	}
	
	@Autowired
	CarRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Car c = appContext.getBean("car", Car.class);
		c.setYear(2011);
		repo.save(c);
		
		Car d = new Car(2005, "Subaru", "STI");
		repo.save(d);
		
		List<Car> allCars = repo.findAll();
		for(Car cars: allCars) {
			System.out.println(cars.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}

}
