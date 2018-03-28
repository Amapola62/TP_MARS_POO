/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercice02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Formation
 */
public class Exercice02 {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            double Valtemp = 0;
            int NbValeurs = 0;
            double somme =0;
            double moyenne=0;
            
            String valeur = "";
            System.out.println("Combien de valeurs voulez vous saisir ?");
            List<Double> ListeValeurs = new ArrayList<Double>();
            while (!sc.hasNextInt()) {
                sc.next();
            }
            valeur = sc.next();
            NbValeurs = Integer.parseInt(valeur);
            
            while (ListeValeurs.size()<NbValeurs) {
                System.out.println("Saisissez un nombre");
                Valtemp = sc.nextDouble();
                ListeValeurs.add(Valtemp);
            }
        somme = SommeValeurs(ListeValeurs);
        
        moyenne = somme / NbValeurs;
        System.out.println("La moyenne des valeurs est : "+moyenne);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static double SommeValeurs(List<Double> ListeValeurs) {
        double Valtemp = 0;
        for (Double od : ListeValeurs) {
           Valtemp += od;           
        }
        System.out.println("La somme totale des valeurs est : "+Valtemp);
        return Valtemp;
    }
}
   