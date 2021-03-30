import java.util.Scanner;
public class Exo3{
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        int a;
        System.out.println("Entrez un jour");
        a=clavier.nextInt();
        while(a>31 || (a==0)){
            System.out.println("error");
          break;

        }
        
        
        
       
        Scanner clavier1=new Scanner(System.in);
        int mois ;

        System.out.println("Entrez un mois");
        mois=clavier1.nextInt();
        while(mois>12 || (mois==0)){
            System.out.println("error");
          break;
        }
      

       
        Scanner clavier2=new Scanner(System.in);
        int annee ;
        System.out.println("Entrez une annee");
        annee=clavier2.nextInt();
        while(annee<1000){
            System.out.println("error");
            break;   
        }
        if  (annee % 4 == 0 && (annee% 100 != 0) ||(annee%400==0)) {
            System.out.println(+annee + "est une annee bissextile");
            if (mois==2){

                while(a>29 || (a==0)){
                    System.out.println("error cette date n existe pas");
                    break;
                }
            }  
    
        } else {
            System.out.println(+a + "n\'est pas une annee bissextile");
            while(a>28 || (a==0)){
                System.out.println("error cette date n existe pas"); 
                break; 
            }    
                
        }
        System.out.println( +a +"/" +mois+ "/" +annee );  

    }
}