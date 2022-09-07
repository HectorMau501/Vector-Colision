
package Programa2;

import java.util.Scanner;


public class Vector
{

    public static void main(String [] args)
    {
        
        Scanner entrada = new Scanner(System.in);
         
        int numeroIni1, numeroIni2, numeroIni3;
         
        int ceros = 0; // Para añadir ceros 
       
        int numero = 1; //Esta sirve para comprobar que todos sean 1 en los if
        
        int cifra1, cifra2, cifra3; 
        
        int opcion = 0; 
        
        
        System.out.println("\t\tHector Mauricio Rodriguez Salazar 21310416");
        System.out.println("\t\tPrograma para el calculo del Vector resultante a travez del Vector Colision");
        
        while(opcion == 0)
        {
            
            System.out.println("\n\tIngrese las cifras a partir de derecha a izquierda.");
            System.out.println("Ingrese el numero 1: ");
            numeroIni1=entrada.nextInt();
            System.out.println("Ingrese el numero 2: ");
            numeroIni2=entrada.nextInt();
            System.out.println("Ingrese el numero 3: ");
            numeroIni3=entrada.nextInt();
            System.out.println("Numero ingresado: "+numeroIni3+""+numeroIni2+""+numeroIni1);
            System.out.println("\n");
            
            cifra1=numeroIni1;
            cifra2=numeroIni2;
            cifra3=numeroIni3;

            //PARA LA PRIMER CIFRA
            for(int i=1;i<5;i++)
            {
                System.out.println("Desarrollo de la cifra 1: ");
                System.out.println("Paso "+i+"\n"+numeroIni3+""+numeroIni2+""+numeroIni1);
                System.out.println(ceros+""+numeroIni3+""+numeroIni2+"0");

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
            }
            
            System.out.println("\n\n");

            //PARA LA SEGUNDA CIFRA
            for(int i=1 ; i<5; i++)
            {
                System.out.println("Desarrollo de la cifra 2: ");
                System.out.println("Paso "+i+"\n"+numeroIni3+""+numeroIni2+""+numeroIni1);
                System.out.println(ceros+""+ceros+""+numeroIni3+"");
               
                cifra1=numeroIni1+numeroIni3;
                cifra2=numeroIni2+ceros;
                cifra3=numeroIni3+ceros;
                
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
            }
            
            System.out.println("\n\n");
           
            //PARA LA tercera CIFRA
            for(int i=1;i<5;i++)
            {
                System.out.println("Desarrollo de la cifra 3: ");
                System.out.println("Paso "+i+"\n"+numeroIni3+""+numeroIni2+""+numeroIni1);
                System.out.println(ceros+""+ceros+""+ceros+"");
                cifra1=numeroIni1+ceros;
                cifra2=numeroIni2+ceros;
                cifra3=numeroIni3+ceros;
                
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
            }
            
            System.out.println("Desea volver a repetir el ciclo presione el numero 0 sino presione cualquier otro numero?");
            opcion = entrada.nextInt();
        } 
    }
}
