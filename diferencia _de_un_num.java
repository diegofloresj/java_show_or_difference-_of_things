import java.util.Scanner;
public class practica1
{
public static void main (String args [])
   {
   Scanner t=new Scanner(System.in);
   System.out.println("Bienvenido\n introduce dos numeros para saber si estos son iguales o si uno es mayor que otro.");
   
   int num1=t.nextInt();
   int num2=t.nextInt();
   
   if (num1 == num2){
      System.out.println("Ambos numeros son iguales");
    }
    else{
    }
  
   if (num1>num2){
      System.out.println("El numero 1 es mayor");
    }
    else{
    }
    
   if (num1<num2){
      System.out.println("El numero 2 es mayor");
    }
    else{
    }
    
   }
}