package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String botName = "Vlad";
        String botBirthName = "2020";

        System.out.println("Hello! My name is " + botName);
        System.out.println("I was created in " + botBirthName + ".");
        System.out.println("Please, remind me your name.");

        String userName = scanner.nextLine();

        System.out.println("What a great name you have, " + userName + "!");
    }
}
