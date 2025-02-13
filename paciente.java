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
     System.out.print("ingrese el primer nombre: ");
     nombre = leer.nextLine ();
     System.out.print("ingrese el primer apellido: ");
     apellido = leer.nextLine();
     System.out.print("ingrese el nombre de la epa");
     eps = leer.nextLine();

     System.out.print("USUARIO INGRSE EL PESO (UTILISE UN SEPARADOR) :");
     peso = leer.nextDouble();
     System.out.print("USUARIO INGRESE LA ALTURA (UTILISE SEPARADOR) : ");
     altura = leer.nextDouble();
     System.out.print("USUARIO ENGRESE AZUCAR EN SANGRE(dg / ml): ");
     azucarensangre = leer.nextDouble();
     System.out.println(" La edad del paciente es: ");
     edad = leer.nextInt();
     
     //medir tiempo de inicio (antes de resolvel una operacion ecuacion)
     tiempoinicio = System.nanoTime();
      
     //calcular imc
     imc = (peso)/(altura*altura);

     tiempofinal = System.nanoTime();
     tiempoejecucion = (tiempofinal)-(tiempoinicio); 
     //
     System.out.println("DATOS DEL PACIENTA: ");
     System.out.println("El nombre del paciente es: "+nombre+" El nivel de azucar del pacienta es: "+azucarensangre);
     System.out.println(" El primer nombre del paciente es: "+apellido);
     System.out.println(" La eps del paciente es: "+eps);
     System.out.println(" El peso de usuario es de: "+peso);
     System.out.println(" La altura de paciente es de: "+altura);
     System.out.println(" El nivel de azucar del pacienta es: "+azucarensangre);
     System.out.println(" El imc del pacienta es: "+imc);
     System.out.println(" La edad de paciente es: "+edad);
     System.out.println(tiempofinal);
     System.out.println(tiempofinal);
     System.out.println(tiempoejecucion);
        
    }
    
}
