import java.util.Scanner;
public class Exo1Insertion {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        int a;
        System.out.println("Entrer une annee");
        a=clavier.nextInt();
        int result;
        if (a % 4 == 0 && (a % 100 != 0) ||(a%400==0)) {
            System.out.println(+a + "est une annee bissextile");
        } else {
            System.out.println(+a + "n\'est pas une annee bissextile");

       }
    
   }
}
