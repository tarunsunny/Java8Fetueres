package com.marlabs.Jva8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	private static List<String> asList;

	public static void main(String[] args) {
		List<String> names = Arrays.asList("kumar", "tarun", "chinta");
		Stream<String> stroams = names.stream();
		Stream<String> longNames = stroams.filter(str -> str.length() > 2);

		longNames.forEach(str -> System.out.print(str + ""));
	}

}
