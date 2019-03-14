package by.epam.javatraining.yanushkevich.maintask.controler;

import java.util.Arrays;

import by.epam.javatraining.yanushkevich.maintask.model.data.Vector;
import by.epam.javatraining.yanushkevich.maintask.model.logic.WorkWithVector;
import by.epam.javatraining.yanushkevich.maintask.view.View;

public class Main {

	public static void main(String[] args) {
		double[] array = new double[40];
		Vector.fillVectorRandomNumber(array, 20, 50);
		View.print(array);
		System.out.println(WorkWithVector.binarySearch(array, 11.5));
		double[] array2 = { 15.0, 3.8, 51.4, 14.5, 17.0 };
		double[] array3 = { 2.3, 5.7, 12.5, 1.3, 4.9 };
		WorkWithVector.findGeometricMean(array3);
		System.out.println(Arrays.toString(WorkWithVector.quickSort(array2, 0, array2.length - 1)));
		System.out.println(Arrays.toString(array2));

	}

}
