/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reajustesaldo;

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;
public class ReajusteSaldo {
    public static void main(String[] args) {
        //Ler saldo
        String saldoStr = JOptionPane.showInputDialog("Digite o saldo atual:");
        double saldo = Double.parseDouble(saldoStr);

        //Calculo do saldo com reajuste de 1%
        double saldoReajustado = saldo * 1.01;

        //Mostrar resultado
        JOptionPane.showMessageDialog(null, "Saldo com reajuste de 1%: " + saldoReajustado);
    }
}

