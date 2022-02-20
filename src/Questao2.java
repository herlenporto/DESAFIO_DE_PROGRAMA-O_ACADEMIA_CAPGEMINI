import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String n = sc.nextLine();

		boolean hasCharMaiuscula = false;
		boolean hasCharMinuscula = false;
		boolean hasCharDigito = false;
		boolean hasCharEspescial = false;
		int qtdCharDiferente = 4;
		int tamMinino = 6;

		for (char c : n.toCharArray()) {
			if ((c >= 65 && c <= 90) && !hasCharMaiuscula) {
				hasCharMaiuscula = true;
				qtdCharDiferente--;
			} else if (c >= 97 && c <= 122 && !hasCharMinuscula) {
				hasCharMinuscula = true;
				qtdCharDiferente--;
			} else if (c >= 48 && c <= 57 && !hasCharDigito) {
				hasCharDigito = true;
				qtdCharDiferente--;
			} else if ("!@#$%^&*()-+".indexOf(c) != -1 && !hasCharEspescial) {
				hasCharEspescial = true;
				qtdCharDiferente--;
			}
		}

		if (qtdCharDiferente > 0 && n.length() >= tamMinino) {
			System.out.println(qtdCharDiferente);
		} else if (qtdCharDiferente == 0 && n.length() < tamMinino) {
			System.out.println(tamMinino - n.length());
		} else if (qtdCharDiferente > 0 && n.length() < tamMinino) {
			System.out.println(tamMinino - n.length());
		}

		sc.close();
	}
}
