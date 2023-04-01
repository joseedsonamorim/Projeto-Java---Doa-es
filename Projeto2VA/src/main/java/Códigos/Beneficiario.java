/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Códigos;

import javax.swing.JOptionPane;

/**
 *
 * @author joseedson
 */
public class Beneficiario extends Pessoa {

    /*
        Comentário.
        Comentário.
     */
    
    private double totalRecebido;

    public Beneficiario(String nome) {
        super(nome);
        this.totalRecebido = 0;
    }

    public void recebeDoacao(double valor) {
        this.totalRecebido += valor;
    }

    public void listaDoacoes() {
        JOptionPane.showMessageDialog(null, this.getNome() + " recebeu um total de " + this.totalRecebido + " em doações.");
    }
}
