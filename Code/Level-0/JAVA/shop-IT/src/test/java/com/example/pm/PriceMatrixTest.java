package com.example.pm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

	@Test
	public void getPriceForItemCode() {
		double price = priceMatrix.getPrice("456"); // Act
		assertEquals(200.00, price); // Assert
	}

	@Test
	public void shouldThrowExceptionForItemNotExist() {
		// Assert
		assertThrows(ItemNotFoundException.class, () -> {
			priceMatrix.getPrice("111");// Act
		});
	}

}
