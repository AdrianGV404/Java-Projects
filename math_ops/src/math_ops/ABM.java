package math_ops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ABM {
	public static int a, b, m, gcf;

	public ABM(int x, int y, int z) {
		a = x;
		b = y;
		m = z;
		gcf = 1;
	}

	public static int getA() {
		return a;
	}

	public static void setA(int a) {
		ABM.a = a;
	}

	public static int getB() {
		return b;
	}

	public static void setB(int b) {
		ABM.b = b;
	}

	public static int getM() {
		return m;
	}

	public static void setM(int m) {
		ABM.m = m;
	}

	public static int getGCF() {
		return gcf;
	}

	public static void setGCF(int gcf) {
		ABM.gcf = gcf;
	}


	public static boolean insertABM() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("A: ");
			a = sc.nextInt();
			System.out.print("B: ");
			b = sc.nextInt();
			System.out.print("M: ");
			m = sc.nextInt();
			return true;
		} catch (InputMismatchException e) {
			System.out.println("!!! - Wrong input, you must insert an integer.");
			return false;
		}
	}
}
