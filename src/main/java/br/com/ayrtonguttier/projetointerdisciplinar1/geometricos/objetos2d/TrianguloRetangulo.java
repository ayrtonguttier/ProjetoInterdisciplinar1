package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.objetos2d;

import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.pontos.Ponto2D;
import java.util.Locale;

public class TrianguloRetangulo extends Objeto2D {

    private final double base;
    private final double altura;

    public TrianguloRetangulo(double x, double y, double base, double altura) throws Exception {
        super(new Ponto2D(x, y), "Triângulo retângulo");

        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = calcularHipotenusa();
        return hipotenusa + altura + base;
    }

    private double calcularHipotenusa() {
        double qBase = Math.pow(base, 2);
        double qAltura = Math.pow(altura, 2);
        double soma = qBase + qAltura;
        return Math.sqrt(soma);
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
        return String.format(Locale.US, "%s;%f;%f;%f;%f", tipo, x, y, base, altura);
    }

    @Override
    public String getInformacoesFormatadas() {
        String msgPonto = ponto.toString();
        String msgBase = String.format("Com base %f\n", base);
        String msgAltura = String.format("Com altura %f\n", altura);
        String msgArea = String.format("Com area %f\n", calcularArea());
        String msgPerimetro = String.format("Com perímetro %f\n", calcularPerimetro());

        return String.format("Triângulo\n%s%s%s%s%s", msgPonto, msgBase, msgAltura, msgArea, msgPerimetro);
    }
}
