import java.util.Scanner;
public class paercial2 {

    public static void main(String[] args) {
        int n1,n2;
        double m, max;
         Scanner leer = new Scanner(System.in);
         System.out.println("dame el valor numeros 1");
         n1=leer.nextInt();
         System.out.println("dame el valor numeros 2");
         n2=leer.nextInt();
         max=(n1+n2)/2; 
         while (n1 != 9 || n2 != 9){
            System.out.print("Ingresa el siguiente número: ");
            n1 = n2;
            n2 = leer.nextInt();
            
             
            if (n1 == 9 && n2 == 9) break;
             
             m=(n1+n2)/2;

             if (m>max) {
                max=m;
             }

             


            
         }
       System.out.println("medida maxima: "+max);

    }
}
