package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos;

public abstract class Objeto2D {

    protected String descricaoFigura;
    protected Ponto2D posicao;

    public Objeto2D(Ponto2D posicao , String descricaoFigura) throws Exception {

        this.descricaoFigura = descricaoFigura;
    }

    public Ponto2D getPosicao() {
        return posicao;
    }

    public abstract float CalcularArea();

    public abstract float CalcularPerimetro();

    public abstract String CriarRegistro();

}
