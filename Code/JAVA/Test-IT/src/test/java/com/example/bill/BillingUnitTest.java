package com.example.bill;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.pm.PriceMatrix;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BillingUnitTest {

	Billing billing;
	PriceMatrix priceMatrixMock;

	@BeforeEach
	public void setup() {
//		billing = new BillingImpl(new StubPriceMatrix()); //
		priceMatrixMock = mock(PriceMatrix.class);
		billing=new BillingImpl(priceMatrixMock);
	}

	@Test
	public void getTotalPrice() {
		List<String> cart = Arrays.asList("123", "456");

		when(priceMatrixMock.getPrice("123")).thenReturn(100.00);
		when(priceMatrixMock.getPrice("456")).thenReturn(200.00);

		double actual = billing.getTotalPrice(cart);

		assertEquals(300.00, actual);
	}

}
