package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.pontos;

public class Ponto3D extends Ponto2D{
    
    protected double z;
    
    public Ponto3D(double x, double y, double z) throws Exception {
        super(x, y);        
        if (z < 0.) {
            throw new Exception("O ponto z deve ser maior que zero.");
        }        
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        String mensagem = "Posição: x=%f y=%f z=%f\n";
        return String.format(mensagem, x, y, z);
    }
}
