/* Saisir une serie de N nombres positif puis determinez la valeur
        1- La valeur min et la valeur max 
        2- les 2 valeurs min et les deux valeurs max
        3- La somme des valeurs premieres
        4- le produit des valeurs parfaites
        5- La valeur min premier et la valeur max parfaite*/


import java.util.*;
import java.util.Scanner;

public class Exo5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Combien de valeur voulez vous ajouter: ");
        int n= sc.nextInt();
        List<Integer> Liste= new LinkedList<Integer>();
        int i=0;
        int j;
        while (n>0){
            j= i+1;
            System.out.println("saisir valeur positive "+j+": ");
            int x= sc.nextInt();
            while (x<0){
                System.out.println("saisir valeur correcte "+j+": ");
                x = sc.nextInt();
            }
            Liste.add(x);
            i++;
            n--;
        }
        int S=0;
        int P=1;
        List<Integer> Premier= new LinkedList<Integer>();
        List<Integer> Parfait= new LinkedList<Integer>();
        for(int V: Liste){
            //Determinations des nombres premiers
            int c=0;
            int a=1;
            while(a<=V){
                if(V%a==0){
                    c++;
                }
                a++;
            }
            if(c==2){
                S+=V;
                Premier.add(V);
            }
            //Determination des nombres parfaits
            int S1=0;
            int a1=1;
            while (a1 < V){
                if (V % a1 == 0) {
                    S1+=a1;