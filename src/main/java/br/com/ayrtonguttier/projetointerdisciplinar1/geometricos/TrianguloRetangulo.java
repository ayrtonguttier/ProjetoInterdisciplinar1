package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos;

import java.util.Locale;

public class TrianguloRetangulo extends Objeto2D {

    private final float base;
    private final float altura;

    public TrianguloRetangulo(float x, float y, float base, float altura) throws Exception {
        super(new Ponto2D(x, y), "Triângulo retângulo");

        this.base = base;
        this.altura = altura;
    }

    @Override
    public float CalcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public float CalcularPerimetro() {
        float hipotenusa = CalcularHipotenusa();
        return hipotenusa + altura + base;
    }

    private float CalcularHipotenusa() {
        double qBase = Math.pow(base, 2);
        double qAltura = Math.pow(altura, 2);
        double soma = qBase + qAltura;
        return (float) Math.sqrt(soma);
    }

    @Override
    public String toString() {
        String msgSuper = super.toString();
        String msgBase = String.format("Com base %f\n", base);
        String msgAltura = String.format("Com altura %f\n", altura);
        String msgArea = String.format("Com area %f\n", CalcularArea());
        String msgPerimetro = String.format("Com perímetro %f\n", CalcularPerimetro());

        return String.format("Triângulo\n%s%s%s%s%s", msgSuper, msgBase, msgAltura, msgArea, msgPerimetro);
    }

    @Override
    public String CriarRegistro() {
        String tipo = this.getClass().getTypeName();
        float x, y;
        x = posicao.getX();
        y = posicao.getY();
        return String.format(Locale.US, "%s;%f;%f;%f;%f", tipo, x, y, base, altura);
    }
}
