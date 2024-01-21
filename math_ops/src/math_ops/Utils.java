package math_ops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
	public static int insertInput() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String input = null;

		System.out.print("Choice: ");
		input = sc.nextLine();
		try {
			choice = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("!!! - Wrong input, you must insert an integer.");
			choice = -1;
		}
		return choice;
	}

	public static void gcfEuclides() {
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0, gcf;

		System.out.println("\nM.C.D 'Euclides'");
		System.out.println(" - Insert m.c.d (A, B)");
		try {
			System.out.print("A: ");
			a = sc.nextInt();
			System.out.print("B: ");
			b = sc.nextInt();

			gcf = gcfEuclidesCalculate(a, b, 0, true);

			System.out.println("--------------");
			System.out.println("m.c.d (" + a + ", " + b + ") = " + gcf);

		} catch (InputMismatchException e) {
			System.out.println("!!! - Wrong input, you must insert an integer.");
		}
	}

	private static int gcfEuclidesCalculate(int a, int b, int s, boolean print) {
		int q;
		int r;

		try {
			q = a / b;
			r = a % b;
		} catch (Exception e) {
			System.out.println("!!! - Wrong input, you can't divide by 0.");
			return s;
		}
		if (print) {
			System.out.println("--------------");
			System.out.println(a + " / " + b);
			System.out.println("Q: " + q);
			System.out.println("R: " + r);
		}
		if (r > 0) {
			s = gcfEuclidesCalculate(b, r, s, print);
		} else {
			if (r == 0) {
				return b;
			}
		}
		return s;
	}

	public static boolean congruenceCheckSolution(int a, int b, int m) {
		ABM.setGCF(gcfEuclidesCalculate(a, m, 0, false));

		System.out.println("\ngcf (a, m) => " + "gcf (" + a + ", " + m + ") = " + ABM.getGCF());
		if (b % ABM.getGCF() == 0) {
			System.out.println("\nIt can be solved because: ");
			System.out.println("b % gcf(a, m) = 0 || " + b + " % " + ABM.getGCF() + " = 0");
			return true;
		} else {
			System.out.println("\nIt cannot be solved because:");
			System.out.println("b % gcf(a, m) != 0 || " + b + " % " + ABM.getGCF() + " = " + b % ABM.getGCF());
			return false;
		}
	}

	public static boolean simplifyCongruence(int a, int b, int m) {
		int a_aux = a, b_aux = b, m_aux = m;
		if (congruenceCheckSolution(a, b, m)) {
			System.out.println("\n--------------");
			if (ABM.getGCF() > 1) {
				System.out.println("ax ≡ b mod m");
				System.out.println(ABM.getA() + "x ≡ " + ABM.getB() + " mod " + ABM.getM());
				System.out.println("\nSimplifies to: ");
				System.out.println("a = a / gcf (a, m)");
				System.out.println("b = b / gcf (a, m)");
				System.out.println("m = m / gcf (a, m)");

				ABM.setA(ABM.getA() / ABM.getGCF());
				ABM.setB(ABM.getB() / ABM.getGCF());
				ABM.setM(ABM.getM() / ABM.getGCF());

				System.out.println("\nax ≡ b mod m");
				System.out.println(a_aux + "x ≡ " + b_aux + " mod " + m_aux + " => " + ABM.getA() + "x ≡ " + ABM.getB()
						+ " mod " + ABM.getM());
				System.out.println("\n" + ABM.getA() + "x ≡ " + ABM.getB() + " mod " + ABM.getM());
			} else {
				System.out.println("It cannot be simplified.");
			}
			return true;
		} else {
			return false;
		}
	}

	public static void FindCongruenceX(int a, int b, int m) {
		System.out.println("\n--------------");
		System.out.println("To find 'x', first we solve: ");
		System.out.println(ABM.getA() + "x' ≡ 1 mod " + ABM.getM());
		System.out.println("1 = " + ABM.getM() + "λ + " + ABM.getA() + "μ\n");
		System.out.println("gcf (a, m) = λ · a + µ · m");

		int values[] = BezoutTable();

		System.out.println("\n\n1 = " + ABM.getM() + "λ + " + ABM.getA() + "μ mod " + ABM.getM());
		System.out.println("1 = " + ABM.getM() + "*" + values[0] + " + " + ABM.getA() + "*" + values[1] + " mod "
				+ ABM.getM() + "\n");

	}

	private static int[] BezoutTable() {
		int table_dim = ABM.getM();
		int[] lambda = new int[table_dim + 2];
		int[] mu = new int[table_dim];
		int[] q = new int[table_dim];
		int[] r = new int[table_dim];

		// 0 = lambda || 1 = mu
		int[] values = new int[2];

		fill_table(lambda);
		fill_table(mu);
		fill_table(q);
		fill_table(r);

		lambda[0] = 1;
		lambda[1] = 0;
		mu[0] = 0;
		mu[1] = 1;
		q[0] = 0;
		q[1] = 0;
		r[0] = ABM.getM();
		r[1] = ABM.getA();

		int i = 2, res = -1;
		while (res != 0 || i == table_dim) {
			q[i] = r[i - 2] / r[i - 1];
			r[i] = r[i - 2] % r[i - 1];

			res = r[i];

			lambda[i] = lambda[i - 2] - q[i] * lambda[i - 1];
			mu[i] = mu[i - 2] - q[i] * mu[i - 1];

			values[0] = lambda[i - 1];
			values[1] = mu[i - 1];
			i++;
		}

		System.out.print("\nλ || ");
		printBezoutTable(lambda);

		System.out.print("\nµ || ");
		printBezoutTable(mu);

		System.out.print("\nQ || ");
		printBezoutTable(q);

		System.out.print("\nR || ");
		printBezoutTable(r);
		return values;
	}

	private static void printBezoutTable(int[] array) {
		int i = 0;
		while (array[i] != Integer.MAX_VALUE) {
			System.out.print(array[i] + " | ");
			i++;
		}
	}

	private static void fill_table(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.MAX_VALUE;
		}
	}
}
