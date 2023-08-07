/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seguradora;

/**
 *
 * @author alunodev08
 */
public class Veiculo extends Modelo {
    //Atributos
    private int ano;
    private String marca;
    private String cor;
    private String placa;
    
    //Construtor
    public Veiculo(String nome, int ano, String marca, String cor, String placa){
        super(nome);
        this.ano = ano;
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
    }
    
    //Métodos
    public String getPlaca(){
        return placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
}
