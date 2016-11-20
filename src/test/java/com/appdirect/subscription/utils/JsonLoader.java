package com.appdirect.subscription.utils;

import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;

public class JsonLoader {

	public static Object load(String fileName) {

		Object result = "";

		ClassLoader classLoader = JsonLoader.class.getClassLoader();
		try {
			result = IOUtils.toString(
					classLoader.getResourceAsStream(fileName),
					Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(result);
		return result;

	}

}
