package by.epam.javatraining.yanushkevich.maintask.model.logic;

import by.epam.javatraining.yanushkevich.maintask.model.data.Vector;

public class Sorting {
	public static Vector increasingBubleSort(Vector vector) {

		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < vector.length() - 1; i++) {
				if (vector.getElement(i) > vector.getElement(i+1)) {
					isSorted = false;
					double temp = vector.getElement(i);
					vector.setElement(i,vector.getElement(i+1));
					vector.setElement(i+1, temp);
				}
			}
		}

		return vector;
	}

	public static Vector decreasingBubleSort(Vector vector) {
		boolean isSorted = false;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < vector.length() - 1; i++) {
				if (vector.getElement(i) < vector.getElement(i+1)) {
					isSorted = false;
					double temp = vector.getElement(i);
					vector.setElement(i,vector.getElement(i+1));
					vector.setElement(i+1, temp);
				}
			}
		}
		return vector;
	}

	public static Vector decreasingChoiceSort(Vector vector) {
		for (int i = 0; i < vector.length() - 1; i++) {
			int max = i;
			for (int j = i; j < vector.length(); j++) {
				if (vector.getElement(max) < vector.getElement(j)) {
					max = j;
				}
			}
			double temp = vector.getElement(i);
			vector.setElement(i,vector.getElement(max));
			vector.setElement(max, temp);

		}

		return vector;
	}

	public static Vector increasingChoiceSort(Vector vector) {
		for (int i = 0; i < vector.length() - 1; i++) {
			int min = i;
			for (int j = i; j < vector.length(); j++) {
				if (vector.getElement(min) > vector.getElement(j)) {
					min = j;
				}
			}
			double temp = vector.getElement(i);
			vector.setElement(i,vector.getElement(min));
			vector.setElement(min, temp);

		}

		return vector;
	}

	public static Vector increasingEnteringSort(Vector vector) {
		for (int i = 1; i < vector.length(); i++) {
			while (i > 0 && vector.getElement(i) < vector.getElement(i-1)) {
				double temp = vector.getElement(i-1);
				vector.setElement(i-1, vector.getElement(i));
				vector.setElement(i, temp);
				i--;
			}
		}
		return vector;
	}

	public static Vector decreasingEnteringSort(Vector vector) {
		for (int i = 1; i < vector.length(); i++) {
			while (i > 0 && vector.getElement(i) > vector.getElement(i-1)) {
				double temp = vector.getElement(i-1);
				vector.setElement(i-1, vector.getElement(i));
				vector.setElement(i, temp);
				i--;
			}
		}
		return vector;
	}

	public static Vector quickSort(Vector vector, int start, int end) {
		if (start >= end) {
			return vector;
		}
		int left = start;
		int right = end;

		int pivot = left - (left - right) / 2;

		while (left < right) {
			while ((left < pivot) && (vector.getElement(left) <= vector.getElement(pivot))) {
				left++;
			}
			while ((right > pivot) && (vector.getElement(right) >= vector.getElement(pivot))) {
				right--;
			}

			if (left < right) {
				double temp = vector.getElement(right);
				vector.setElement(right, vector.getElement(left));
				vector.setElement(left, temp);
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
