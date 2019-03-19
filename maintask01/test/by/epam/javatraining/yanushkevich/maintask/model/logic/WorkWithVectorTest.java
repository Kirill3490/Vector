package test.by.epam.javatraining.yanushkevich.maintask.model.logic;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import by.epam.javatraining.yanushkevich.maintask.model.data.Vector;
import by.epam.javatraining.yanushkevich.maintask.model.logic.Search;
import by.epam.javatraining.yanushkevich.maintask.model.logic.Sorting;
import by.epam.javatraining.yanushkevich.maintask.model.logic.WorkWithVector;

public class WorkWithVectorTest {

	double delta = 0.01;
	double[] firstArray = { 2.3, 5.7, 12.5, 1.3, 4.9 };
	double[] secondArray = { 2.3, 5.7, 12.5, 7.0, 4.9 };

	@Test
	public void findMin() {
		Vector vector = new Vector(firstArray);
		double expected = 1.3;
		assertEquals(expected, WorkWithVector.findMin(vector), delta);
	}

	@Test
	public void findMax() {
		Vector vector = new Vector(firstArray);
		double expected = 12.5;
		assertEquals(expected, WorkWithVector.findMax(vector), delta);
	}

	@Test
	public void findAverage() {
		Vector vector = new Vector(firstArray);
		double expected = 5.34;
		assertEquals(expected, WorkWithVector.findAverage(vector), delta);
	}

	@Test
	public void findGeometricMean() {
		Vector vector = new Vector(firstArray);
		double expected = 4.01;
		assertEquals(expected, WorkWithVector.findGeometricMean(vector), delta);
	}

	@Test
	public void findGeometricMeanNegative() {
		double[] array = { 2.3, 5.7, 12.5, -2.0, 4.9 };
		Vector vector = new Vector(array);
		double expected = -1.0;
		assertEquals(expected, WorkWithVector.findGeometricMean(vector), delta);
	}

	@Test
	public void checkIncreasingOrder() {
		double[] array = { 2.3, 5.7, 9.4, 13.0, 25 };
		Vector vector = new Vector(array);
		boolean expected = true;
		assertEquals(expected, WorkWithVector.checkIncreasingOrder(vector));
	}

	@Test
	public void checkIncreasingOrderFail() {
		double[] array = { 2.3, 1.7, 9.4, 13.0, 25 };
		Vector vector = new Vector(array);
		boolean expected = false;
		assertEquals(expected, WorkWithVector.checkIncreasingOrder(vector));
	}

	@Test
	public void checkDecreasingOrder() {
		double[] array = { 12.43, 10.47, 8.3, 6.3, 4.9 };
		Vector vector = new Vector(array);
		boolean expected = true;
		assertEquals(expected, WorkWithVector.checkDecreasingOrder(vector));
	}

	@Test
	public void checkDecreasingOrderFail() {
		double[] array = { 12.43, 10.47, 8.3, 5.3, 5.9 };
		Vector vector = new Vector(array);
		boolean expected = false;
		assertEquals(expected, WorkWithVector.checkDecreasingOrder(vector));
	}

	@Test
	public void reverse() {
		Vector vector = new Vector(secondArray);
		WorkWithVector.reverse(vector);
		double[] expected = { 4.9, 7.0, 12.5, 5.7, 2.3 };
		assertArrayEquals(expected, vector.getVector(), delta);
	}

	@Test
	public void localMin() {
		Vector vector = new Vector(secondArray);
		int expected = 0;
		assertEquals(expected, WorkWithVector.localMin(vector));
	}

	@Test
	public void localMax() {
		Vector vector = new Vector(secondArray);
		int expected = 2;
		assertEquals(expected, WorkWithVector.localMax(vector));
	}

	@Test
	public void linearSearch() {
		double searchingElement = 1.3;
		Vector vector = new Vector(firstArray);
		int expected = 3;
		assertEquals(expected, Search.linearSearch(vector, searchingElement));
	}

	@Test
	public void binarySearch() {
		double[] array = { 2.3, 4.9, 5.7, 7.0, 12.5 };
		Vector vector = new Vector(array);
		double searchingElement = 7.0;
		int expected = 3;
		assertEquals(expected, Search.binarySearch(vector, searchingElement));
	}

	@Test
	public void increasingBubleSort() {
		Vector vector = new Vector(secondArray);
		Sorting.increasingBubleSort(vector);
		double[] expected = { 2.3, 4.9, 5.7, 7.0, 12.5 };
		assertArrayEquals(expected, vector.getVector(), delta);
	}

	@Test
	public void decreasingBubleSort() {
		Vector vector = new Vector(secondArray);
		Sorting.decreasingBubleSort(vector);
		double[] expected = { 12.5, 7.0, 5.7, 4.9, 2.3 };
		assertArrayEquals(expected, vector.getVector(), delta);
	}

	@Test
	public void increasingChoiceSort() {
		Vector vector = new Vector(secondArray);
		Sorting.increasingChoiceSort(vector);
		double[] expected = { 2.3, 4.9, 5.7, 7.0, 12.5 };
		assertArrayEquals(expected, vector.getVector(), delta);
	}

	@Test
	public void decreasingChoiceSort() {
		Vector vector = new Vector(secondArray);
		Sorting.decreasingChoiceSort(vector);
		double[] expected = { 12.5, 7.0, 5.7, 4.9, 2.3 };
		assertArrayEquals(expected, vector.getVector(), delta);
	}

	@Test
	public void increasingEnteringSort() {
		Vector vector = new Vector(secondArray);
		Sorting.increasingEnteringSort(vector);
		double[] expected = { 2.3, 4.9, 5.7, 7.0, 12.5 };
		assertArrayEquals(expected, vector.getVector(), delta);
	}

	@Test
	public void decreasingEnteringSort() {
		Vector vector = new Vector(secondArray);
		Sorting.decreasingEnteringSort(vector);
		double[] expected = { 12.5, 7.0, 5.7, 4.9, 2.3 };
		assertArrayEquals(expected, vector.getVector(), delta);
	}

	@Test
	public void quickSort() {
		Vector vector = new Vector(secondArray);
		Sorting.quickSort(vector, 0, vector.length()-1);
		double[] expected = { 2.3, 4.9, 5.7, 7.0, 12.5 };
		assertArrayEquals(expected, vector.getVector(), delta);
	}
}
