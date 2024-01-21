package math_ops;

public class App {

	public static void main(String[] args) {
		int choice;

		System.out.println("Choose math operation");
		System.out.println("1.- Calcule G.C.F between two numbers (Euclides method).");
		System.out.println("2.- Check if the equation [ ax ≡ b mod m ] has a solution (Linear congruence theorem).");
		System.out.println("3.- Simplify the equation [ ax ≡ b mod m ] if it has a solution.");
		System.out.println("4.- Find a solution (x) to the equation [ ax ≡ b mod m ] if it has (with Bézout's method).");

		choice = Utils.insertInput();

		switch (choice) {
		case 1: {
			Utils.gcfEuclides();
			break;
		}
		case 2: {
			System.out.println("\nax ≡ b mod m");
			if (ABM.insertABM()) {
				Utils.congruenceCheckSolution(ABM.getA(), ABM.getB(), ABM.getM());
			}
			break;
		}
		case 3: {
			if (ABM.insertABM()) {
				Utils.simplifyCongruence(ABM.getA(), ABM.getB(), ABM.getM());
			}
			break;
		}
		case 4: {
			if (ABM.insertABM()) {
				if (Utils.simplifyCongruence(ABM.getA(), ABM.getB(), ABM.getM())) {
					Utils.FindCongruenceX(ABM.getA(), ABM.getB(), ABM.getM());
				}
			}			
			
			break;
		}
		default:
		}
		System.out.println("\nEnd of program");
	}
}
