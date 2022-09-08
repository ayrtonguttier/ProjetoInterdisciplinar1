package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.objetos2d;

import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.pontos.Ponto2D;

public abstract class Objeto2D {

    protected String descricaoFigura;
    protected Ponto2D ponto;

    public Objeto2D(Ponto2D ponto, String descricaoFigura) throws Exception {
        this.ponto = ponto;
        this.descricaoFigura = descricaoFigura;
    }

    public Ponto2D getPosicao() {
        return ponto;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public abstract String criarRegistro();

}
