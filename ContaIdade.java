/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contaidade;

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;
public class ContaIdade {

    public static void main(String[] args) {
        double anos = Double.parseDouble(JOptionPane.showInputDialog("Digite a idade em anos:"));
        double meses = Double.parseDouble(JOptionPane.showInputDialog("Digite a idade em meses:"));
        double dias = Double.parseDouble(JOptionPane.showInputDialog("Digite a idade em dias:"));

        double totalDias = anos * 365 + meses * 30 + dias;

        JOptionPane.showMessageDialog(null, "A idade em dias é: " + totalDias);
    }
}
