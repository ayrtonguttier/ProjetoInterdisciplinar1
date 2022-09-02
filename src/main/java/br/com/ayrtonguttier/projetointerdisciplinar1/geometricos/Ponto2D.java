package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos;

public abstract class Ponto2D {

    protected float x;
    protected float y;

    public Ponto2D(float x, float y) throws Exception {
        if (x < 0.) {
            throw new Exception("Lado x deve ser maior que zero.");
        }
        if (y < 0.) {
            throw new Exception("Lado y deve ser maior que zero.");
        }

        this.x = x;
        this.y = y;

    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    @Override
    public String toString() {
        String mensagem = "Posição: x=%f y=%f\n";
        return String.format(mensagem, x, y);
    }
}
