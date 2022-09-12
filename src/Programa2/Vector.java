
package Programa2;

import java.util.Scanner;


public class Vector
{

    public static void main(String [] args)
    {
        
        Scanner entrada = new Scanner(System.in);
         
        int numeroIni1, numeroIni2, numeroIni3;
        
        int newNumero1, newNumero2, newNumero3;
         
        int ceros = 0; // Para añadir ceros 
       
        int numero = 1; //Esta sirve para comprobar que todos sean 1 en los if
        
        int cifra1, cifra2, cifra3; 

       
        

        
        
        System.out.println("\t\tHector Mauricio Rodriguez Salazar 21310416");
        System.out.println("\t\tPrograma para el calculo del Vector resultante a travez del Vector Colision");
        

            System.out.println("\n\tIngrese las cifras a partir de derecha a izquierda.");
            System.out.println("Ingrese el numero 1: ");
            numeroIni1=entrada.nextInt();
            System.out.println("Ingrese el numero 2: ");
            numeroIni2=entrada.nextInt();
            System.out.println("Ingrese el numero 3: ");
            numeroIni3=entrada.nextInt();
            System.out.println("Vector: "+numeroIni3+""+numeroIni2+""+numeroIni1);
            System.out.println("\n");
            
            cifra1=numeroIni1;
            cifra2=numeroIni2;
            cifra3=numeroIni3;
           
            newNumero1 = numeroIni1;
            newNumero2 = numeroIni2;
            newNumero3 = numeroIni3;

            //PARA LA PRIMER CIFRA
            
            if(numeroIni1 == 0)
            {
                    for(int i=1;i<5;i++)
                {
                    System.out.println("Desarrollo de la cifra 1: ");
                    System.out.println("Paso "+i+"\n"+numeroIni3+""+numeroIni2+""+numeroIni1);
                    System.out.println(ceros+""+numeroIni3+""+numeroIni2+"");

                    cifra1=cifra1+cifra2;
                    cifra2=cifra2+cifra3;
                    cifra3 =cifra3 +ceros;

                    if(cifra1>1)
                    {
                        cifra1=1;
                    }else if(cifra2>1)
                    {
                        cifra2=1;
                    }else if(cifra3>1)
                    {
                        cifra3=1;
                    }
                    System.out.println("---");
                    System.out.println(cifra3+""+cifra2+""+cifra1+"\n\n");

                    if((cifra3==numero) && (cifra2==numero) && (cifra1==numero))//Este es para si sale la misma cantidad del vector resultado que se concluya el programa
                    {
                        break;
                    }
                    numeroIni3 = cifra3;
                    numeroIni2 = cifra2;
                    numeroIni1 = cifra1;
                }
            }
            
            
            System.out.println("\n\n");

            //PARA LA SEGUNDA CIFRA
            if(newNumero2 == 0)
            {
                for(int i=1 ; i<5; i++)
                {
                    System.out.println("Desarrollo de la cifra 2: ");
                    System.out.println("Paso "+i+"\n"+newNumero3+""+newNumero2+""+newNumero1);
                    System.out.println(ceros+""+ceros+""+newNumero3+"");

                    cifra1=newNumero1+newNumero3;
                    cifra2=newNumero2+ceros;
                    cifra3=newNumero3+ceros;

                    if(cifra1>1)
                    {
                        cifra1=1;
                    }
                    else if(cifra2>1)
                    {
                        cifra2=1;
                    }
                    else if(cifra3>1)
                    {
                        cifra3=1;
                    }
                    System.out.println("---");
                    System.out.println(cifra3+""+cifra2+""+cifra1+"\n\n");
                    if((cifra3==numero) && (cifra2==numero) && (cifra1==numero))
                    {
                        break;
                    }
                    newNumero1 = cifra3;
                    newNumero2 = cifra2;
                    newNumero3 = cifra1;
                }
            }
            
            
            System.out.println("\n\n");
           
      
    } 
}

