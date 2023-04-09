/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados;

import negocios.Doador;
import negocios.Beneficiario;

/**
 *
 * @author joseedson
 */
public class Doacao {

    private double valor;
    private Doador doador;

    // Armazena uma referência ao objeto Beneficiario que recebeu a doação.
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
