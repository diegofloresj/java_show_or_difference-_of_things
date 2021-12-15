public class Tienda_ropa {
 public static void main(String args[]){
   
    double iva = 0.21;
    double precio1 = 250.00;
    double precio2 = 350.00;
    double precio3 = 450.00;
    double precio4 = 899.99;
    double precio5 = 1850.00;
      
       double resultado1 = (precio1 * iva + precio1);
       double resultado2 = (precio2 * iva + precio2);
       double resultado3 = (precio3 * iva + precio3);
       double resultado4 = (precio4 * iva + precio4);
       double resultado5 = (precio5 * iva + precio5);
       
         System.out.println("Camisa............$450.00  + 21% de IVA........" + "$"+resultado1);
         System.out.println("\nCincho............$250.00  + 21% de IVA........" + "$"+resultado2);
         System.out.println("\nJeans.............$350.00  + 21% de IVA........" + "$"+resultado3);
         System.out.println("\nCazadora..........$1850.00 + 21% de IVA........" + "$"+resultado4);
         System.out.println("\nChamarra..........$899.99  + 21% de IVA........" + "$"+resultado5);
         
          double resultado6 = ((precio1 +  precio2 + precio3 +precio4 + precio5)/5); 
           System.out.println("\nLa media es: " + resultado6);
   }
}