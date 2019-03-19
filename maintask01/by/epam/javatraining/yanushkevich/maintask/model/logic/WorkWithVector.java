package by.epam.javatraining.yanushkevich.maintask.model.logic;

import java.util.Random;

import by.epam.javatraining.yanushkevich.maintask.model.data.Vector;

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

	public static Vector fillVectorRandomNumber(Vector vector) {
		Random random = new Random();
		for (int i = 0; i < vector.length(); i++) {
			vector.setElement(i, random.nextDouble() * 50);
		}
		return vector;
	}

}
