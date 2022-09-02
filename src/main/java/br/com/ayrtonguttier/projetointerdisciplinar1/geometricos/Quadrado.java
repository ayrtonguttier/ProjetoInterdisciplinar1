package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos;

import java.util.Locale;

public class Quadrado extends Objeto2D {

    private float lado;

    public Quadrado(float x, float y, float lado) throws Exception {
        super(x, y, "Quadrado");
        this.lado = lado;
    }

    @Override
    public float CalcularArea() {
        return lado * lado;
    }

    @Override
    public float CalcularPerimetro() {
        return lado * 4;
    }

    @Override
    public String toString() {
        String msgSuper = super.toString();
        String msgLado = String.format("Com lado %f\n", this.lado);
        String msgArea = String.format("Com área %f\n", CalcularArea());
        String msgPerimetro = String.format("Com perímetro %f\n", CalcularPerimetro());

        return String.format("Quadrado:\n%s%s%s%s", msgSuper, msgLado, msgArea, msgPerimetro);
    }

    @Override
    public String CriarRegistro() {        
        return String.format(Locale.US, "quadrado;%f;%f;%f", x, y, lado);
    }
}
