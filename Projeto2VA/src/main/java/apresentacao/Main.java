/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apresentacao;

import negocios.Sistema;
import javax.swing.JOptionPane;

/**
 *
 * @author joseedson
 */
public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        while (true) {
            int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Sistema de Doações", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Registrar doação", "Listar doações", "Listar pessoas", "Sair"}, null);
            switch (opcao) {
                case 0:
                    sistema.registraDoacao();
                    break;
                case 1:
                    sistema.listaDoacoes();
                    break;
                case 2:
                    sistema.listaPessoas();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }
        }
    }
}
