/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cauculoipi;

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;
public class CalculoIPI {
    public static void main(String[] args) {
        
        double ipi = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem do IPI:"));

        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário da peça 1:"));
        
        int quant1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade da peça 1:"));
        
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário da peça 2:"));
        
        int quant2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade da peça 2:"));

        double total = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);

        JOptionPane.showMessageDialog(null, "Valor total a pagar com IPI: R$ " + total);
    }
}
