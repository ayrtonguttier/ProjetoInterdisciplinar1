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
    public float CalcularVolume() {
        float geratriz = CalcularGeratriz();

        float areaDaBase = CalcularAreaDaBase();

        double areaTotal = areaDaBase + (Math.PI * raioBase * geratriz);

        return (float) areaTotal;
    }

    @Override
    public float CalcularArea() {
        //Em que a área difere do volume?
        //Calcular area da base???        
        return CalcularAreaDaBase();
    }

    private float CalcularAreaDaBase() {
        return (float) (Math.PI * Math.pow(raioBase, 2));
    }

    private float CalcularGeratriz() {
        double qAltura = Math.pow(altura, 2);
        double qRaio = Math.pow(raioBase, 2);
        double resultado = Math.sqrt(qAltura + qRaio);
        return (float) resultado;

    }

}
