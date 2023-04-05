/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Códigos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author joseedson
 */
public class Sistema {

    private ArrayList<Doacao> doacoes;
    private ArrayList<Pessoa> pessoas;

    public Sistema() {
        this.doacoes = new ArrayList<Doacao>();
        this.pessoas = new ArrayList<Pessoa>();
    }

    public void registraDoacao() {
        String valorStr = JOptionPane.showInputDialog(null, "Digite o valor da doação:");
        double valor = 0;
        try {
            valor = Double.parseDouble(valorStr);
            if (valor <= 0) {
                JOptionPane.showMessageDialog(null, "O valor da doação deve ser positivo.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Insira um número.");
            return;
        }

        String doadorNome = JOptionPane.showInputDialog(null, "Digite o nome do doador:");
        Doador doador = null;
        for (Pessoa pessoa : this.pessoas) {
            if (pessoa instanceof Doador && pessoa.getNome().equals(doadorNome)) {
                doador = (Doador) pessoa;
                break;
            }
        }
        if (doador == null) {
            doador = new Doador(doadorNome);
            this.pessoas.add(doador);
        }

        String beneficiarioNome = JOptionPane.showInputDialog(null, "Digite o nome do beneficiário:");
        Beneficiario beneficiario = null;
        for (Pessoa pessoa : this.pessoas) {
            if (pessoa instanceof Beneficiario && pessoa.getNome().equals(beneficiarioNome)) {
                beneficiario = (Beneficiario) pessoa;
                break;
            }
        }
        if (beneficiario == null) {
            beneficiario = new Beneficiario(beneficiarioNome);
            this.pessoas.add(beneficiario);
        }

        Doacao doacao = new Doacao(valor, doador, beneficiario);
        doador.adicionaDoacao(doacao);
        beneficiario.recebeDoacao(valor);
        this.doacoes.add(doacao);

        JOptionPane.showMessageDialog(null, "Doação registrada com sucesso!");
    }

    public void listaDoacoes() {
        StringBuilder sb = new StringBuilder("Lista de doações:\n");
        for (Doacao doacao : this.doacoes) {
            sb.append("- ").append(doacao.getValor()).append(" de ").append(doacao.getDoador().getNome()).append(" para ").append(doacao.getBeneficiario().getNome()).append("\n");
        }
        ListaDoacoesFrame listaDoacoesFrame = new ListaDoacoesFrame();
        listaDoacoesFrame.setTexto(sb.toString());
        listaDoacoesFrame.setVisible(true);
}


    public void listaPessoas() {
        StringBuilder sb = new StringBuilder("Lista de pessoas:\n");
        for (Pessoa pessoa : this.pessoas) {
            sb.append("- ").append(pessoa.getNome()).append("\n");
            pessoa.listaDoacoes();
        }
        JOptionPane.showMessageDialog(null, sb.toString());

    }
}

