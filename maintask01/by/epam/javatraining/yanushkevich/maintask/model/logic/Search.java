package by.epam.javatraining.yanushkevich.maintask.model.logic;

public class Search {
	public static int linearSearch(double[] vector, double searchingElement) {
		int result = -1;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == searchingElement) {
				result = i;
				break;
			}
		}
		return result;
	}

	public static int binarySearch(double[] vector, double searchingElement) {
		int result = -1;
		int start = 0;
		int end = vector.length - 1;

		while (start < end) {
			int midle = (start + end) / 2;
			if (vector[midle] == searchingElement) {
				result = midle;
				break;
			} else if (searchingElement < midle) {
				end = midle - 1;
			} else {
				start = midle + 1;
			}
		}

		return result;
	}
}
