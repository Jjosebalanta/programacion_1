import java.util.Scanner;
public class parcial6 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int contadorDias = 0;
        double sumaMaxima = 0.0;
        double sumaMinima = 0.0;
        int contadorErrores = 0;
        while (true) {
            
            System.out.print("Ingrese la temperatura máxima del día (0,0 para terminar): ");
            double temperaturaMaxima = leer.nextDouble();
            System.out.print("Ingrese la temperatura mínima del día: ");
            double temperaturaMinima = leer.nextDouble();

            if (temperaturaMaxima == 0 && temperaturaMinima == 0) {
                break; 
            }
        }
    }
}        