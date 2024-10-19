
import java.util.Scanner;

public class parcial5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        
        int contadorA=0;
        int contadorB=0 ;
        double totalA=0.0 ;
        double totalB =0.0;
        double precioUnitario;
        String codigoArticulo;
        int numeroArticulos; 
        while (true) {
            System.out.print("Ingrese el código del artículo (A/B) o 'X' para terminar: ");
            codigoArticulo = leer.nextLine();

            if (codigoArticulo.equals("X")) {
                break; 
            }

           
            System.out.print("Ingrese el precio unitario: ");
             precioUnitario = leer.nextDouble();
            System.out.print("Ingrese el número de artículos: ");
            System.out.println("precio del articulo A "); 
            numeroArticulos = leer.nextInt();
            leer.nextLine();

            
            if (codigoArticulo.equals("A")) {
                contadorA += numeroArticulos;
                totalA += precioUnitario * numeroArticulos;
            } else if (codigoArticulo.equals("B")) {
                contadorB += numeroArticulos;
                totalB += precioUnitario * numeroArticulos;
            } else {
                System.out.println("Código de artículo inválido. Intente de nuevo.");
            }
        }

        System.out.println("Número total de artículos A: " + contadorA);
        System.out.println("Importe total de artículos A: " + totalA);
        System.out.println("Número total de artículos B: " + contadorB);
        System.out.println("Importe total de artículos B: " + totalB);

        
    }
}
