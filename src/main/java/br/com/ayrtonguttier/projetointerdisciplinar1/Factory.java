/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ayrtonguttier.projetointerdisciplinar1;

import br.com.ayrtonguttier.projetointerdisciplinar1.equacoes.Equacao;
import br.com.ayrtonguttier.projetointerdisciplinar1.equacoes.EquacaoSegundoGrau;
import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.objetos3d.Objeto3D;
import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.objetos3d.ConeReto;
import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.objetos2d.Objeto2D;
import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.objetos2d.Quadrado;
import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.objetos2d.TrianguloRetangulo;
import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.objetos3d.Cilindro;
import br.com.ayrtonguttier.projetointerdisciplinar1.geometricos.objetos3d.Paralelepipedo;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ayrtonguttier
 */
public class Factory {

    public static final int OBJETO2D = 0;
    public static final int OBJETO3D = 1;
    public static final int EQUACAO = 2;

    public static int getTipo(String linha) {
        String[] dados = linha.split(";");
        try {
            Class c = Class.forName(dados[0]);

            if (Objeto2D.class.isAssignableFrom(c)) {
                return Factory.OBJETO2D;
            }
            if (Objeto3D.class.isAssignableFrom(c)) {
                return Factory.OBJETO3D;
            }
            if (Equacao.class.isAssignableFrom(c)) {
                return Factory.EQUACAO;
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Factory.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }

        return -1;
    }

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

        if (!Auxiliar.ehDouble(x)) {
            throw new Exception("Posição X inválida.");
        }

        if (!Auxiliar.ehDouble(y)) {
            throw new Exception("Posição Y inválida.");
        }

        if (!Auxiliar.ehDouble(lado)) {
            throw new Exception("Lado inválido.");
        }

        double fX, fY, fLado;
        fX = Double.parseDouble(x);
        fY = Double.parseDouble(y);
        fLado = Double.parseDouble(lado);

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
        if (!Auxiliar.ehDouble(x)) {
            throw new Exception("Posição X inválida.");
        }
        if (!Auxiliar.ehDouble(y)) {
            throw new Exception("Posição Y inválida.");
        }
        if (!Auxiliar.ehDouble(base)) {
            throw new Exception("Base inválida.");
        }
        if (!Auxiliar.ehDouble(altura)) {
            throw new Exception("Altura inválida.");
        }

        double fX = Double.parseDouble(x);
        double fY = Double.parseDouble(y);
        double fBase = Double.parseDouble(base);
        double fAltura = Double.parseDouble(altura);

        return new TrianguloRetangulo(fX, fY, fBase, fAltura);
    }

    public static Objeto3D criarObjeto3D(String dados) throws Exception {
        String[] valores = dados.split(";");
        if (valores[0].equals(ConeReto.class.getTypeName())) {
            return criarConeReto(valores[1], valores[2], valores[3], valores[4], valores[5]);
        } else if (valores[0].equals(Paralelepipedo.class.getTypeName())) {
            return criarParalelepipedo(valores[1], valores[2], valores[3], valores[4], valores[5], valores[6]);
        } else if (valores[0].equals(Cilindro.class.getTypeName())) {
            return criarCilindro(valores[1], valores[2], valores[3], valores[4], valores[5]);
        } else {
            throw new Exception("Tipo não reconhecido.");
        }
    }

    public static ConeReto criarConeReto(String x, String y, String z, String raioBase, String altura) throws Exception {

        lancaErroSePosicaoForInvalida(x, y, z);

        if (raioBase.isBlank()) {
            throw new Exception("Raio da base deve estar preenchido.");
        }

        if (altura.isBlank()) {
            throw new Exception("Altura deve estar preenchida.");
        }

        if (!Auxiliar.ehDouble(raioBase)) {
            throw new Exception("Raio da base inválido.");
        }
        if (!Auxiliar.ehDouble(altura)) {
            throw new Exception("Altura inválida.");
        }

        double fX, fY, fZ, fRaioBase, fAltura;
        fX = Double.parseDouble(x);
        fY = Double.parseDouble(y);
        fZ = Double.parseDouble(z);
        fRaioBase = Double.parseDouble(raioBase);
        fAltura = Double.parseDouble(altura);

        return new ConeReto(fX, fY, fZ, fRaioBase, fAltura);

    }

    public static Paralelepipedo criarParalelepipedo(String x, String y, String z, String a, String b, String c) throws Exception {

        lancaErroSePosicaoForInvalida(x, y, z);

        if (a.isBlank()) {
            throw new Exception("Aresta A deve ser preenchida.");
        }
        if (b.isBlank()) {
            throw new Exception("Aresta B deve ser preenchida.");
        }
        if (c.isBlank()) {
            throw new Exception("Aresta C deve ser preenchida.");
        }

        if (!Auxiliar.ehDouble(a)) {
            throw new Exception("Aresta A inválida.");
        }
        if (!Auxiliar.ehDouble(b)) {
            throw new Exception("Aresta B inválida.");
        }
        if (!Auxiliar.ehDouble(c)) {
            throw new Exception("Aresta C inválida.");
        }

        double dx, dy, dz, da, db, dc;

        dx = Double.parseDouble(x);
        dy = Double.parseDouble(y);
        dz = Double.parseDouble(z);
        da = Double.parseDouble(a);
        db = Double.parseDouble(b);
        dc = Double.parseDouble(c);

        return new Paralelepipedo(dx, dy, dz, da, db, dc);
    }

    public static Cilindro criarCilindro(String x, String y, String z, String raioBase, String altura) throws Exception {
        lancaErroSePosicaoForInvalida(x, y, z);

        if (raioBase.isBlank()) {
            throw new Exception("Raio da base deve ser preenchido.");
        }
        if (altura.isBlank()) {
            throw new Exception("Altura deve ser preenchida.");
        }

        double dx, dy, dz, dRaio, dAltura;
        dx = Double.parseDouble(x);
        dy = Double.parseDouble(y);
        dz = Double.parseDouble(z);
        dRaio = Double.parseDouble(raioBase);
        dAltura = Double.parseDouble(altura);
        return new Cilindro(dx, dy, dz, dRaio, dAltura);

    }

    private static void lancaErroSePosicaoForInvalida(String x, String y, String z) throws Exception {
        if (x.isBlank()) {
            throw new Exception("Posicão X deve estar preenchida.");
        }
        if (y.isBlank()) {
            throw new Exception("Posicão Y deve estar preenchida.");
        }
        if (z.isBlank()) {
            throw new Exception("Posicão Z deve estar preenchida.");
        }

        if (!Auxiliar.ehDouble(x)) {
            throw new Exception("Posição X inválida.");
        }
        if (!Auxiliar.ehDouble(y)) {
            throw new Exception("Posição Y inválida.");
        }
        if (!Auxiliar.ehDouble(z)) {
            throw new Exception("Posição Z inválida.");
        }

    }

    public static Equacao criarEquacao(String linha)
            throws Exception {

        String[] dados = linha.split(";");
        if (EquacaoSegundoGrau.class.getTypeName().equals(dados[0])) {
            return new EquacaoSegundoGrau(dados[1], dados[2], dados[3]);
        }

        throw new Exception("Tipo de equação não reconhecido.");
    }

}
