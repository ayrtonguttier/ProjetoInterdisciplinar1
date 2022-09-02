package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos;

import java.util.Locale;

public class TrianguloRetangulo extends Objeto2D {

    private final float base;
    private final float altura;

    public TrianguloRetangulo(float x, float y, float base, float altura) throws Exception {
        super(x, y, "Triângulo");

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
        return String.format(Locale.US, "trianguloretangulo;%f;%f;%f;%f", x, y, base, altura);
    }

    @Override
    public boolean equals(Object obj) {
        boolean ehDoTipoCerto = obj instanceof TrianguloRetangulo;
        if (!ehDoTipoCerto) {
            return false;
        }

        TrianguloRetangulo t = (TrianguloRetangulo) obj;
        return t.hashCode() == this.hashCode();

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Float.floatToIntBits(this.base);
        hash = 71 * hash + Float.floatToIntBits(this.altura);
        hash = 71 * hash + Float.floatToIntBits(this.x);
        hash = 71 * hash + Float.floatToIntBits(this.y);
        return hash;
    }

}
