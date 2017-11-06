import java.util.*;
public class OddsAndEvens {
    public static void main(String[] args) {

        System.out.println("\nLet's play a game called \"Odds And Evens\"");
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens? ");
        String opt = input.next();
        if (opt.equalsIgnoreCase("O")) {
            System.out.println(name + " has picked odds! The computer will be evens");
        } else {
            System.out.println(name + " has picked evens! The computer will be odds");
        }
        System.out.println("----------------------------------------");

        System.out.print("How many \"fingers\" do you put out? ");
        int num = input.nextInt();
        if (num > 5 || num<0) {
            System.out.println("Please enter the number between 0 to 5");

        }
        else
        {
            input.nextLine();
        Random rand = new Random();
        int computer = rand.nextInt(6);
        System.out.println("The computer plays " + computer + " \"fingers\".");
        System.out.println("-------------------------------");
        int sum = num + computer;
        System.out.println(num + " + " + computer + " = " + sum);
        if ((sum % 2) == 0) {
            System.out.println(sum + " is.....Even!");
            if (opt.equalsIgnoreCase("E")) {
                System.out.println("That mean " + name + " wins! :)");
            } else {
                System.out.println("That mean Computer wins!");
            }
        } else {
            System.out.println(sum + " is......odd!");
            if (opt.equalsIgnoreCase("o")) {
                System.out.println("That mean " + name + " wins! :)");
            } else {
                System.out.println("That mean Computer wins!");
            }
        }
        System.out.println("-----------------------------------------");
    }
    }
}
