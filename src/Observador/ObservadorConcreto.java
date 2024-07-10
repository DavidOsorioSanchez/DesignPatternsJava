package Observador;

public class ObservadorConcreto implements Observador {

    @Override
    public void actualizar(Sujeto sujeto) {
        SujetoConcreto sujetoConcreto = (SujetoConcreto) sujeto;
        System.out.println("El estado ha cambiado a: " + sujetoConcreto.getEstado());
    }
}
