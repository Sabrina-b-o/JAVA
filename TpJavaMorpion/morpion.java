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

			// Affichage de la grille de morpion
			
			public static void afficherGrille()
			{	
				System.out.println("                   " + case1 + "|" + case2 + "|" + case3);
				System.out.println("                   " + case4 + "|" + case5 + "|" + case6);
				System.out.println("                   " + case7 + "|" + case8 + "|" + case9);
			}
			
			//Vérification de la victoire 
			
			public static boolean victoryOrNot()
			{
				boolean victory = false;
				
				if(case1 == case2 && case2 == case3 && case3 == case1)
				{
					victory = true;
				}
				else if(case4 == case5 && case4 == case6 && case5 == case6)
				{
					victory = true;
				}
				else if(case7 == case8 && case7 == case9 && case9 == case8)
				{
					victory = true;
				}
				else if(case7 == case5 && case7 == case3 && case5 == case3)
				{
					victory = true;
				}
				else if(case1 == case5 && case1 == case9 && case5 == case9)
				{
					victory = true;
				}
				else
				{
					victory = false;
				}
				return victory;
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
				
				
				
				//On demande la case au joueur
				System.out.println("Joueur " + numJoueur + " a toi de jouer : ");
				Scanner scanner = new Scanner(System.in);
				int choix = scanner.nextInt();
				
				//Remplir le case avec un symbol
				if(choix == 1)
				{
					case1 = symbol;
				}
				else if (choix == 2)
				{
					case2 = symbol;
				}
				else if (choix == 3)
				{
					case3 = symbol;
				}
				else if (choix == 4)
				{
					case4 = symbol;
				}
				else if (choix == 5)
				{
					case5 = symbol;
				}
				else if (choix == 6)
				{
					case6 = symbol;
				}
				else if (choix == 7)
				{
					case7 = symbol;
				}
				else if (choix == 8)
				{
					case8 = symbol;
				}
				else if (choix == 9)
				{
					case9 = symbol;
				}
				System.out.print("Tu as joue sur la case : " + choix);
			
				
				if(victoryOrNot() == true)
				{
					
					System.out.println("\n" + "Bravo tu as gagné !");
					System.exit(0);
					
				}
				else
				{
					
				}
			}
			
			

	public static void main(String[] args)
	{
		
		
		//Dire bonjour
		System.out.println("\n");
		System.out.println("Bonjour bienvenue sur mon super morpion" +"\n" + "Pour jouer tape le numero de la case");
		System.out.println("\n");
		
		
		//Afficher la grille --> FONCTION
		//Joueur 1 -> jouer --> FONCTION DEMANDER ENTREE UTILISATEUR + REMPLIR LA GRILLE
		afficherGrille();
		System.out.println("\n");
		demanderNum(1);
		System.out.println("\n");
		
		
		// remplir la grille avec un X
		//Afficher la grille
		afficherGrille();
		
		
		
		//Joueur 2 -> jouer
		System.out.println("\n");
		demanderNum(2);
		System.out.println("\n");
		
		
		//Remplir la grille avec un 0
		//Afficher la grille
		afficherGrille();
		
		
		//Joueur 1 -> jouer
		//Afficher la grille
		System.out.println("\n");
		demanderNum(1);
		System.out.println("\n");
		afficherGrille();
		
		
		//Joueur 2 -> jouer
		//Afficher la grille
		System.out.println("\n");
		demanderNum(2);
		System.out.println("\n");
		afficherGrille();
		
		//Joueur 1 -> jouer
		//Afficher la grille
		System.out.println("\n");
		demanderNum(1);
		System.out.println("\n");
		afficherGrille();
		
		
		//Joueur 2 -> jouer
		//Afficher la grille
		System.out.println("\n");
		demanderNum(2);
		System.out.println("\n");
		afficherGrille();
		
		//Joueur 1 -> jouer
		//Afficher la grille
		System.out.println("\n");
		demanderNum(1);
		System.out.println("\n");
		afficherGrille();
		
		//Joueur 2 -> jouer
		//Afficher la grille
		System.out.println("\n");
		demanderNum(2);
		System.out.println("\n");
		afficherGrille();
		
		//Joueur 1 -> jouer
		//Afficher la grille
		System.out.println("\n");
		demanderNum(1);
		System.out.println("\n");
		afficherGrille();
		


	}
}