package by.epam.javatraining.yanushkevich.maintask.view;

public class View {
	
	public static void print(double[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%.4f ",vector[i]);
		}
		System.out.println();
	}
	
}
