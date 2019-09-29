package ZadaniaPROG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        double comp_number;
        String user = null;
        String comp;
        String computer_choice = null;
        String user_choice = null;
        int compScore = 0;
        int userScore = 0;

        System.out.println("Let's play a game - ROCK/PAPER/SCISSORS");
        System.out.println("Choose r/p or s an check if you have won!!!");

        for (int i = 0; i < 10; i++) {
            System.out.print("Your choice:");

            Random r = new Random();
            comp_number = Math.round(2 * (r.nextDouble()));

            if (comp_number == 0) {

                computer_choice = "--ROCK--";
            }
            if (comp_number == 1) {

                computer_choice = "--PAPER--";
            }
            if (comp_number == 2) {

                computer_choice = "--SCISSORS--";
            }

            Scanner sc = new Scanner(System.in);
            user = sc.nextLine();

            if (user.equals("R") || user.equals("r")) {

                user_choice = "--ROCK--";
                System.out.println("--ROCK--");

            } else if (user.equals("P") || user.equals("p")) {

                user_choice = "--PAPER--";
                System.out.println("--PAPER--");

            } else if (user.equals("S") || user.equals("s")) {

                user_choice = "--SCISSORS--";
                System.out.println("--SCISSORS--");

            } else {
                System.out.println("!!Wrong choise!!You can choose only r,p or s!!");
                System.exit(3);
            }

            System.out.println("Computer choice:");
            System.out.println(computer_choice);

            if (computer_choice.equals(user_choice)) {
                System.out.println("IT'S A TIE");

                userScore++ ;
                compScore++ ;

            }
            if (user_choice.equals("--ROCK--")) {
                if (computer_choice.equals("--PAPER--")) {

                    System.out.println("Paper eat Rock!Computer Win!");
                    compScore++ ;
                }
                if (computer_choice.equals("--SCISSORS--")) {

                    System.out.println("Rock breaks the Scissors! You Win!");
                    userScore++;
                }
            }
            if (user_choice.equals("--PAPER--")) {
                if (computer_choice.equals("--ROCK--")) {

                    System.out.println("Paper eat Rock!You Win!");
                    userScore++ ;
                }
                if (computer_choice.equals("--SCISSORS--")) {

                    System.out.println("Scissors cut Paper! Computer Win!");
                    compScore++;
                }
            }
            if (user_choice.equals("--SCISSORS--")) {
                if (computer_choice.equals("--ROCK--")) {

                    System.out.println("Rock breaks the Scissors! Computer Win!");
                    compScore++ ;
                }
                if (computer_choice.equals("--PAPER--")) {

                    System.out.println("Scissors cut Paper! You Win!");
                    userScore++ ;
                }

            }
            System.out.println("UserScore :" + userScore);
            System.out.println("ComputerScore :" + compScore);
        }
    }
}

