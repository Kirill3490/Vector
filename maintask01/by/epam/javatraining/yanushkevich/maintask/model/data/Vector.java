package by.epam.javatraining.yanushkevich.maintask.model.data;

import java.util.Arrays;

public class Vector {
	private double[] vector;

	public Vector() {
		this.vector = new double[20];
	}

	public Vector(int size) {
		this.vector = new double[size];
	}

	public Vector(double[] vector) {
		this.vector = vector;
	}

	public double[] getVector() {
		return vector;
	}

	public void setVector(double[] vector) {
		this.vector = vector;
	}

	public double getElement(int index) {
		return vector[index];
	}

	public int length() {
		return vector.length;
	}

	public void setElement(int index, double element) {
		vector[index] = element;
	}

	public static double getVectorElement(double[] vector, int index) {
		return vector[index];
	}

	public static Vector changeVectorElement(Vector vector, int elementIndex, double element) {
		vector.setElement(elementIndex - 1, element);
		return vector;
	}

	@Override
	public String toString() {
		return "Vector " + Arrays.toString(vector);
	}
}
