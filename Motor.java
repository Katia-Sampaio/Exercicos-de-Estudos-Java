package poo;

public class Motor {

    boolean ligado = false;
    boolean porta = true; // porta fechada
    double injecao = 1;

    int giros() {
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(injecao * 3000);
        }
    }
}
