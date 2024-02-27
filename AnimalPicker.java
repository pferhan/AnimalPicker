import java.util.Scanner;

public class AnimalPicker {

    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);

        String choice = "";
        
        while(!choice.equals("dog") && !choice.equals("cat") && !choice.equals("fish") && !choice.equals("horse"))
        {
            System.out.println("Would you like to see a dog, cat, fish, or horse?");

            choice = scan.nextLine().toLowerCase();
    
            if (choice.equals("dog")) {
                System.out.println("    ___\n __/_  `.  .-\"\"\"-.\n \\_,` | \\-\'  /   )`-\')\n  \"\") `\"`    \\  ((`\"`\n ___Y  ,    .\'7 /|\n(_,___/...-` (_/_/ ");
            } else if (choice.equals("cat")) {
                System.out.println("      |\\      _,,,---,,_\nZZZzz /,`.-\'`\'    -.  ;-;;,_\n     |,4-  ) )-,_. ,\\ (  `\'-\'\n    \'---\'\'(_/--\'  `-\'\\_) ");
            } else if (choice.equals("fish")) {
                System.out.println("               O  o\n          _\\_   o\n>(\'>   \\\\/  o\\ .\n       //\\___=\n          \'\'");
            } else if (choice.equals("horse")) {
                System.out.println("                                 |\\    /|\n                              ___| \\,,/_/\n                           ---__/ \\/    \\\n                          __--/     (D)  \\\n                          _ -/    (_      \\\n                         // /       \\_ /  -\\\n   __-------_____--___--/           / \\_ O o)\n  /                                 /   \\__/\n /                                 /\n||          )                   \\_/\\\n||         /              _      /  |\n| |      /--______      ___\\    /\\  :\n| /   __-  - _/   ------    |  |   \\ \\\n |   -  -   /                | |     \\ )\n |  |   -  |                 | )     | |\n  | |    | |                 | |    | |\n  | |    < |                 | |   |_/\n  < |    /__\\                <  \\\n  /__\\                       /___\\");
            } else {
                System.out.println("Error: Invalid selection - Please select either dog, cat, fish, or horse");
            }
        }
        scan.close();
    }
}