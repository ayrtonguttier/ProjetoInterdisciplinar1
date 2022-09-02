package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos;

public abstract class Objeto2D extends Ponto2D {

    protected String descricaoFigura;

    public Objeto2D(float x, float y, String descricaoFigura) throws Exception {
        super(x, y);
        this.descricaoFigura = descricaoFigura;
    }

    public abstract float CalcularArea();

    public abstract float CalcularPerimetro();
    
    public abstract String CriarRegistro();

}
