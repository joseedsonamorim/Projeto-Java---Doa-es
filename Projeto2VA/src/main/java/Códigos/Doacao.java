/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Códigos;

/**
 *
 * @author joseedson
 */
public class Doacao {
    private double valor;
    private Doador doador;
    private Beneficiario beneficiario;
    
    public Doacao(double valor, Doador doador, Beneficiario beneficiario) {
        this.valor = valor;
        this.doador = doador;
        this.beneficiario = beneficiario;
    }
    
    public double getValor() {
        return this.valor;
    }
    
    public Doador getDoador() {
        return this.doador;
    }
    
    public Beneficiario getBeneficiario() {
        return this.beneficiario;
    }
}