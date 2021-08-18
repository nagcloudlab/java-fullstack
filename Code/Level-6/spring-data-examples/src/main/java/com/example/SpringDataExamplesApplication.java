package com.example;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@EnableJpaRepositories
@EnableMongoRepositories
@EnableTransactionManagement
public class SpringDataExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataExamplesApplication.class, args);
	}

	@Bean
//	@Transactional
	public CommandLineRunner cmd(FoodRepository foodRepository,MongoTemplate mongoTemplate) {
		return args -> {
//
//			Food food1=new Food(1,"food-1", 100.00, new Date(2021, 7, 18), new Date(2021, 7, 19), FoodType.VEG, List.of("south","ap"));
//			Food food2=new Food(2,"food-2", 300.00, new Date(2021, 7, 18), new Date(2021, 7, 25), FoodType.VEG, List.of("south","tn"));
//			Food food3=new Food(3,"food-3", 400.00, new Date(2021, 7, 16), new Date(2021, 7, 19), FoodType.NON_VEG, List.of("north","pune"));
//			Food food4=new Food(4,"food-3", 400.00, new Date(2021, 7, 12), new Date(2021, 7, 20), FoodType.NON_VEG, List.of("north-east","bengal"));
//			foodRepository.saveAll(List.of(food1,food2,food3,food4));

			// ----------------------------------------------------------------

//			foodRepository.findAll()
//			.forEach(food->{
//				System.out.println(food);
//			});

			// ----------------------------------------------------------------

//			Food ex = new Food();
//			ex.setId(1);
//			ex.setPrice(400.00);
//			ex.setType(FoodType.VEG);
//			Example<Food> example = Example.of(ex);
//
//			foodRepository.findAll(example).forEach(food -> {
//				System.out.println(food);
//			});

			// ----------------------------------------------------------------

//			Pageable pageable=PageRequest.of(0, 2);
//			foodRepository.findAll(pageable)
//			.forEach(System.out::println);

			// ----------------------------------------------------------------
			
//			
//			foodRepository.findByMoney(100)
//			.forEach(System.out::println);
			
			//----------------------------------------------------------------
			

			Query byPrice=Query
					.query(Criteria.where("price").is(100.00))
					.with(Sort.by(Sort.Direction.DESC, "price"));
			
			List<Food> foods= mongoTemplate.find(byPrice, Food.class);
			foods.forEach(System.out::println);
		};
	}

}
