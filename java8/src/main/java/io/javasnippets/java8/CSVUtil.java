package io.javasnippets.java8;

import java.util.List;
import static java.util.stream.Collectors.joining;

/**
 * https://javasnippets.io
 * 
 * @author Umashankar
 *
 */
public class CSVUtil {

	private static final String SEPARATOR = ",";

	/**
	 * 
	 * @param listToConvert
	 * @return
	 * 
	 */
	public static String toCsv(List<String> listToConvert) {
		return String.join(SEPARATOR, listToConvert);
	}

	/**
	 * 
	 * @param listToConvert
	 * @return
	 */
	public static String toCsvStream(List<String> listToConvert) {
		return listToConvert.stream().collect(joining(SEPARATOR));
	}
}
