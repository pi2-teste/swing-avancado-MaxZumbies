/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.aula5;

/**
 *
 * @author gabriel.max
 */
public class Computador {

    private String tipoComputador;
    private String sistemaOperacional;
    private String hd;
    private String[] acessorios;
    private String[] serviços;
    public static String fabricante = "Gabriel Max";

    public Computador() {
    }

    ;

    public String getTipoComputador() {
        return tipoComputador;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public String getHd() {
        return hd;
    }

    public String[] getAcessorios() {
        return acessorios;
    }

    public String[] getServiços() {
        return serviços;
    }

    public static String getFabricante() {
        return fabricante;
    }

    public void setTipoComputador(String tipoComputador) {
        this.tipoComputador = tipoComputador;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public void setAcessorios(String[] acessorios) {
        this.acessorios = acessorios;
    }

    public void setServiços(String[] serviços) {
        this.serviços = serviços;
    }

    public static void setFabricante(String fabricante) {
        Computador.fabricante = fabricante;
    }

}
