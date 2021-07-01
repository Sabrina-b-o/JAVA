package Exo2;

public class exo2 {


    //Fonction majeur
    public static boolean estMajeur(int age) {
        return age >= 18;
    }

    //Fonction signe()
    public static void signe(double num) {
        if (num > 0) {
            System.out.println("Il est positif !");
        } else if (num < 0) {
            System.out.println("Il est négatif !");
        } else {
            System.out.println("Il est nul !");
        }

        /*return num > 0 ? "positif":(num <0) ? "negatif": "nul");  => Version simplifiée  */
    }

    //Fonction plusGrand2()
    public static int plusGrand2(int num1, int num2)
    {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    //Fonction plusPetit2()
    public static int plusPetit2(int num1, int num2)
    {
        String result;
        if (num1 > num2) {
            return num2;
        }else{
            return num1;
        }

      /*  ( num1 > num2 ) ? num2 : num1;    => Version simplifiée */
    }

    //Fonction plusPetit2bis() en 1 ligne
    public static int plusPetit2bis(int num1, int num2)
    {

      return  ( num1 > num2 ) ? num2 : num1;
    }

    //Fonction plusPetit3()
    public static int plusPetit3(int num1, int num2, int num3)
    {
        if (plusPetit2(num1,num2) > num3) {
            return num3;
        } else if (plusPetit2(num1,num3) > num2) {
            return num2;
        }
        else
            {
            return num1;
        }
    }

    //Fonction plusGrand3()
    public static int plusGrand3(int num1, int num2, int num3)
    {
        if (plusGrand2(num1,num2) < num3) {
           return num3;
        } else if (plusGrand2(num1,num3) < num2)  {
            return num2;
        }
        else
        {
            return num1;
        }
    }

    //Fonction positifsOuPas
    public static boolean positifsOuPas(double num1, double num2, double num3)
    {
        if(num1 > 0 && num2 > 0 && num3 > 0)
        {
            return true;
        }
        return false;
    }



    //Fonction quelPermis()
    public static String quelPermis(int age)
    {
        /*
        String result;

        if(age < 16)
        {
            result = "Passager d'un véhicule";
        }
        else if(age < 18)
        {
            result = "Eligible conduite accompagnée";
        }
        else
            {
               result= "Eligible Permis B";
        }
        return result;
        */
        if(age < 16)
        {
            return "Passager d'un véhicule";
        }
        if (age < 18)
        {
            return "Eligible conduite accompagnée";
        }
        return "Eligible Permis B";
    }



    //Fonction capital()
    public static String capital(String pays)
    {
        String capitale;

        switch(pays)

        {
            case "France":
                capitale = "Paris";
                break;
            case "Allemagne":
                capitale = "Berlin";
                break;
            case "Italie":
                capitale = "Rome";
                break;
            case "Maroc":
                capitale = "Rabat";
                break;
            case "Espagne":
                capitale = "Madrid";
                break;
            case "Portugal":
                capitale = "Lisbonne";
                break;
            default: capitale ="inconnue";

        }

    return capitale;
    }



    public static void main(String[] args) {

        System.out.println(estMajeur(16));
        signe(0);
        System.out.println(plusGrand2(2,7));
        System.out.println(plusPetit2(2,10));
        System.out.println(plusPetit3(20,10,30));
        System.out.println(plusGrand3(20,10,30));
        System.out.println(positifsOuPas(1,2,4));

        System.out.println(quelPermis(5));
        System.out.println(quelPermis(10));
        System.out.println(quelPermis(16));
        System.out.println(quelPermis(17));
        System.out.println(quelPermis(18));
        System.out.println(quelPermis(19));
        System.out.println(quelPermis(80));

        System.out.println(capital("France"));

        System.out.println(plusPetit2bis(5,14));
    }

}