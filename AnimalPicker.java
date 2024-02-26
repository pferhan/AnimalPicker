import java.util.Scanner;

public class AnimalPicker {

    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);

        String choice = "";
        
        while(!choice.equals("dog") && !choice.equals("cat"))
        {
            System.out.println("Would you like to see a cat or dog?");

            choice = scan.nextLine().toLowerCase();
    
            if (choice.equals("dog")) {
                System.out.println("    ___\n __/_  `.  .-\"\"\"-.\n \\_,` | \\-\'  /   )`-\')\n  \"\") `\"`    \\  ((`\"`\n ___Y  ,    .\'7 /|\n(_,___/...-` (_/_/ ");
            } else if (choice.equals("cat")) {
                System.out.println("      |\\      _,,,---,,_\nZZZzz /,`.-\'`\'    -.  ;-;;,_\n     |,4-  ) )-,_. ,\\ (  `\'-\'\n    \'---\'\'(_/--\'  `-\'\\_) ");
            } else {
                System.out.println("Error: Invalid selection - Please select either dog or cat");
            }
        }
        scan.close();
    }
}