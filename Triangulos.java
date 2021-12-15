import java.util.Scanner;
   public class Triangulos{ 
   public static void main(String[] args){ 
      Scanner t=new Scanner (System.in);
      
      int l1, l2, l3;
      
         System.out.println("valor del lado 1");
            l1=t.nextInt();
         System.out.println("valor del lado 2");
            l2=t.nextInt();
         System.out.println("valor del lado 3");
            l3=t.nextInt();
      
      if ((l1 == l2)&&(l2 == l3))
         System.out.println("El trinagulo es equilatero");

      if ((l1==l2)&&(l2!=l3)||(l2==l3)&&(l3!=l1)||(l1==l3)&&(l3!=l2))
         System.out.println("El trinagulo es isoceles");

      if ((l1!=l2)&&(l1!=l3)&&(l2!=l3)&&(l2!=l1)&&(l3!=l2)&&(l3!=l1))
         System.out.println("El trinagulo es escaleno");
   }
} 
