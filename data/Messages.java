package GuessTheNumber;

import javax.swing.JOptionPane;

public class Messages {
    public void welcomeMessage() {
        JOptionPane.showMessageDialog(null, "Seja bem vindo(a) ao Adivinhe o Numero!", "Bem Vindo!" , JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Voce deve adivinhar o numero entre 1 a 50");
    }

    public void finalMessage() {
        JOptionPane.showMessageDialog(null, "Obrigado por jogar, volte sempre <3");
    }

    public void easyMode() {
        JOptionPane.showMessageDialog(null, "Voce selecionou a dificuldade facil, entao voce tera 10 tentativas!");
    }

    public void normalMode() {
        JOptionPane.showMessageDialog(null, "Voce selecionou a dificuldade media, entao voce tera 8 tentativas!");
    }

    public void hardMode() {
        JOptionPane.showMessageDialog(null, "Voce selecionou a dificuldade dificil, entao voce tera 5 tentativas!");
    }

    public void smallerNum() {
        JOptionPane.showMessageDialog(null, "O numero e menor do que voce digitou", "Numero Errado", JOptionPane.WARNING_MESSAGE);
    }

    public void biggerNum() {
        JOptionPane.showMessageDialog(null, "O numero e maior do que voce digitou!", "Numero Errado", JOptionPane.WARNING_MESSAGE);
    }

    public void zeroNum() {
        JOptionPane.showMessageDialog(null, "0 nao faz parte do game, tente de novo!", "Numero Errado", JOptionPane.WARNING_MESSAGE);
    }

    public void overNum() {
        JOptionPane.showMessageDialog(null, "Numeros maiores que 50 fazem parte do game, tente de novo!", "Numero Errado", JOptionPane.WARNING_MESSAGE);
    }

    public void underNum() {
        JOptionPane.showMessageDialog(null, "Numero negativos nao fazem parte do game, tente de novo!", "Numero Errado", JOptionPane.WARNING_MESSAGE);
    }

    public int typeNum(String msg) {
        int n;

        n = Integer.parseInt(JOptionPane.showInputDialog(null, msg, "Digite um numero", JOptionPane.QUESTION_MESSAGE));

        return n;
    }

    public void winnerMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Numero Correto", JOptionPane.INFORMATION_MESSAGE);
    }

    public void loserMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Fim de Jogo", JOptionPane.ERROR_MESSAGE);
    }
}
