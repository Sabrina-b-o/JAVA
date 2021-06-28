import java.util.Scanner;

public class morpion
{
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

			public static void afficherGrille()
			{	
				System.out.println("                   " + case1 + "|" + case2 + "|" + case3);
				System.out.println("                   " + case4 + "|" + case5 + "|" + case6);
				System.out.println("                   " + case7 + "|" + case8 + "|" + case9);
			}
			
			public static void demanderNum()
			{
				Scanner scanner = new Scanner(System.in);
				System.out.print("Sur quel case veux tu jouer?");
			}
       
	public static void main(String[] args)
	{
		
		
		//Dire bonjour
		System.out.println("\n");
		System.out.println("Bonjour bienvenue sur mon super morpion" +"\n" + "Pour jouer tape le numero de la case");
		System.out.println("\n");
		//Afficher la grille --> FONCTION
		afficherGrille();
		
		//Joueur 1 -> jouer --> FONCTION DEMANDER ENTREE UTILISATEUR + REMPLIR LA GRILLE
		System.out.println("\n");
		demanderNum();
		
		// remplir la grille avec un X
		//Afficher la grille
		//Joueur 2 -> jouer
		//Remplir la grille avec un 0
		//Afficher la grille
		//Joueur 1 -> jouer
		//Afficher la grille
		//Joueur 2 -> jouer
		//Afficher la grille
		//Joueur 1 -> jouer
		//Afficher la grille
		//Joueur 2 -> jouer
		//Afficher la grille
		//Joueur 1 -> jouer
		//Afficher la grille
		//Joueur 2 -> jouer
		//Afficher la grille
		//Joueur 1 -> jouer
		//Afficher la grille
		//Joueur 2 -> jouer
		//Afficher la grille
		//Joueur 1 -> jouer
		//Afficher la grille
		//Joueur 2 -> jouer
		//Afficher la grille
		//Joueur 1 -> jouer
		//Afficher la grille
		//Joueur 2 -> jouer
		//Afficher la grille
		//Joueur 1 -> jouer
		//Afficher la grille
		//Joueur 2 -> jouer
		//Afficher la grille
		//Joueur 1 -> jouer
		//Afficher la grille
		//Joueur 2 -> jouer
		//Afficher la grille 
	}
}