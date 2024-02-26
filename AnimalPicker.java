import java.util.Scanner;

public class AnimalPicker {

    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Would you like to see a cat or dog?");

        String choice = scan.nextLine().toLowerCase();

        if (choice.equals("dog")) {
            System.out.println("DOG ASCII ART HERE");
        } else if (choice.equals("cat")) {
            System.out.println("CAT ASCII ART HERE");
        } 
    }
}