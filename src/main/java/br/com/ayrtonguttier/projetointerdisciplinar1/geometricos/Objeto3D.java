package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos;

public abstract class Objeto3D extends Ponto3D {

    protected String descricaoFigura;

    public Objeto3D(float x, float y, float z, String descricaoFigura) throws Exception {
        super(x, y, z);
        this.descricaoFigura = descricaoFigura;
    }

    public abstract float CalcularVolume();

}
