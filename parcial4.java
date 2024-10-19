import java.util.Scanner;

import javax.print.DocFlavor.STRING;
public class parcial4 {
    public static void main(String[] args) {
        String nombre;
        double media;
        double basic,pascal,fortran;
        
         Scanner leer= new Scanner(System.in);
         System.out.println("ingresa los datos del alunno (para terminar escriba ***):");

         
          while (true) {
             System.out.println("ingresa en nombre del alumno");
             nombre=leer.nextLine();

             if (nombre.equals("***")) {
              break; 
             }
             System.out.println("ingresa la nota de basic:");
             basic=leer.nextDouble();

             System.out.println("ingresa la nota de pascal:");
             pascal=leer.nextDouble();

             System.out.println("ingresa la nota de fortran ");
             fortran=leer.nextDouble();
             media=(basic+pascal+fortran)/3;
             System.out.println("la media de "+nombre+" es "+media);

             leer.nextLine();
          }
          System.out.println("fin del listado");
    }
}
