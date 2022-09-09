package br.com.ayrtonguttier.projetointerdisciplinar1.equacoes;

import br.com.ayrtonguttier.projetointerdisciplinar1.Auxiliar;
import java.util.Locale;

public class EquacaoSegundoGrau implements Equacao {

    private double a;
    private double b;
    private double c;

    public EquacaoSegundoGrau(String a, String b, String c) throws Exception {

        if (!Auxiliar.ehDouble(a)) {
            throw new Exception("Coefiente a deve ser um número válido");
        }
        if (!Auxiliar.ehDouble(b)) {
            throw new Exception("Coefiente b deve ser um número válido");
        }
        if (!Auxiliar.ehDouble(c)) {
            throw new Exception("Coefiente c deve ser um número válido");
        }

        double da, db, dc;

        da = Double.parseDouble(a);
        db = Double.parseDouble(b);
        dc = Double.parseDouble(c);
        iniciarValores(da, db, dc);

    }

    public EquacaoSegundoGrau(double a, double b, double c) throws Exception {

        iniciarValores(a, b, c);
    }

    private void iniciarValores(double a, double b, double c) throws Exception {
        if (a == 0) {
            throw new Exception("Coeficiente \"a\" não pode ser zero.");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcularDiscriminante() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    @Override
    public double[] calcular() {
        double[] resultado = new double[2];

        double menosB = b * -1;

        resultado[0] = (menosB + Math.sqrt(this.calcularDiscriminante())) / (2 * this.a);
        resultado[1] = (menosB - Math.sqrt(this.calcularDiscriminante())) / (2 * this.a);
        return resultado;

    }

    @Override
    public String getInformacoesFormatadas() {
        double[] resultado = this.calcular();
        String header = "Equação do segundo grau:";
        String comCoeficientes = String.format("Coeficientes: a=%f b=%f c=%f", this.a, this.b, this.c);
        String comDiscriminante = String.format("Discriminante: %f", this.calcularDiscriminante());
        String comResultado;
        if (Double.isNaN(resultado[0]) || Double.isNaN(resultado[1])) {
            comResultado = "Resultado: Equação não possui raízes reais.";
        } else {
            comResultado = String.format("Resultado: [%f, %f]", resultado[0], resultado[1]);
        }
        return String.join("\n", header, comCoeficientes, comDiscriminante, comResultado, "");
    }

    @Override
    public String toString() {
        return getInformacoesFormatadas();
    }

    @Override
    public String criarRegistro() {
        String tipo = this.getClass().getTypeName();
        return String.format(Locale.US, "%s;%f;%f;%f\n", tipo, this.a, this.b, this.c);
    }
}
