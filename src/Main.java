public class Main {
    public static void main(String[] args) {
        sumar(5,10,20);
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.numeroDePuertas);
    }
    public static int sumar(int a, int b, int c){
        return a + b + c;
    }
}

class Coche {
    public int numeroDePuertas = 4;

    public void incrementarPuertas(){
        this.numeroDePuertas++;
    }
}