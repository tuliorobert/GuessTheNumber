package GuessTheNumber;

public class Main {
    public static void main(String[] args) {
        Messages msg = new Messages();
        Menu op = new Menu();
        Game game = new Game();

        msg.welcomeMessage();

        for (int i = 0; i == 0;) {
            int difficult = op.difMenu();

            if (difficult == 0) {
                game.easyGame();
            } else if (difficult == 1) {
                game.normalGame();
            } else {
                game.hardGame();
            }

            int rp = op.repeatMenu();

            if (rp != 0) {
                msg.finalMessage();
                i = 1;
            }
        } 

        System.exit(0);
    }
}
