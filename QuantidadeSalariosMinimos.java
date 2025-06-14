/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kk;

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;
public class QuantidadeSalariosMinimos {
    public static void main(String[] args) {
        // Ler valor do salário mínimo
        String salarioMinStr = JOptionPane.showInputDialog("Digite o valor do salário mínimo:");
        double salarioMinimo = Double.parseDouble(salarioMinStr);

        //Ler valor do salário do usuário
        String salarioUserStr = JOptionPane.showInputDialog("Digite o valor do seu salário:");
        double salarioUsuario = Double.parseDouble(salarioUserStr);

        //Calculanmdo a quantidade de salários mínimos
        double quantidade = salarioUsuario / salarioMinimo;

        //Mostrar resultado
        JOptionPane.showMessageDialog(null, "Você ganha aproximadamente " + quantidade + " salários mínimos.");
    }
}
