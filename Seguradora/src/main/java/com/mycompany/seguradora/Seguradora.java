/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.seguradora;

/**
 *
 * @author alunodev08
 */
public class Seguradora {

    public static void main(String[] args) {
        Modelo modelo1 = new Modelo("Sedan");
        Modelo modelo2 = new Modelo("SUV");
        
        System.out.println("Modelo 1: " + modelo1.getNome());
        System.out.println("Modelo 2: " + modelo2.getNome());
        
        Veiculo veiculo1 = new Veiculo("Sedan", 2022, "Toyota", "Prata", "ABC1234");
        Veiculo veiculo2 = new Veiculo("SUV", 2023, "Honda", "Azul", "XYZ5678");

        System.out.println("\nVeículo 1 - Modelo: " + veiculo1.getNome());
        System.out.println("Ano: " + veiculo1.getAno());
        System.out.println("Marca: " + veiculo1.getMarca());
        System.out.println("Cor: " + veiculo1.getCor());
        System.out.println("Placa: " + veiculo1.getPlaca());

        System.out.println("\nVeículo 2 - Modelo: " + veiculo2.getNome());
        System.out.println("Ano: " + veiculo2.getAno());
        System.out.println("Marca: " + veiculo2.getMarca());
        System.out.println("Cor: " + veiculo2.getCor());
        System.out.println("Placa: " + veiculo2.getPlaca());
        
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-01");
        Cliente cliente2 = new Cliente("Maria Santos", "987.654.321-09");

        System.out.println("\nCliente 1 - Nome: " + cliente1.getNome());
        System.out.println("CPF: " + cliente1.getCpf());

        System.out.println("\nCliente 2 - Nome: " + cliente2.getNome());
        System.out.println("CPF: " + cliente2.getCpf());
        
        Seguro seguro1 = new Seguro(1500.0f, true);
        seguro1.setAssegurados(cliente1);

        Seguro seguro2 = new Seguro(1200.0f, false);
        seguro2.setAssegurados(cliente1);
        seguro2.setAssegurados(cliente2);

        System.out.println("Seguro 1 - Valor: " + seguro1.getValor());
        System.out.println("Vigência: " + seguro1.isVigencia());
        System.out.println("Assegurados:");
        for (Cliente cliente : seguro1.getAssegurados()) {
            System.out.println("Nome: " + cliente.getNome() + ", CPF: " + cliente.getCpf());
        }

        System.out.println("\nSeguro 2 - Valor: " + seguro2.getValor());
        System.out.println("Vigência: " + seguro2.isVigencia());
        System.out.println("Assegurados:");
        for (Cliente cliente : seguro2.getAssegurados()) {
            System.out.println("Nome: " + cliente.getNome() + ", CPF: " + cliente.getCpf());
        }
    }
}
