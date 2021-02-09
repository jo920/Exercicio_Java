
package br.universidadeXTI;

import java.util.Scanner;


public class Exercicio {

   public static void main(String[]args){
   
       /*
       Exercicio 1 - pra pega o nome de um usuário e deseja boas vindas 
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Me diga seu nome:");
       String nome =sc.next();
       
       System.out.println("Olá,"+nome);
       System.out.println("Seja bem vindo ao nosso mundo de progamadores");
   
   */
       
              
       String name = "";
       String r; 
       float n1 = 0;
       float n2 = 0;
       float n3 = 0;
       float n4 = 0;
       
       double total = 0;
       double média = 0;
       
       
        Scanner LerTeclado = new Scanner(System.in);
       
      
        System.out.println("Olá, sou o julio!Vou calcular sua média semestral");
           
        
        System.out.println("Me informe seu nome completo:");
       name = LerTeclado.nextLine();
       
       System.out.println("Me informe a sua primeira nota do semestre:");
       n1=LerTeclado.nextFloat();
       
       System.out.println("Me informe agora sua segunda nota");
        n2=LerTeclado.nextFloat();
        
      System.out.println("Me informe a sua terceira nota:");
        n3= LerTeclado.nextFloat();
        
        System.out.println("Me informe a sua quarta nota:");
          n4=LerTeclado.nextFloat();
       
       total = n1+n2+n3+n4;
               média = total/4;
               
               
               System.out.println(name+" a sua media é "+média);
                if(média >=6){
                  System.out.println("Meus parabéns você conseguiu passar de semestre");
                }else{
                
                System.out.println("Não foi dessa vez, no próximo semestre você precisa se esforçar mais");
                }
                     
                
             
                  



   }    
}
