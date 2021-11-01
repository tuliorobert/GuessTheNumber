package GuessTheNumber;

import javax.swing.JOptionPane;

public class Menu {
    private String[] options = {"Facil", "Medio", "Dificil"};
    private String[] repeat = {"Sim", "Nao"};

    public int difMenu() {
        int menu = JOptionPane.showOptionDialog(null, "Selecione a dificuldade", "Dificuldade", 
        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        return menu;
    }

    public int repeatMenu() {
        int rp = JOptionPane.showOptionDialog(null, "Deseja repetir o jogo?", "Repetir", 
        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, repeat, repeat[0]);

        return rp;
    }
}
