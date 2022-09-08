package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.pontos;

public class Ponto2D {

    protected double x;
    protected double y;

    public Ponto2D(double x, double y) throws Exception {
        if (x < 0.) {
            throw new Exception("Lado x deve ser maior que zero.");
        }
        if (y < 0.) {
            throw new Exception("Lado y deve ser maior que zero.");
        }

        this.x = x;
        this.y = y;

    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        String mensagem = "Posição: x=%f y=%f\n";
        return String.format(mensagem, x, y);
    }
}
