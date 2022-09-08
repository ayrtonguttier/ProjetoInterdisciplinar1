package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.objetos2d;

import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.pontos.Ponto2D;
import java.util.Locale;

public class Quadrado extends Objeto2D {

    private double lado;

    public Quadrado(double x, double y, double lado) throws Exception {
        super(new Ponto2D(x, y), "Quadrado");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }

    @Override
    public String toString() {
        return getInformacoesFormatadas();
    }

    @Override
    public String criarRegistro() {
        String tipo = this.getClass().getTypeName();
        double x, y;
        x = ponto.getX();
        y = ponto.getY();
        return String.format(Locale.US, "%s;%f;%f;%f", tipo, x, y, lado);
    }

    @Override
    public String getInformacoesFormatadas() {
        String msgSuper = ponto.toString();
        String msgLado = String.format("Com lado %f\n", this.lado);
        String msgArea = String.format("Com área %f\n", calcularArea());
        String msgPerimetro = String.format("Com perímetro %f\n", calcularPerimetro());

        return String.format("Quadrado:\n%s%s%s%s", msgSuper, msgLado, msgArea, msgPerimetro);
    }
}
