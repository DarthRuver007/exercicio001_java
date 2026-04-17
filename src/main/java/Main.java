

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        double A = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número inteiro: "));
        double B = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número inteiro: "));
        double C = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o terceiro número inteiro: "));
        double soma = A + B + C;
        double media = soma / 3;
        JOptionPane.showMessageDialog(null,"O valor da média é: " + media);
    }
}