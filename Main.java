package poo;

public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        System.out.println("O carro esta ligado?\n" + c1.estaLigado());

        c1.ligar();
        System.out.println("O carro esta ligado?\n" + c1.estaLigado());

        System.out.println("A porta esta aberta?   " + c1.portaAberta());

        // System.out.println("O motor esta ligado?" );

        System.out.println("Giros do motor = " + c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println("Giros do motor = " + c1.motor.giros());
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        System.out.println("Giros do motor = " + c1.motor.giros());

    }

}
