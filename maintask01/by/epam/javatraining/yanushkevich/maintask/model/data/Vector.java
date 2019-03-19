package by.epam.javatraining.yanushkevich.maintask.model.data;

import java.util.Arrays;
import java.util.Random;

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
	
	public void fillRandomNumber(int start, int end) {
		Random random = new Random();
		for (int i = 0; i < vector.length; i++) {
			vector[i] = random.nextDouble() * (end-start) + start;
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Vector " + Arrays.toString(vector);
	}
	
	
	public static double getVectorElement(double[] vector, int index) {
		return vector[index];
	}
	
	public static double[] changeVectorElement(double[] vector, int elementIndex, double element) {
		vector[elementIndex-1] = element;
		return vector;
	}
	
	public static double[] addElements(double[] vector, double...array) {
		double[] newVector = new double[vector.length + array.length];
		System.arraycopy(vector, 0, newVector, 0, vector.length);
		System.arraycopy(array,0,newVector, vector.length-1, array.length);
		return vector;
	}
	
	public static double[] addElement(double[] vector, double element) {
		double[] newVector = new double[vector.length + 1];
		System.arraycopy(vector, 0, newVector, 0, vector.length);
		return newVector; 
	}
}
