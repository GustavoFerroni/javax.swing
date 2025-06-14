/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sucessorantecessor;

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;
public class SucessorAntecessor {
    public static void main(String[] args) {
        //Ler número
        String numeroStr = JOptionPane.showInputDialog("Digite um número (pode ser decimal):");
        double numero = Double.parseDouble(numeroStr);

        //Calculo do antecessor e sucessor
        double antecessor = numero - 1.0;
        double sucessor = numero + 1.0;

        //Mostrar resultado
        String mensagem = "Número digitado: " + numero +
                          "\nAntecessor: " + antecessor +
                          "\nSucessor: " + sucessor;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
