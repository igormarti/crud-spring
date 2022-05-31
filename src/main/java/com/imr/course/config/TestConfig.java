package com.imr.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.imr.course.entities.Category;
import com.imr.course.entities.Order;
import com.imr.course.entities.User;
import com.imr.course.entities.enums.OrderStatus;
import com.imr.course.repositories.CategoryRepository;
import com.imr.course.repositories.OrderRepository;
import com.imr.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {

		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");

		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

		User u1 = new User(null, "Igor Martins", "igor@test.com", "999999999", "test123");
		User u2 = new User(null, "Juliana de Oliveira", "juliana@test.com", "8888888888", "test123");

		userRepository.saveAll(Arrays.asList(u1, u2));

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.indexOf(1), u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.indexOf(2), u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.indexOf(3), u1);

		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}

}
