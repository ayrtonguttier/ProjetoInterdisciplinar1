/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ayrtonguttier.projetointerdisciplinar1.geometricos;

/**
 *
 * @author ayrtonguttier
 */
public class Factory {

    public static Objeto2D criarObjeto(String dados) throws Exception {

        String[] valores = dados.split(";");
        if (valores[0].equals(Quadrado.class.getTypeName())) {
            return criarQuadrado(valores[1], valores[2], valores[3]);
        } else if (valores[0].equals(TrianguloRetangulo.class.getTypeName())) {
            return criarTrianguloRetangulo(valores[1], valores[2], valores[3], valores[4]);
        } else {
            throw new Exception("Tipo não reconhecido.");
        }
    }

    public static Quadrado criarQuadrado(String x, String y, String lado) throws Exception {
        if (x.isBlank()) {
            throw new Exception("Posição X do quadrado deve ser informada.");
        }
        if (y.isBlank()) {
            throw new Exception("Posição Y do quadrado deve ser informada.");
        }
        if (lado.isBlank()) {
            throw new Exception("Lado do quadrado deve ser informado.");
        }

        if (!Auxiliar.ehFloat(x)) {
            throw new Exception("Posição X inválida.");
        }

        if (!Auxiliar.ehFloat(y)) {
            throw new Exception("Posição Y inválida.");
        }

        if (!Auxiliar.ehFloat(lado)) {
            throw new Exception("Lado inválido.");
        }

        float fX, fY, fLado;
        fX = Float.parseFloat(x);
        fY = Float.parseFloat(y);
        fLado = Float.parseFloat(lado);

        return new Quadrado(fX, fY, fLado);
    }

    public static TrianguloRetangulo criarTrianguloRetangulo(String x, String y, String base, String altura)
            throws Exception {

        if (x.isBlank()) {
            throw new Exception("Posição X do triângulo deve ser informada.");
        }
        if (y.isBlank()) {
            throw new Exception("Posição Y do triângulo deve ser informada.");
        }
        if (base.isBlank()) {
            throw new Exception("Base do triângulo deve ser informada.");
        }
        if (altura.isBlank()) {
            throw new Exception("Altura do triângulo deve ser informada.");
        }
        if (!Auxiliar.ehFloat(x)) {
            throw new Exception("Posição X inválida.");
        }
        if (!Auxiliar.ehFloat(y)) {
            throw new Exception("Posição Y inválida.");
        }
        if (!Auxiliar.ehFloat(base)) {
            throw new Exception("Base inválida.");
        }
        if (!Auxiliar.ehFloat(altura)) {
            throw new Exception("Altura inválida.");
        }

        float fX = Float.parseFloat(x);
        float fY = Float.parseFloat(y);
        float fBase = Float.parseFloat(base);
        float fAltura = Float.parseFloat(altura);

        return new TrianguloRetangulo(fX, fY, fBase, fAltura);
    }

    public static Objeto3D criarObjeto3D(String dados) throws Exception {
        String[] valores = dados.split(";");
        if (valores[0].equals(ConeReto.class.getTypeName())) {
            return criarConeReto(valores[1], valores[2], valores[3], valores[4], valores[5]);
        } else {
            throw new Exception("Tipo não reconhecido.");
        }
    }

    public static ConeReto criarConeReto(String x, String y, String z, String raioBase, String altura) throws Exception {
        if (x.isBlank()) {
            throw new Exception("Posicão X deve estar preenchida.");
        }
        if (y.isBlank()) {
            throw new Exception("Posicão Y deve estar preenchida.");
        }
        if (z.isBlank()) {
            throw new Exception("Posicão Z deve estar preenchida.");
        }

        if (raioBase.isBlank()) {
            throw new Exception("Raio da base deve estar preenchido.");
        }

        if (altura.isBlank()) {
            throw new Exception("Altura deve estar preenchida.");
        }

        if (!Auxiliar.ehFloat(x)) {
            throw new Exception("Posição X inválida.");
        }
        if (!Auxiliar.ehFloat(y)) {
            throw new Exception("Posição Y inválida.");
        }
        if (!Auxiliar.ehFloat(z)) {
            throw new Exception("Posição Z inválida.");
        }

        if (!Auxiliar.ehFloat(raioBase)) {
            throw new Exception("Raio da base inválido.");
        }
        if (!Auxiliar.ehFloat(altura)) {
            throw new Exception("Altura inválida.");
        }

        float fX, fY, fZ, fRaioBase, fAltura;
        fX = Float.parseFloat(x);
        fY = Float.parseFloat(y);
        fZ = Float.parseFloat(z);
        fRaioBase = Float.parseFloat(raioBase);
        fAltura = Float.parseFloat(altura);

        return new ConeReto(fX, fY, fZ, fRaioBase, fAltura);

    }

}
