package Clase_6;

public class Clase_6 {

    public static void main(String[] args) {

        double A = 10, B = 5, C = 10, D = 5, E= 1 , F = 2, G= 10 , H=5;
        Calculadora AB = new Calculadora();

        System.out.println("Multiplicacion: " + AB.multiplicar(E,F));
        
        System.out.println("Suma: " + AB.sumar(A,B));
        System.out.println("Resta: " + AB.restar(C,D));
        
        System.out.println("Division: " + AB.dividir(G,H));

    }

}
