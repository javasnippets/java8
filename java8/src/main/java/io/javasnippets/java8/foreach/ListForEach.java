package io.javasnippets.java8.foreach;

import java.util.ArrayList;
import java.util.List;

/**
 * https://javasnippets.io
 * 
 * @author Umashankar 
 * <p>Example to iterate list through forEarch</p>
 */
public class ListForEach {

	public static void main(String[] args) {

		List<String> authors = getAuthors();
		/**
		 * Performs an action for each element of this stream. This is a
		 * terminal operation.
		 * 
		 * The behavior of this operation is explicitly nondeterministic. For
		 * parallel stream pipelines, this operation does not guarantee to
		 * respect the encounter order of the stream, as doing so would
		 * sacrifice the benefit of parallelism. For any given element, the
		 * action may be performed at whatever time and in whatever thread the
		 * library chooses. If the action accesses shared state, it is
		 * responsible for providing the required synchronization.
		 * 
		 */
		authors.stream().forEach(a -> {
			System.out.println(a);
		});
		/**
		 * Performs the given action for each element of the Iterable until all
		 * elements have been processed or the action throws an exception.
		 * Unless otherwise specified by the implementing class, actions are
		 * performed in the order of iteration (if an iteration order is
		 * specified). Exceptions thrown by the action are relayed to the
		 * caller.
		 */
		authors.forEach(a -> {
			System.out.println(a);
		});
		/**
		 * Performs an action for each element of this stream, in the encounter
		 * order of the stream if the stream has a defined encounter order. This
		 * is a terminal operation.
		 * 
		 * This operation processes the elements one at a time, in encounter
		 * order if one exists. Performing the action for one element
		 * happens-before performing the action for subsequent elements, but for
		 * any given element, the action may be performed in whatever thread the
		 * library chooses.
		 * 
		 */
		authors.stream().forEachOrdered(a -> {
			System.out.println(a);
		});
	}

	/**
	 * 
	 * @return
	 */
	public static List<String> getAuthors() {
		List<String> authors = new ArrayList<>();
		authors.add("Umashankar");
		authors.add("Rod Jhonson");
		authors.add("Gavin King");
		return authors;
	}
}
