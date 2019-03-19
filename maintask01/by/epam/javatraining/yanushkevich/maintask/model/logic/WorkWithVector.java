package by.epam.javatraining.yanushkevich.maintask.model.logic;

import java.util.Random;

import by.epam.javatraining.yanushkevich.maintask.model.data.Vector;

public class WorkWithVector {

	public static double findMax(Vector vector) {
		double max = vector.getElement(0);
		for (int i = 0; i < vector.length(); i++) {
			if (vector.getElement(i) > max) {
				max = vector.getElement(i);
			}
		}
		return max;
	}

	public static double findMin(Vector vector) {
		double min = vector.getElement(0);
		for (int i = 0; i < vector.length(); i++) {
			if (vector.getElement(i) < min) {
				min = vector.getElement(i);
			}
		}
		return min;
	}

	public static double findAverage(Vector vector) {
		double average = 0.0;
		for (int i = 0; i < vector.length(); i++) {
			average += vector.getElement(i);
		}
		return average / vector.length();
	}

	public static double findGeometricMean(Vector vector) {
		double geometricMean = 1.0;
		for (int i = 0; i < vector.length(); i++) {
			geometricMean *= vector.getElement(i);
		}
		if (geometricMean <= 0) {
			return -1.0;
		} else {
			return Math.pow(geometricMean, (1.0 / vector.length()));
		}
	}

	public static boolean checkDecreasingOrder(Vector vector) {
		boolean check = true;
		for (int i = 0; i < vector.length() - 1; i++) {
			if (vector.getElement(i) < vector.getElement(i + 1)) {
				check = false;
				break;
			}
		}
		return check;
	}

	public static boolean checkIncreasingOrder(Vector vector) {
		boolean check = true;
		for (int i = 0; i < vector.length() - 1; i++) {
			if (vector.getElement(i) > vector.getElement(i + 1)) {
				check = false;
				break;
			}
		}
		return check;
	}

	public static Vector reverse(Vector vector) {
		double temp;
		for (int i = 0; i < vector.length() / 2; i++) {
			temp = vector.getElement(i);
			vector.setElement(i, vector.getElement(vector.length() - i - 1));
			vector.setElement(vector.length() - i - 1, temp);
		}
		return vector;
	}

	public static int localMin(Vector vector) {
		int result = -1;
		int position = 0;
		if (vector.length() == 1) {

		} else if (vector.getElement(position) < vector.getElement(position + 1)) {
			result = position;
		} else {
			for (int i = 1; i < vector.length() - 1; i++) {
				if (vector.getElement(i) < vector.getElement(i - 1)
						&& vector.getElement(i) < vector.getElement(i + 1)) {
					result = i;
				}
			}
		}
		return result;
	}

	public static int localMax(Vector vector) {
		int result = -1;
		int position = 0;
		if (vector.length() == 1) {

		} else if (vector.getElement(position) > vector.getElement(position + 1)) {
			result = position;
		} else {
			for (int i = 1; i < vector.length() - 1; i++) {
				if (vector.getElement(i) > vector.getElement(i - 1)
						&& vector.getElement(i) > vector.getElement(i + 1)) {
					result = i;
				}
			}
		}
		return result;
	}

	public static Vector fillVectorRandomNumber(Vector vector) {
		Random random = new Random();
		for (int i = 0; i < vector.length(); i++) {
			vector.setElement(i, random.nextDouble() * 50);
		}
		return vector;
	}

}
