package by.epam.javatraining.yanushkevich.maintask.model.logic;

public class WorkWithVector {

	public static double findMax(double[] vector) {
		double max = vector[0];
		for (double d : vector) {
			if (d > max) {
				max = d;
			}
		}
		return max;
	}

	public static double findMin(double[] vector) {
		double min = vector[0];
		for (double d : vector) {
			if (d < min) {
				min = d;
			}
		}
		return min;
	}

	public static double findAverage(double[] vector) {
		double average = 0.0;
		for (double d : vector) {
			average += d;
		}
		return average / vector.length;
	}

	public static double findGeometricMean(double[] vector) {
		double geometricMean = 1.0;
		for (double d : vector) {
			geometricMean *= d;
		}
		if (geometricMean < 0) {
			return -1.0;
		} else {
			return Math.pow(geometricMean, (1.0 / vector.length));
		}
	}

	public static boolean checkDecreasingOrder(double[] vector) {
		boolean check = true;
		for (int i = 0; i < vector.length - 1; i++) {
			if (vector[i] < vector[i + 1]) {
				check = false;
				break;
			}
		}
		return check;
	}

	public static boolean checkIncreasingOrder(double[] vector) {
		boolean check = true;
		for (int i = 0; i < vector.length - 1; i++) {
			if (vector[i] > vector[i + 1]) {
				check = false;
				break;
			}
		}
		return check;
	}

	public static double[] reverse(double[] vector) {
		double temp;
		for (int i = 0; i < vector.length / 2; i++) {
			temp = vector[i];
			vector[i] = vector[vector.length - i - 1];
			vector[vector.length - i - 1] = temp;
		}
		return vector;
	}

	public static int localMin(double[] vector) {
		int result = -1;
		int position = 0;
		if (vector.length == 1) {

		} else if (vector[position] < vector[position + 1]) {
			result = position;
		} else {
			for (int i = 1; i < vector.length - 1; i++) {
				if (vector[i] < vector[i - 1] && vector[i] < vector[i + 1]) {
					result = i;
				}
			}
		}
		return result;
	}

	public static int localMax(double[] vector) {
		int result = -1;
		int position = 0;
		if (vector.length == 1) {

		} else if (vector[position] > vector[position + 1]) {
			result = position;
		} else {
			for (int i = 1; i < vector.length - 1; i++) {
				if (vector[i] > vector[i - 1] && vector[i] > vector[i + 1]) {
					result = i;
				}
			}
		}
		return result;
	}

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

	public static double[] increasingBubleSort(double[] vector) {

		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < vector.length - 1; i++) {
				if (vector[i] > vector[i + 1]) {
					isSorted = false;
					double temp = vector[i];
					vector[i] = vector[i + 1];
					vector[i + 1] = temp;
				}
			}
		}

		return vector;
	}

	public static double[] decreasingBubleSort(double[] vector) {
		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < vector.length - 1; i++) {
				if (vector[i] < vector[i + 1]) {
					isSorted = false;
					double temp = vector[i];
					vector[i] = vector[i + 1];
					vector[i + 1] = temp;
				}
			}
		}
		return vector;
	}

	public static double[] decreasingChoiceSort(double[] vector) {
		for (int i = 0; i < vector.length - 1; i++) {
			int max = i;
			for (int j = i; j < vector.length; j++) {
				if (vector[max] < vector[j]) {
					max = j;
				}
			}
			double temp = vector[i];
			vector[i] = vector[max];
			vector[max] = temp;

		}

		return vector;
	}

	public static double[] increasingChoiceSort(double[] vector) {
		for (int i = 0; i < vector.length - 1; i++) {
			int min = i;
			for (int j = i; j < vector.length; j++) {
				if (vector[min] > vector[j]) {
					min = j;
				}
			}
			double temp = vector[i];
			vector[i] = vector[min];
			vector[min] = temp;

		}

		return vector;
	}

	public static double[] increasingEnteringSort(double[] vector) {
		for (int i = 1; i < vector.length; i++) {
			while (i > 0 && vector[i] < vector[i - 1]) {
				double temp = vector[i - 1];
				vector[i - 1] = vector[i];
				vector[i] = temp;
				i--;
			}
		}
		return vector;
	}

	public static double[] decreasingEnteringSort(double[] vector) {
		for (int i = 1; i < vector.length; i++) {
			while (i > 0 && vector[i] > vector[i - 1]) {
				double temp = vector[i - 1];
				vector[i - 1] = vector[i];
				vector[i] = temp;
				i--;
			}
		}
		return vector;
	}

	public static double[] quickSort(double[] vector, int start, int end) {
		if (start >= end) {
			return vector;
		}
		int left = start;
		int right = end;

		int pivot = left - (left - right) / 2;

		while (left < right) {
			while ((left < pivot) && (vector[left] <= vector[pivot])) {
				left++;
			}
			while ((right > pivot) && (vector[right] >= vector[pivot])) {
				right--;
			}

			if (left < right) {
				double temp = vector[right];
				vector[right] = vector[left];
				vector[left] = temp;
				if (left == pivot) {
					pivot = right;
				} else if (right == pivot) {
					pivot = left;
				}
			}
		}

		quickSort(vector, start, pivot);
		quickSort(vector, pivot + 1, end);

		return vector;
	}
}
