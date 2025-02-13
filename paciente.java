import java.util.Scanner;
public class paciente {
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     String nombre= "";
     String apellido = "";
     String eps = "";
     double peso = 0;
     double altura =0;
     double azucarensangre = 0;
     double imc = 0;
     int edad = 0;
     long tiempoinicio = 0;
     long tiempofinal = 0;
     long tiempoejecucion = 0;

     //solicitud almasenamiento 
     System.out.println("ingrese el primer nombre: ");
     nombre = leer.nextLine ();
     System.out.println("ingrese el primer apellido: ");
     apellido = leer.nextLine();
     System.out.println("ingrese el nombre de la epa");
     eps = leer.nextLine();

     System.out.println("USUARIO INGRSE EL PESO (UTILISE UN SEPARADOR) :");
     peso = leer.nextDouble();
     System.out.println();


        
    }
    
}
