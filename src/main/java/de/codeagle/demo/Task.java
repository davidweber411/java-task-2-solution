package de.codeagle.demo;

public class Task {

	// https://gitlab.codeagle.de/recruiting/java-task-2

	public static int doors(int n) throws IllegalArgumentException {
		if (n < 1 || n > 100000) {
			throw new IllegalArgumentException("The argument 'n' has the value '" + n
					+ "', but it must be greater than 0 and smaller then 100001.");
			// Oder eine andere Fehlerbehandlung ...
			// Ohne Exception-Wurf kann die throws-Deklaration weg.
		}
		boolean[] statesOfDoors = new boolean[n];

		for (int studentI = 1; studentI <= n; studentI++) {
			for (int doorJ = 1; doorJ <= n; doorJ++) {
				if (doorJ % studentI == 0) {
					statesOfDoors[doorJ - 1] = !statesOfDoors[doorJ - 1];
				}
			}
		}

		int openDoors = 0;
		for (boolean b : statesOfDoors) {
			if (b == true) {
				openDoors++;
			}
		}

		return openDoors;
	}

}
