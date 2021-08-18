package com.example;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
@ExtendWith(SpringExtension.class)
public class FoodRepositoryIntegrationTest {

	@Autowired
	MongoTemplate mongoTemplate;
	@Autowired
	FoodRepository foodRepository;

	@BeforeEach
	public void beforeEach() {
		Food food1 = new Food(1, "food-1", 100.00, new Date(2021, 7, 18), new Date(2021, 7, 19), FoodType.VEG,
				List.of("south", "ap"));
		Food food2 = new Food(2, "food-2", 300.00, new Date(2021, 7, 18), new Date(2021, 7, 25), FoodType.VEG,
				List.of("south", "tn"));
		Food food3 = new Food(3, "food-3", 400.00, new Date(2021, 7, 16), new Date(2021, 7, 19), FoodType.NON_VEG,
				List.of("north", "pune"));
		Food food4 = new Food(4, "food-3", 400.00, new Date(2021, 7, 12), new Date(2021, 7, 20), FoodType.NON_VEG,
				List.of("north-east", "bengal"));
		foodRepository.saveAll(List.of(food1, food2, food3, food4));
	}

	@Test
	public void findVegFood() {
		int actual = foodRepository.findByTypeIn(List.of(FoodType.VEG)).size();
		assertEquals(2, actual);
	}
	
	@Test
	public void findVegAndNonVegFood() {
		int actual = foodRepository.findByTypeIn(List.of(FoodType.VEG,FoodType.NON_VEG)).size();
		assertEquals(4, actual);
	}

	@AfterEach
	public void afterEach() {
		this.mongoTemplate.dropCollection(Food.class);
	}

}
