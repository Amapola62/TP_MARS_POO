/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Exercice04 {

    static final Random random = new Random();
    private static Scanner sc = new Scanner(System.in);
    private static int Valrandom = random.nextInt(100);
    private static int Valinser;
    private static int Compteurcoups;
    private static String choix;
    private static List<Integer> LRandom = new ArrayList<Integer>();
    private static List<Integer> LCoups = new ArrayList<Integer>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valtemp = 0;
        
        do {
            LRandom.add(Valrandom);
           
            System.out.println("Pouvez vous deviner la valeur ?");
            System.out.println("Entrez un nombre :");
            Valinser = sc.nextInt();
            Compteurcoups = 1;
            do {
                Compteurcoups++;
                if (Valinser < Valrandom) {
                    System.out.println("Le nombre est trop bas rééssayez");
                    Valinser = sc.nextInt();
                } else {
                    System.out.println("Le nombre est trop grand rééssayez");
                    Valinser = sc.nextInt();
                }
            } while (Valinser != Valrandom);
            LCoups.add(Compteurcoups);
            System.out.print("Vous avez trouvé.");
            System.out.println(" Le nombre était bien " + Valrandom);
            System.out.println("Voulez-vous rejouer ?");
            choix = sc.next();
            Valrandom = random.nextInt(100);
        } while (choix.equalsIgnoreCase("oui")||(choix.equalsIgnoreCase("o")));
        
        for(Integer vt :LRandom)
        {
            if(vt > valtemp)
            {
                valtemp =vt;
            }
        }
        System.out.println("La plus grande valeur que vous ayez trouvé est : "+valtemp);
        valtemp = LCoups.get(0);
        for(Integer vt : LCoups)
        {
           if(valtemp > vt)
           {
               valtemp = vt;
           }
        }
        System.out.println("Votre meilleur score est : "+valtemp+" coups. ");
    }
}
