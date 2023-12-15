package org.technous.jpademo.jpaapp;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.technous.jpademo.jpaapp.dao.UserRepo;
import org.technous.jpademo.jpaapp.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class JpaappApplication {

	public static void main(String[] args) {

	  ConfigurableApplicationContext context= (ConfigurableApplicationContext) SpringApplication.run(JpaappApplication.class, args);
	  UserRepo userRepo= context.getBean(UserRepo.class);

	  /* add
		User u1=new User();
		u1.setName("TISHA");
		u1.setCity("SUDANI");
		u1.setStatus("I AM TISHA....");

		User user1=userRepo.save(u1);
		System.out.println(user1);

		User u2=new User();
		u2.setName("tinnuu");
		u2.setCity("ahem");
		u2.setStatus("hello frieds...");


		//multiple object
		List<User> list= java.util.List.of(u1,u2);

		userRepo.saveAll(list);

		System.out.println(list);

	   */

		//update
		/*
		try
		{
			Optional<User> optional=userRepo.findById(2);
			User user= optional.get();
			user.setName("tttttt");
			userRepo.save(user);
			System.out.println(user);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		*/

		//delete

		userRepo.deleteById(3);
		System.out.println("deleted.");

		//get all data

		Iterable<User> op=userRepo.findAll();
		op.forEach(System.out::println);

	}

}
