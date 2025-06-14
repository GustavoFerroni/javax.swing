/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somaemediadasmedias;

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;
public class SomaEMediaDasMedias {
    public static void main(String[] args) {
        double media1 = (8 + 9 + 7) / 3.0;
        double media2 = (4 + 5 + 6) / 3.0;

        double somaMedias = media1 + media2;
        double mediaDasMedias = somaMedias / 2.0;

        String mensagem = "Média dos números 8, 9 e 7: " + media1 +
                          "\nMédia dos números 4, 5 e 6: " + media2 +
                          "\nSoma das duas médias: " + somaMedias +
                          "\nMédia das duas médias: " + mediaDasMedias;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
