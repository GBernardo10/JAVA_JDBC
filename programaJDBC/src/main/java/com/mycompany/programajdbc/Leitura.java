/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.programajdbc;

import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Leitura {

    private int id;
    private String origem;
    private double valor;
    private Date dataHora;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "Leitura{" + "id=" + id + ", origem=" + origem + ", valor=" + valor + ", dataHora=" + dataHora + '}';
    }

}
