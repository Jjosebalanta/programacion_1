import java.util.Scanner;

public class ejercicio56 {

    public static void main(String[] args) {
        int aprobado = 0, noaprobados = 0;
        // notas de los estudiantes
        Scanner leer = new Scanner(System.in);
        System.out.println("digute cantidad de estudientes:");
        int estudiantes = leer.nextInt();
        double nota = 0.0;
        for (int i = 1; i <= estudiantes; i++) {
            System.out.println("nota del estudiante" + i + ":");
            nota = leer.nextDouble();
            if (nota >= 3.0) {
                aprobado++;
            } else {
                noaprobados++;
            }

        }

        System.out.println("aprobados:" + aprobado );
        System.out.println(" no aprobados:" + noaprobados);

    }
}