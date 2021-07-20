package com.example.pm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.example.exception.ItemNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

/*
 * 
 * 
 *  Testing  = AAA
 *  
 *  A ==> Arrange
 *  A ==> Act
 *  A ==> Assert	
 * 
 * 
 * 
 */

public class PriceMatrixTest {

	PriceMatrix priceMatrix;

	@BeforeEach
	public void setup() {
		priceMatrix = new PriceMatrixImpl_v1(); // Arrange
	}

	@ParameterizedTest
//	@CsvSource({ "123,100.00", "456,200.00", "789,300.00" })
	@CsvFileSource(files = "src/test/resources/sample-price-matrix.csv", numLinesToSkip = 1)
	public void getPriceForItemCode1(String itemCode, double expectedPrice) {
		double price = priceMatrix.getPrice(itemCode); // Act
		assertEquals(expectedPrice, price); // Assert
	}

	@Test
	public void shouldThrowExceptionForItemNotExist() {
		// Assert
		assertThrows(ItemNotFoundException.class, () -> {
			priceMatrix.getPrice("111");// Act
		});
	}
	

}
