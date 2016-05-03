package timesTable;

public class TimesTable {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			for (int j = 1; j < 6; j++) {

				System.out.print(j + " * " + i + " = " + (j * i));

			}
			
			System.out.println(" ");
			
		}
	}
}
