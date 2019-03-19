package by.epam.javatraining.yanushkevich.maintask.controler;

import by.epam.javatraining.yanushkevich.maintask.model.data.Vector;
import by.epam.javatraining.yanushkevich.maintask.model.logic.Sorting;
import by.epam.javatraining.yanushkevich.maintask.model.logic.WorkWithVector;
import by.epam.javatraining.yanushkevich.maintask.view.View;

public class Main {

	public static void main(String[] args) {
		Vector vector = new Vector(15);
		WorkWithVector.fillVectorRandomNumber(vector);
		View.print(vector);
		Sorting.increasingBubleSort(vector);
		View.print(vector);
	}

}
