package Estrategia;

public class EstrategiaSuma implements Estrategia {

    @Override
    public int operar(int[] datos) {
        int suma = 0;
        for (int dato : datos) {
            suma += dato;
        }
        return suma;
    }
}
