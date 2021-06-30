package com.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Me
public class MyJunit {

	public static void runTestCases() {

		// dynamic class loading
		try {

			Class<?> clazz = Class.forName("com.example.TestCase");
			Object testCaseInstance = clazz.newInstance(); // TestCase instance=new TestCase()

			Method[] methods = clazz.getMethods();
			for (Method method : methods) {
				Test testAnno = method.getAnnotation(Test.class);
				if (testAnno != null) {
					boolean ignore = testAnno.ignore();
					if (!ignore)
						method.invoke(testCaseInstance, new Object[] {});
				}
			}

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		runTestCases();
	}

}
