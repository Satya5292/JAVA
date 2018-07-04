package test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<String> testList = new ArrayList<>();
		testList.add("Hello");
		testList.add("Satya");
		testList.add("Testing");
		testList.add(0, "Play");
		System.out.println(testList.toString());
	}

}
