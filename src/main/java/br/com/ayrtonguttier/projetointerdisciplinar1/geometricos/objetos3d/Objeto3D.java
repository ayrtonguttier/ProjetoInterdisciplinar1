package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.objetos3d;

import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.pontos.Ponto3D;
import br.com.ayrtonguttier.projetointerdisciplinar1.Descritivo;
import br.com.ayrtonguttier.projetointerdisciplinar1.Registro;

public abstract class Objeto3D implements Descritivo, Registro {

    protected String descricaoFigura;
    protected Ponto3D ponto;

    public Objeto3D(Ponto3D ponto, String descricaoFigura) throws Exception {
        this.ponto = ponto;
        this.descricaoFigura = descricaoFigura;
    }

    public abstract double calcularVolume();

    public abstract double calcularArea();

    public abstract String criarRegistro();

    @Override
    public abstract String getInformacoesFormatadas();

}
