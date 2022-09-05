/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos;

/**
 *
 * @author ayrtonguttier
 */
public class ConeReto extends Objeto3D {

    private final float raioBase;
    private final float altura;

    public ConeReto(float x, float y, float z, float raioBase, float altura) throws Exception {
        super(new Ponto3D(x, y, z), "Cone reto");
        this.raioBase = raioBase;
        this.altura = altura;
    }

    @Override
    public float calcularVolume() {
        float geratriz = calcularGeratriz();

        float areaDaBase = calcularAreaDaBase();

        double areaTotal = areaDaBase + (Math.PI * raioBase * geratriz);

        return (float) areaTotal;
    }

    @Override
    public float calcularArea() {
        //Em que a área difere do volume?
        //Calcular area da base???        
        return calcularAreaDaBase();
    }

    private float calcularAreaDaBase() {
        return (float) (Math.PI * Math.pow(raioBase, 2));
    }

    private float calcularGeratriz() {
        double qAltura = Math.pow(altura, 2);
        double qRaio = Math.pow(raioBase, 2);
        double resultado = Math.sqrt(qAltura + qRaio);
        return (float) resultado;
    }

    @Override
    public String toString() {

        String msgPosicao = this.posicao.toString();
        String msgRaioBase = String.format("Com raio da base: %f\n", this.raioBase);
        String msgAltura = String.format("Com altura: %f\n", this.altura);
        String msgAreaBase = String.format("Com área da base: %f\n", this.calcularArea());
        String msgGeratriz = String.format("Com geratriz: %f\n", this.calcularGeratriz());
        String msgVolume = String.format("Com volume: %f\n", this.calcularVolume());

        return String.format("Cone Reto:\n%s%s%s%s%s%s", msgPosicao, msgRaioBase, msgAltura, msgAreaBase, msgGeratriz, msgVolume);

    }

}
