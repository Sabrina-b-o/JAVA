import java.util.Scanner;
import java.lang.Math;

public class morpion {
	//initialiser les 9 cases de notre grille de type char "1", "x", "O"
	static char case1 = '1';
	static char case2 = '2';
	static char case3 = '3';
	static char case4 = '4';
	static char case5 = '5';
	static char case6 = '6';
	static char case7 = '7';
	static char case8 = '8';
	static char case9 = '9';


	public static void main(String[] args) {


		//Dire bonjour
		System.out.println("\n");
		System.out.println("Bonjour bienvenue sur mon super morpion" + "\n" + "Pour jouer tape le numero de la case");
		System.out.println("\n");


		while (victoryOrNot() == false)
		{
			afficherGrille();
			System.out.println("\n");
			demanderNum(1);
			System.out.println("\n");
			afficherGrille();
			System.out.println("\n");
			demanderNum(2);
		}
	}
	// Affichage de la grille de morpion

	public static void afficherGrille() {
		System.out.println("                   " + case1 + "|" + case2 + "|" + case3);
		System.out.println("                   " + case4 + "|" + case5 + "|" + case6);
		System.out.println("                   " + case7 + "|" + case8 + "|" + case9);
	}

	//Vérification de la victoire

	public static boolean victoryOrNot() {
		boolean victory;

		if (case1 == case2 && case2 == case3 && case3 == case1) {
			victory = true;
		} else if (case4 == case5 && case4 == case6 && case5 == case6) {
			victory = true;
		} else if (case7 == case8 && case7 == case9 && case9 == case8) {
			victory = true;
		} else if (case7 == case5 && case7 == case3 && case5 == case3) {
			victory = true;
		} else if (case1 == case5 && case1 == case9 && case5 == case9) {
			victory = true;
		} else if (case1 == case4 && case1 == case7 && case7 == case4) {
			victory = true;
		} else if (case2 == case5 && case2 == case8 && case8 == case5) {
			victory = true;
		} else if (case3 == case6 && case3 == case9 && case9 == case6) {
			victory = true;
		}
		else {
			victory = false;
		}
		return victory;
	}

	// vérification sur la case a déjà été remplie

	public static boolean caseRemplie(int nbCase) {
		if (nbCase == 'X' || nbCase == 'O') {

			return true;
		} else {
			return false;
		}
	}

	public static int iaPasSuperMaligne() {
		int max = 9;
		int min = 1;
		int range = max - min + 1;

		int rand = (int) (Math.random() * range) + 1;

		return rand;
	}



	// Demande du numéro de la case et remplissage par X ou O

