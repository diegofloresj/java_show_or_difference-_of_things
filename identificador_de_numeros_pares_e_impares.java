import java.util.Scanner;
public class practica2
{
public static void main (String args [])
   {
   Scanner t=new Scanner(System.in);
   
   System.out.println("Lector de numeros impares o pares\n Introduce un numero para saber si es par o impar");
   
   int num=t.nextInt();
   {
   
   if (num % 2 == 0){
      System.out.println("El numero es par ");
    }else{
 System.out.println("El numero es impar");
    }
    }
  }
}