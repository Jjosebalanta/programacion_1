public class persona {
    private String nombre;
    private double altura;
    private double peso;
    private int edad;
    public persona (String nombre, double altura, double peso, int edad){
        this.nombre=nombre;
        this.altura=altura;
        this.peso=peso;
        this.edad=edad;
    }
    public void cominar(){
        System.out.println("caminando...");
    }
    public String imc(){
        double indice =peso/(altura*altura);
        String msg ="imc:"+indice;
        return msg;
    }
    public String mayoredad(int edad){
        String msg="";
        if(edad>=18){
            msg="mayor de edad";
        }else{
            msg="menor de edad";
        }
        return msg;
    }
}