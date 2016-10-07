package br.com.senai.util;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public final class MessageUtil {

	private static final String BUNDLE_NAME = "message";
	private static final ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_NAME);

	private MessageUtil() {
	}

	public static String getMessage(String key) {
		try {
			return bundle.getString(key);
		} catch (MissingResourceException e) {
			e.printStackTrace();
		}
		return key;
	}
}