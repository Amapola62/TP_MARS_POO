/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice05;

import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Exercice05 {

    /**
     * @param args the command line arguments
     */
    private static int age;
    private static int taille;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int age = 0;
        int taille = 0;

        do {
            System.out.println("Saisissez un âge");
            age = sc.nextInt();
            System.out.println("Saisissez une taille (en cm)");
            taille = sc.nextInt();
            if (age > 20 && taille < 100) {
                System.out.println("Vous êtes peut-être un nain adulte ?");
            }
            if (age > 20 && taille > 200) {
                System.out.println("Vous êtes un géant adulte :)");
            }
            if (age < 3 || taille < 50) {
                System.out.println("Vous êtes peut-être un bébé :)");
            }
            if (age >= 15 && age <= 18 && taille >= 150 && taille <= 180) {
                System.out.println("Vous êtes un ado ^^!");
            }
            if (age >= 20 && taille >= 150 && taille <= 180) {
                System.out.println("Vous êtes un adulte ^^!");
            }
        } while (age == 0);
    }
}
