package megasena;

import java.util.Arrays;

public class Fazer {

	public static void main(String[] args) {
		int[] aposta1 = new int[] { 2, 9, 10, 11, 25, 59 };
		int[] aposta2 = new int[] { 2, 9, 10, 5, 14, 59 };
		int[] aposta3 = new int[] { 12, 15, 30, 38, 39, 40 };
		int[] aposta4 = new int[] { 3, 5, 6, 10, 11, 12 };
		int[] aposta5 = new int[] { 2, 4, 8, 26, 35, 38 };
		int[] aposta6 = new int[] { 59, 25, 11, 9, 10, 2 };

		int[] resultado = new int[] { 59, 25, 11, 9, 10, 2 };

		for (int aux = 0; aux < 1; aux++) {
			if (Arrays.equals(aposta1, resultado)) {
				System.out.println("Parabéns você ganhou na mega-sena");
			} else if (Arrays.equals(aposta2, resultado)) {
				System.out.println("Parabéns você ganhou na mega-sena");
			} else if (Arrays.equals(aposta3, resultado)) {
				System.out.println("Parabéns você ganhou na mega-sena");
			} else if (Arrays.equals(aposta4, resultado)) {
				System.out.println("Parabéns você ganhou na mega-sena");
			} else if (Arrays.equals(aposta5, resultado)) {
				System.out.println("Parabéns você ganhou na mega-sena");
			} else if (Arrays.equals(aposta6, resultado)) {
				System.out.println("Parabéns você ganhou na mega-sena");
			} else {
				System.out.println("Você não apostou!!!!!");
			}

		}

	}
}
