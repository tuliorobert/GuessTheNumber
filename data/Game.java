package data;

public class Game {
    protected Messages msg = new Messages();
    private int n;
    private int answer;
    private double rNumber;

    public int gameNum() {
        rNumber = Math.random();
        int n = (int) (1 + rNumber * (50 - 1));

        return n;
    }

    public void easyGame() {
        n = gameNum();
        msg.easyMode();

        for (int i = 0; i < 10; i++) {
            answer = msg.typeNum("Tentativa " + (i + 1) + "\nDigite um numero de 1 a 50:");

            if (answer > 0 && answer <= 50 && answer > n) {
                msg.smallerNum();
            } else if (answer > 0 && answer < 50 && answer < n) {
                msg.biggerNum();
            } else if (answer < 50 && answer < 0) {
                msg.underNum();
            } else if (answer == 0) {
                msg.zeroNum();
            } else if (answer > 0 && answer > 50) {
                msg.overNum();
            } else if (answer == n) {
                msg.winnerMessage("Voce acertou o numero, parabens!\n O numero e: " + n);
                i = 11;
            } 
            
            if (i == 9) {
                msg.loserMessage("Numero de tentativas acabou, voce perdeu :(\n O numero era: " + n);
            }
        }
    }

    public void normalGame() {
        n = gameNum();
        msg.normalMode();
    
        for (int i = 0; i < 8; i++) {
            answer = msg.typeNum("Tentativa " + (i + 1) + "\nDigite um numero de 1 a 50:");

            if (answer > 0 && answer <= 50 && answer > n) {
                msg.smallerNum();
            } else if (answer > 0 && answer < 50 && answer < n) {
                msg.biggerNum();
            } else if (answer < 50 && answer < 0) {
                msg.underNum();
            } else if (answer == 0) {
                msg.zeroNum();
            } else if (answer > 0 && answer > 50) {
                msg.overNum();
            } else if (answer == n) {
                msg.winnerMessage("Voce acertou o numero, parabens!\n O numero e: " + n);
                i = 11;
            } 
            
            if (i == 7) {
                msg.loserMessage("Numero de tentativas acabou, voce perdeu :(\n O numero era: " + n);
            }
        }
    }

    public void hardGame() {
        n = gameNum();
        msg.hardMode();
    
        for (int i = 0; i < 5; i++) {
            answer = msg.typeNum("Tentativa " + (i + 1) + "\nDigite um numero de 1 a 50:");
        
            if (answer > 0 && answer <= 50 && answer > n) {
                msg.smallerNum();
            } else if (answer > 0 && answer < 50 && answer < n) {
                msg.biggerNum();
            } else if (answer < 50 && answer < 0) {
                msg.underNum();
            } else if (answer == 0) {
                msg.zeroNum();
            } else if (answer > 0 && answer > 50) {
                msg.overNum();
            } else if (answer == n) {
                msg.winnerMessage("Voce acertou o numero, parabens!\n O numero e: " + n);
                i = 11;
            } 
                    
            if (i == 4) {
                msg.loserMessage("Numero de tentativas acabou, voce perdeu :(\n O numero era: " + n);
            }
        }
    }
}
