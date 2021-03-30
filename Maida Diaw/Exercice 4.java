

import java.util.Scanner;
public class Exo4{
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        int a;
        System.out.println("Entrez un jour");
        a=clavier.nextInt();
        while(a>31 || (a==0)){
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
        
        int mois ;
        Scanner souris=new Scanner(System.in);
        System.out.println("Entrez un mois");
        mois=clavier.nextInt();

        switch (mois){
            case 1:
            System.out.println("le mois de janvier compte 31 jours");
            if(a==31);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=30;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=31){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }

            case 2:
            if (a % 4 == 0 && (a % 100 != 0) ||(a%400==0)) {
                System.out.println(+a + "est une annee bissextile");
               System.out.println("le mois de Fevrier compte 29 jours");
            } else {
                System.out.println(+a + "n\'est pas une annee bissextile");
                System.out.println("le mois de Fevrier compte 28 jours");

    
           }
            break;
            case 3:
            System.out.println("le mois de Mars compte 31 jours");
            if(a==31);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=30;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=31){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }

            break;
            case 4:
            System.out.println("le mois de Avril compte 30 jours");
            if(a==30);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=29;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=30){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }
            break;
            case 5:
            System.out.println("le mois de Mai compte 31 jours");
            if(a==31);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=30;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=31){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }
            break;
            case 6:
            System.out.println("le mois de juin compte 30 jours");
            if(a==30);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=29;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=30){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }
            break;
            case 7:
            System.out.println("le mois de juillet compte 31 jours");
            if(a==31);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=30;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=31){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }
          
            break;
            case 8:
            System.out.println("le mois d\'Aout compte 31 jours");
            if(a==31);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=30;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=31){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }
            break;
            case 9:
            System.out.println("le mois de Septembre compte 30 jours");
            if(a==30);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=29;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=30){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }
            break;
            case 10:
            System.out.println("le mois d\'Octobre compte 31 jours");
            if(a==31);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=30;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=31){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }
            break;
            case 11:
            System.out.println("le mois de Novembre compte 30jours");
            if(a==30);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=29;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=30){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }
            break;
            case 12:
            System.out.println("le mois de Decembre compte 31 jours");
            if(a==31);{
              int b;
              b=1;
              System.out.println("le jour prochain est le"+b);
              int c;
              c=30;
              System.out.println("le jour precedant etait le"+c);
            }while(a!=31){
              System.out.println("le jour prochain est le"+a+1);
              int d;
              d=a-1;
               
              System.out.println("le jour precedant etait le"+d);

            }
            break;
        }  }

        
      } 
     

        
       
      
   
   
    
 
  