	public static void demanderNum(int numJoueur)
	{
		char symbol;



		//Selon le joueur un X ou un O sera joué
		if(numJoueur == 1)
		{
			symbol = 'X';
		}
		else
		{
			symbol = 'O';
		}



		if(numJoueur == 2) {
			int choixIA = iaPasSuperMaligne();

			switch (choixIA) {

				case 1:
					// on vérifie que la case n'ait pas été jouée

					if ((case1 != 'X') && (case1 != 'O') && (choixIA == 1)) {
						case1 = symbol;
					} else {
						demanderNum(2);
					}
					break;

				case 2:
					if ((case2 != 'X') && (case2 != 'O') && (choixIA == 2)) {
						case2 = symbol;
					} else {
						demanderNum(2);
					}
					break;

				case 3:
					if ((case3 != 'X') && (case3 != 'O') && (choixIA == 3)) {
						case3 = symbol;
					} else {
						demanderNum(2);
					}
					break;

				case 4:
					if ((case4 != 'X') && (case4 != 'O') && (choixIA == 4)) {
						case4 = symbol;
					} else {
						demanderNum(2);
					}
					break;

				case 5:
					if ((case5 != 'X') && (case5 != 'O') && (choixIA == 5)) {
						case5 = symbol;
					} else {
						demanderNum(2);
					}
					break;

				case 6:
					if ((case6 != 'X') && (case6 != 'O') && (choixIA == 6)) {
						case6 = symbol;
					} else {
						demanderNum(2);
					}
					break;

				case 7:
					if ((case7 != 'X') && (case7 != 'O') && (choixIA == 7)) {
						case7 = symbol;
					} else {
						demanderNum(2);
					}
					break;

				case 8:
					if ((case8 != 'X') && (case8 != 'O') && (choixIA == 8)) {
						case8 = symbol;
					} else {
						demanderNum(2);
					}
					break;

				case 9:
					if ((case9 != 'X') && (case9 != 'O') && (choixIA == 9)) {
						case9 = symbol;
					} else {
						demanderNum(2);
					}
					break;
			}
		}
		else {

			//On demande la case au joueur
			System.out.println("Joueur " + numJoueur + " a toi de jouer : ");
			Scanner scanner = new Scanner(System.in);
			int choix = scanner.nextInt();

			//On demande de remplir un numéro valide
			if(choix > 9 || choix < 1 )
			{
				System.out.println("Tu vois bien qu'il n'y a que 9 cases ! Rejoue ! ");
				demanderNum(numJoueur);
			}

			//Remplir le case avec le bon symbol

			switch (choix) {

				case 1:
					// on vérifie que la case n'ait pas été jouée
					if ((case1 != 'X') && (case1 != 'O')) {
						case1 = symbol;
					} else {
						System.out.println("Cette case a deja ete joue !!");
						demanderNum(numJoueur);
					}
					break;

				case 2:
					if ((case2 != 'X') && (case2 != 'O')) {
						case2 = symbol;
					} else {
						System.out.println("Cette case a deja ete joue !!");
						demanderNum(numJoueur);
					}
					break;

				case 3:
					if ((case3 != 'X') && (case3 != 'O')) {
						case3 = symbol;
					} else {
						System.out.println("Cette case a deja ete joue !!");
						demanderNum(numJoueur);
					}
					break;

				case 4:
					if ((case4 != 'X') && (case4 != 'O')) {
						case4 = symbol;
					} else {
						System.out.println("Cette case a deja ete joue !!");
						demanderNum(numJoueur);
					}
					break;

				case 5:
					if ((case5 != 'X') && (case5 != 'O')) {
						case5 = symbol;
					} else {
						System.out.println("Cette case a deja ete joue !!");
						demanderNum(numJoueur);
					}
					break;

				case 6:
					if ((case6 != 'X') && (case6 != 'O')) {
						case6 = symbol;
					} else {
						System.out.println("Cette case a deja ete joue !!");
						demanderNum(numJoueur);
					}
					break;

				case 7:
					if ((case7 != 'X') && (case7 != 'O')) {
						case7 = symbol;
					} else {
						System.out.println("Cette case a deja ete joue !!");
						demanderNum(numJoueur);
					}
					break;

				case 8:
					if ((case8 != 'X') && (case8 != 'O')) {
						case8 = symbol;
					} else {
						System.out.println("Cette case a deja ete joue !!");
						demanderNum(numJoueur);
					}
					break;

				case 9:
					if ((case9 != 'X') && (case9 != 'O')) {
						case9 = symbol;
					} else {
						System.out.println("Cette case a deja ete joue !!");
						demanderNum(numJoueur);
					}
					break;
			}

		}

		// On vérifie si le joueur à gagner et lequel a gagné
		if(victoryOrNot() && symbol == 'X')
		{
			System.out.println("\n");
			afficherGrille();
			System.out.println("\n" + "Bravo joueur 1 tu as gagne !");

		}
		else if (victoryOrNot() && symbol == 'O')

		{
			System.out.println("\n");
			afficherGrille();
			System.out.println("\n" + "Bravo joueur 2 tu as gagne !");
		}

		// On demande si le joueur veut relancer une partie
		if (victoryOrNot())
		{

			System.out.println("Veux tu rejouer ? 1 pour OUI / 2 pour NON ");
			Scanner scanner = new Scanner(System.in);
			int rejouer = scanner.nextInt();

			if (rejouer == 1) {
				case1 = '1';
				case2 = '2';
				case3 = '3';
				case4 = '4';
				case5 = '5';
				case6 = '6';
				case7 = '7';
				case8 = '8';
				case9 = '9';
				afficherGrille();
				demanderNum(1);
			} else {
				System.exit(0);
			}

		}

	}
}


