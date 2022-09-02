package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos;

public abstract class Ponto3D extends Ponto2D {

    public Ponto3D(float x, float y, float z) throws Exception {
        super(x, y);
        if (z < 0.) {
            throw new Exception("O ponto z deve ser maior que zero.");
        }

        this.z = z;
    }

    private float z;

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
