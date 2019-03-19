package test.by.epam.javatraining.yanushkevich.maintask.model.logic;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import by.epam.javatraining.yanushkevich.maintask.model.data.Vector;
import by.epam.javatraining.yanushkevich.maintask.model.logic.Search;
import by.epam.javatraining.yanushkevich.maintask.model.logic.Sorting;
import by.epam.javatraining.yanushkevich.maintask.model.logic.WorkWithVector;

public class WorkWithVectorTest {

	double delta = 0.01;

	@Test
	public void findMin() {
		double[] array = { 2.3, 5.7, 12.5, 1.3, 4.9 };
		double expected = 1.3;
		assertEquals(expected, WorkWithVector.findMin(array), delta);
	}

	@Test
	public void findMax() {
		double[] array = { 2.3, 5.7, 12.5, 1.3, 4.9 };
		double expected = 12.5;
		assertEquals(expected, WorkWithVector.findMax(array), delta);
	}

	@Test
	public void findAverage() {
		double[] array = { 2.3, 5.7, 12.5, 1.3, 4.9 };
		double expected = 5.34;
		assertEquals(expected, WorkWithVector.findAverage(array), delta);
	}

	@Test
	public void findGeometricMean() {
		double[] array = { 2.3, 5.7, 12.5, 1.3, 4.9 };
		double expected = 4.01;
		assertEquals(expected, WorkWithVector.findGeometricMean(array), delta);
	}

	@Test
	public void findGeometricMeanNegative() {
		double[] array = { 2.3, 5.7, 12.5, -2.0, 4.9 };
		double expected = -1.0;
		assertEquals(expected, WorkWithVector.findGeometricMean(array), delta);
	}

	@Test
	public void checkIncreasingOrder() {
		double[] array = { 2.3, 5.7, 9.4, 13.0, 25 };
		boolean expected = true;
		assertEquals(expected, WorkWithVector.checkIncreasingOrder(array));
	}

	@Test
	public void checkIncreasingOrderFail() {
		double[] array = { 2.3, 1.7, 9.4, 13.0, 25 };
		boolean expected = false;
		assertEquals(expected, WorkWithVector.checkIncreasingOrder(array));
	}

	@Test
	public void checkDecreasingOrder() {
		double[] array = { 12.43, 10.47, 8.3, 6.3, 4.9 };
		boolean expected = true;
		assertEquals(expected, WorkWithVector.checkDecreasingOrder(array));
	}

	@Test
	public void checkDecreasingOrderFail() {
		double[] array = { 12.43, 10.47, 8.3, 5.3, 5.9 };
		boolean expected = false;
		assertEquals(expected, WorkWithVector.checkDecreasingOrder(array));
	}

	@Test
	public void reverse() {
		double[] array = { 2.3, 5.7, 12.5, 7.0, 4.9 };
		double[] expected = { 4.9, 7.0, 12.5, 5.7, 2.3 };
		assertArrayEquals(expected, WorkWithVector.reverse(array), delta);
	}

	@Test
	public void localMin() {
		double[] array = { 2.3, 5.7, 12.5, 7.0, 4.9 };
		int expected = 0;
		assertEquals(expected, WorkWithVector.localMin(array));
	}

	@Test
	public void localMax() {
		double[] array = { 2.3, 5.7, 12.5, 7.0, 4.9 };
		int expected = 2;
		assertEquals(expected, WorkWithVector.localMax(array));
	}

	@Test
	public void linearSearch() {
		double[] array = { 2.3, 5.7, 12.5, 1.3, 4.9 };
		double searchingElement = 1.3;
		int expected = 3;
		assertEquals(expected, Search.linearSearch(array, searchingElement));
	}

	@Test
	public void binarySearch() {
		double[] array = { 2.3, 4.9, 5.7, 7.0, 12.5 };
		double searchingElement = 7.0;
		int expected = 3;
		assertEquals(expected, Search.binarySearch(array, searchingElement));
	}

	@Test
	public void increasingBubleSort() {
		double[] array = { 2.3, 5.7, 12.5, 7.0, 4.9 };
		Vector vector = new Vector(array);
		Sorting.increasingBubleSort(vector);
		double[] expected = { 2.3, 4.9, 5.7, 7.0, 12.5 };
		assertArrayEquals(expected, vector.getVector(), delta);
	}

	@Test
	public void decreasingBubleSort() {
		double[] array = { 2.3, 5.7, 12.5, 7.0, 4.9 };
		Vector vector = new Vector(array);
		Sorting.decreasingBubleSort(vector);
		double[] expected = { 12.5, 7.0, 5.7, 4.9, 2.3 };
		assertArrayEquals(expected, vector.getVector(), delta);
	}

	@Test
	public void increasingChoiceSort() {
		double[] array = { 2.3, 5.7, 12.5, 7.0, 4.9 };
		Vector vector = new Vector(array);
		Sorting.increasingChoiceSort(vector);
		double[] expected = { 2.3, 4.9, 5.7, 7.0, 12.5 };
		assertArrayEquals(expected, vector.getVector(), delta);
	}

	@Test
	public void decreasingChoiceSort() {
		double[] array = { 2.3, 5.7, 12.5, 7.0, 4.9 };
		Vector vector = new Vector(array);
		Sorting.decreasingChoiceSort(vector);
		double[] expected = { 12.5, 7.0, 5.7, 4.9, 2.3 };
		assertArrayEquals(expected, vector.getVector(), delta);
	}

	@Test
	public void increasingEnteringSort() {
		double[] array = { 2.3, 5.7, 12.5, 7.0, 4.9 };
		Vector vector = new Vector(array);
		Sorting.increasingEnteringSort(vector);
		double[] expected = { 2.3, 4.9, 5.7, 7.0, 12.5 };
		assertArrayEquals(expected, vector.getVector(), delta);
	}

	@Test
	public void decreasingEnteringSort() {
		double[] array = { 2.3, 5.7, 12.5, 7.0, 4.9 };
		Vector vector = new Vector(array);
		Sorting.decreasingEnteringSort(vector);
		double[] expected = { 12.5, 7.0, 5.7, 4.9, 2.3 };
		assertArrayEquals(expected, vector.getVector(), delta);
	}

	@Test
	public void quickSort() {
		double[] array = { 2.3, 5.7, 12.5, 7.0, 4.9 };
		Vector vector = new Vector(array);
		Sorting.quickSort(vector, 0, vector.length()-1);
		double[] expected = { 2.3, 4.9, 5.7, 7.0, 12.5 };
		assertArrayEquals(expected, vector.getVector(), delta);
	}
}
