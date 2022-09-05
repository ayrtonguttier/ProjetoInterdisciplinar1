package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos;

public abstract class Objeto3D {

    protected String descricaoFigura;
    protected Ponto3D posicao;

    public Objeto3D(Ponto3D posicao, String descricaoFigura) throws Exception {
        this.posicao = posicao;
        this.descricaoFigura = descricaoFigura;
    }

    public abstract float calcularVolume();
    public abstract float calcularArea();

}
