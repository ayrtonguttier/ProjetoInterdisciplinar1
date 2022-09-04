package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos;

public final class Ponto3D {

    public Ponto3D(float x, float y, float z) throws Exception {
        if (x < 0.) {
            throw new Exception("Lado x deve ser maior que zero.");
        }
        if (y < 0.) {
            throw new Exception("Lado y deve ser maior que zero.");
        }
        if (z < 0.) {
            throw new Exception("O ponto z deve ser maior que zero.");
        }
        this.x = x;
        this.y = y;
        this.z = z;
    }
    private float x;
    private float y;
    private float z;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        String mensagem = "Posição: x=%f y=%f z=%f\n";
        return String.format(mensagem, x, y, z);
    }
}
