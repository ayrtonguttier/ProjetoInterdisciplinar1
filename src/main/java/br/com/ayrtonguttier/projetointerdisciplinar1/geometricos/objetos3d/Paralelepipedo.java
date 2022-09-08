/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.objetos3d;

import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.pontos.Ponto3D;
import java.util.Locale;

/**
 *
 * @author ayrtonguttier
 */
public class Paralelepipedo extends Objeto3D {

    private final double arestaA;
    private final double arestaB;
    private final double arestaC;

    public Paralelepipedo(double x, double y, double z, double arestaA, double arestaB, double arestaC) throws Exception {
        super(new Ponto3D(x, y, z), "Paralelepípedo");
        this.arestaA = arestaA;
        this.arestaB = arestaB;
        this.arestaC = arestaC;
    }

    @Override
    public double calcularVolume() {
        return this.arestaA * this.arestaB * this.arestaC;
    }

    @Override
    public double calcularArea() {

        return (2 * this.arestaA * this.arestaB)
                + (2 * this.arestaB * this.arestaC)
                + (2 * this.arestaA * this.arestaC);
    }

    @Override
    public String toString() {
        return getInformacoesFormatadas();
    }

    @Override
    public String criarRegistro() {
        String tipo = this.getClass().getTypeName();
        return String.format(Locale.US, "%s;%f;%f;%f;%f;%f;%f", tipo, this.ponto.getX(), this.ponto.getY(), this.ponto.getZ(), this.arestaA, this.arestaB, this.arestaC);

    }

    @Override
    public String getInformacoesFormatadas() {
        String msgForma = String.format("%s:\n", this.descricaoFigura);
        String msgPosicao = this.ponto.toString();
        String msgArestas = String.format("Com arestas: %f %f %f\n", this.arestaA, this.arestaB, this.arestaC);
        String msgAreaTotal = String.format("Com area total: %f\n", this.calcularArea());
        String msgVolume = String.format("Com volume: %f\n", this.calcularVolume());

        return String.format("%s%s%s%s%s", msgForma, msgPosicao, msgArestas, msgAreaTotal, msgVolume);
    }

}
