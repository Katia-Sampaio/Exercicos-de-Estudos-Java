package poo;

public class Carro {

    Motor motor = new Motor();

    void acelerar() {
        if (motor.injecao < 2.6) {
            motor.injecao += 0.4;
        }
    }

    void frear() {
        if (motor.injecao > 0.5) {
            motor.injecao -= 0.4;

        }

    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }

    boolean portaAberta() {

        if (motor.porta != false) {
            return motor.ligado = false;

        } else {
            return motor.ligado = true;
        }
    }

}
