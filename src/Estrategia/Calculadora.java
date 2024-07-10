package Estrategia;


public class Calculadora {

    private Estrategia estrategia;

    public Calculadora(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public int calcular(int[] datos) {
        return estrategia.operar(datos);
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }
}