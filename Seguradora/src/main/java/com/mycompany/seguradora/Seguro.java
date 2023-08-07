/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seguradora;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author alunodev08
 */
public class Seguro {
    private float valor;
    private boolean vigencia;
    private List<Cliente> assegurados;

    public Seguro(float valor, boolean vigencia) {
        this.valor = valor;
        this.vigencia = vigencia;
        this.assegurados = new ArrayList<>();
    }

    public float getValor() {
        return valor;
    }

    public List<Cliente> getAssegurados() {
        return assegurados;
    }

    public void setAssegurados(Cliente cliente) {
        assegurados.add(cliente);
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    } 
}
