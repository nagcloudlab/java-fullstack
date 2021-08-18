package com.example;

import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends PagingAndSortingRepository<Food, Integer>{

	//@Query("from Food where price=:price")
	@Query("{'price':?0}")
	List<Food> findByMoney(double price);
	
	List<Food> findByPriceGreaterThan(double price);
	
	List<Food> findByPriceBetween(double price1,double price2);
	
	List<Food> findByTypeIn(List<FoodType> types);
	
	
}
