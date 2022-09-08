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
public class Cilindro extends Objeto3D {

    private final double raioBase;
    private final double altura;

    public Cilindro(double x, double y, double z, double raioBase, double altura) throws Exception {
        super(new Ponto3D(x, y, z), "Cilindro");
        this.raioBase = raioBase;
        this.altura = altura;
    }

    private double calcularAreaBase() {
        return Math.PI * Math.pow(this.raioBase, 2);
    }

    private double calcularAreaLateral() {
        return 2 * Math.PI * this.raioBase * this.altura;
    }

    @Override
    public double calcularVolume() {
        return this.calcularAreaBase() * this.altura;
    }

    @Override
    public double calcularArea() {
        return 2 * this.calcularAreaBase() + this.calcularAreaLateral();
    }

    @Override
    public String criarRegistro() {
        String tipo = this.getClass().getTypeName();
        return String.format(Locale.US, "%s;%f;%f;%f;%f;%f", tipo, this.ponto.getX(), this.ponto.getY(), this.ponto.getZ(), this.raioBase, this.altura);
    }

    @Override
    public String toString() {

        String msgPosicao = ponto.toString();
        String msgRaio = String.format("Com raio da base: %f\n", this.raioBase);
        String msgAltura = String.format("Com altura: %f\n", this.altura);
        String msgArea = String.format("Com area: %f\n", this.calcularArea());
        String msgAreaBase = String.format("Com area da base: %f\n", this.calcularAreaBase());
        String msgVolume = String.format("Com volume: %f\n", this.calcularVolume());
        return String.format("%s%s%s%s%s%s", msgPosicao, msgRaio, msgAltura, msgArea, msgAreaBase, msgVolume);
    }

}
