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
public class ConeReto extends Objeto3D {

    private final double raioBase;
    private final double altura;

    public ConeReto(double x, double y, double z, double raioBase, double altura) throws Exception {
        super(new Ponto3D(x, y, z), "Cone reto");
        this.raioBase = raioBase;
        this.altura = altura;
    }

    @Override
    public double calcularVolume() {
        return (Math.PI * Math.pow(this.raioBase, 2) * this.altura) / 3;
    }

    @Override
    public double calcularArea() {
        double geratriz = calcularGeratriz();
        return (Math.PI * this.raioBase * (geratriz + this.raioBase));
    }

    private double calcularAreaDaBase() {
        return (Math.PI * Math.pow(raioBase, 2));
    }

    private double calcularGeratriz() {
        double qAltura = Math.pow(altura, 2);
        double qRaio = Math.pow(raioBase, 2);
        double resultado = Math.sqrt(qAltura + qRaio);
        return resultado;
    }

    @Override
    public String toString() {

        String msgPosicao = this.ponto.toString();
        String msgRaioBase = String.format("Com raio da base: %f\n", this.raioBase);
        String msgAltura = String.format("Com altura: %f\n", this.altura);
        String msgAreaTotal = String.format("Com área total: %f\n", this.calcularArea());
        String msgGeratriz = String.format("Com geratriz: %f\n", this.calcularGeratriz());
        String msgVolume = String.format("Com volume: %f\n", this.calcularVolume());

        return String.format("Cone Reto:\n%s%s%s%s%s%s", msgPosicao, msgRaioBase, msgAltura, msgAreaTotal, msgGeratriz, msgVolume);

    }

    @Override
    public String criarRegistro() {
        String tipo = this.getClass().getTypeName();
        return String.format(Locale.US, "%s;%f;%f;%f;%f;%f",
                tipo,
                this.ponto.getX(),
                this.ponto.getY(),
                this.ponto.getZ(),
                this.raioBase,
                this.altura);

    }

}
