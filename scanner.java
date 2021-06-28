import java.util.Scanner;

public class scanner {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Quel est ton âge ?");
		
		int age = scanner.nextInt();
		scanner.nextLine();
		String texteAAfficher;
		
		if (age < 40)
		{
			texteAAfficher = "ça va, t'es jeune";
		}
		else
		{
			texteAAfficher = "Oh t'es vieux!";
		}
		
		System.out.println(texteAAfficher);
		scanner.close();
	}
}