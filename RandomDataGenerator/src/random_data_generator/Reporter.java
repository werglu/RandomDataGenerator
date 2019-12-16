package random_data_generator;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.util.Pair;

public class Reporter {
	private static String directoryName = "test" + System.nanoTime();
	private static List<Pair<Integer, String>> inputs = Arrays.asList(
			new Pair<>(1, directoryName + "/test1.xls"),
			new Pair<>(10, directoryName + "/test10.xls"),
			new Pair<>(100, directoryName + "/test100.xls"),
			new Pair<>(1000, directoryName + "/test1000.xls"),
			new Pair<>(10000, directoryName + "/test10000.xls"));

	public static void main(String[] args) {
		Generator generator = new Generator();
		new File(directoryName).mkdir();
		for (Pair<Integer, String> input : inputs) {
			long start = System.nanoTime();
			generator.doWork(input.getKey(), input.getValue());
			long finish = System.nanoTime();
			System.out.println("For number: " + input.getKey() + " time elapsed: " + (finish - start) + "ns");
		}
	}

}
