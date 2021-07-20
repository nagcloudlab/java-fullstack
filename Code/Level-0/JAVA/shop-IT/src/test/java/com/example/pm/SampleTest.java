package com.example.pm;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SampleTest {

	@Test
	void tm() {
		List<String> menu = Arrays.asList("eb", "mb");
		assertThat(menu, hasItem("cb"));
	}

}
