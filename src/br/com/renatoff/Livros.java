package br.com.renatoff;

import javax.swing.JOptionPane;

public class Livros {
    
    public static void main(String[] args) {
       BibliotecaV2[] biblioteca = new BibliotecaV2[3];
        LivrariaV2[] livraria = new LivrariaV2[3];

        for (int i = 0; i < biblioteca.length; i++) {
            biblioteca[i] = new BibliotecaV2();
            boolean pass = false;
            String numeroDigitado;
            while (!pass) {
                numeroDigitado = JOptionPane.showInputDialog("Digite o número de exemplares do " + i + "º livro de biblioteca!");
                if (Utilidades.isInt(numeroDigitado)) {
                    pass = true;
                    biblioteca[i].setExemplares(Integer.parseInt(numeroDigitado));
                }
            }
        }

        for (int i = 0; i < livraria.length; i++) {
            livraria[i] = new LivrariaV2();
            boolean pass = false;
            String numeroDigitado;
            while (!pass) {
                numeroDigitado = JOptionPane.showInputDialog("Digite o valor do " + i + "º livro de livraria!");
                if (Utilidades.isNumeric(numeroDigitado)) {
                    pass = true;
                    livraria[i].setValor(Double.parseDouble(numeroDigitado));
                }
            }
        }

        for (BibliotecaV2 biblioteca_ : biblioteca) {
            System.out.println(biblioteca_.getExemplares());
        }
        for (LivrariaV2 livraria_ : livraria) {
            System.out.println(livraria_.getValor());
        }
    }
    }
    
}

}