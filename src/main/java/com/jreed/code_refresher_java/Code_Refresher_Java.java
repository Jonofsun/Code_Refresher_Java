/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jreed.code_refresher_java;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Jonof
 */
public class Code_Refresher_Java {
    private static List<Player> players = new ArrayList<>();
    public static void main(String[] args) {
        Player player = new Player("Nami", 20);
        Player player1 = new Player("Luffy", 99);
        Player player2 = new Player("Zoro", 96);
        Player player3 = new Player("Robin", 77);
        Player player4 = new Player("Usopp", 3);
        players.add(player);
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);

        System.out.println("Welcome: Press Enter");
        new Scanner(System.in).nextLine();
        menu();
    }
    private static void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n1 - Display All Players");
            System.out.println("2 - Display Players with an Odd Number");
            System.out.println("3 - Display Players starting with a letter");
            System.out.println("4 - Add Player");
            System.out.println("e - Exit\n");
            System.out.print("USER selection: ");
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "1":
                    displayAllPlayers();
                    break;
                case "2":
                    displayPlayersOdd();
                    break;
                case "3":
                    displayLetterIndex();
                    break;
                case "4":
                    addPlayer();
                    break;
                case "e":
                    System.out.println("Good Bye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid selection\n");
                    break;
            }
        }
    }
    private static void displayAllPlayers() {
        System.out.println("\nAll Players:");
        for (Player p : players) {
            System.out.println(p);
        }
    }
    private static void displayPlayersOdd() {
        System.out.println("\nPlayers with Odd Numbers:");
        for (Player p : players) {
            if (p.getNumber() % 2 != 0) {
                System.out.println(p.getName() + " - Lvl: " + p.getNumber());
            }
        }
    }
    private static void displayLetterIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = scanner.nextLine().toLowerCase().charAt(0);

        System.out.println("\nPlayers with Names Starting with '" + letter + "':");
        for (Player p : players) {
            if (Character.toLowerCase(p.getName().charAt(0)) == letter) {
                System.out.println(p.getName() + " - Lvl: " + p.getNumber());
            }
        }
    }
    private static void addPlayer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter player's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter player's Level: ");
        int number = scanner.nextInt();
        Player player = new Player(name, number);
        players.add(player);
        System.out.println("Player " + name + " added successfully.");
    }
}
