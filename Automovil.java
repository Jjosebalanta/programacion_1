public class Automovil {
    //estableser o generar los atrubutos
    String marca;
    String caja;
    String color;
    double precio;
    //crear el metodo
    public static void main(String[] args) {
        //cresar los objetos pero van tener estados 
        Automovil automovil1 = new Automovil(); 

        // como ya esta creadpo vamos a pas
        automovil1.marca = "renault";
        automovil1.caja = "manual";
        automovil1.color = "negro";
        automovil1.precio = 10000000;

        //visualizar por consola 
        System.out.println("la marca del automovila es: "+automovil1.marca);
        System.out.println("la caja el automovil es: "+automovil1.caja);
        System.out.println("el color de automovil es: "+automovil1.color);
        System.out.println("el precio del automovil es: "+automovil1.precio); 
         
        Automovil automovil2 = new Automovil();

        automovil2.marca = "fiat";
        automovil2.caja = "manual";
        automovil2.color = "rojo";
        automovil2.precio = 2700000;

        System.out.println("la marca del automovila es: "+automovil2.marca);
        System.out.println("la caja el automovil es: "+automovil2.caja);
        System.out.println("el color de automovil es: "+automovil2.color);
        System.out.println("el precio del automovil es: "+automovil2.precio); 
         
        Automovil automovil3 = new Automovil();

        automovil3.marca = "kia";automovil2.marca = "fiat";
        automovil2.caja = "manual";
        automovil2.color = "gris";
        automovil2.precio = 2200000;

        System.out.println("la marca del automovila es: "+automovil3.marca);
        System.out.println("la caja el automovil es: "+automovil3.caja);
        System.out.println("el color de automovil es: "+automovil3.color);
        System.out.println("el precio del automovil es: "+automovil3.precio); 


    }
    
}
