/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.garanhuns.sg.model.pojo.enumarador;

/**
 *
 * @author Herikles
 */
public enum Status {
    FILA(0, "Fila"),
    AGENDADO(1, "Agendado"),
    CANSELADO(2, "Cancelado");

    private int valor;
    private String nome;

    private Status(int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public int getValor() {
        return this.valor;
    }

    public String getNome() {
        return this.nome;
    }
}
