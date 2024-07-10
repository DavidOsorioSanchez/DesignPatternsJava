package Observador;

import java.util.ArrayList;
import java.util.List;


public class SujetoConcreto implements Sujeto {

    private List<Observador> observadores = new ArrayList<>();
    private String estado;

    public void registrarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar(this);
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notificarObservadores();
    }
}


