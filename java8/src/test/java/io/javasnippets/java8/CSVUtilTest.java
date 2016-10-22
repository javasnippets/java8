package io.javasnippets.java8;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * https://javasnippets.io
 * 
 * @author Umashankar
 *
 *
 */
public class CSVUtilTest {

	@Test
	public void toCsv_csvFromListOfString() {
		List<String> securities = Arrays.asList("Stock", "Future", "Option", "Forex", "ETF");

		String expected = "Stock,Future,Option,Forex,ETF";

		assertEquals(expected, CSVUtil.toCsv(securities));
	}

	@Test
	public void toCsvStream_csvFromListOfString() {
		List<String> securities = Arrays.asList("Stock", "Future", "Option", "Forex", "ETF");

		String expected = "Stock,Future,Option,Forex,ETF";

		assertEquals(expected, CSVUtil.toCsvStream(securities));
	}
}
