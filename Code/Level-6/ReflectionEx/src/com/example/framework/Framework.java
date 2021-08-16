package com.example.framework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Framework {

	public void handleRequest(String url) {

		// url = "/api/xxx

		try {

			Class<?> clazz = Class.forName("com.example.web.MyController");
			Object bean = clazz.newInstance();

			Method[] methods = clazz.getMethods();
			for (Method method : methods) {
				RequestMapping rm = method.getAnnotation(RequestMapping.class);
				if (rm != null) {
					if (rm.value().equals(url) && rm.method().equals(RequestMethod.GET)) {
						method.invoke(bean, new Object[] {});						
					}
				}
			}

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
