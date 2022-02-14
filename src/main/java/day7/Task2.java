package day7;

public class Task2 {
    public static void main(String[] args) {
        Player.info();
        System.out.println("We are starting to create new players...");
        Player player1 = new Player((int)(Math.random()*(Player.MAX_STAMINA-Player.MIN_START_STAMINA+1)+Player.MIN_START_STAMINA));
        Player.info();
        Player player2 = new Player((int)(Math.random()*(Player.MAX_STAMINA-Player.MIN_START_STAMINA+1)+Player.MIN_START_STAMINA));
        Player.info();
        Player player3 = new Player((int)(Math.random()*(Player.MAX_STAMINA-Player.MIN_START_STAMINA+1)+Player.MIN_START_STAMINA));
        Player.info();
        Player player4 = new Player((int)(Math.random()*(Player.MAX_STAMINA-Player.MIN_START_STAMINA+1)+Player.MIN_START_STAMINA));
        Player.info();
        Player player5 = new Player((int)(Math.random()*(Player.MAX_STAMINA-Player.MIN_START_STAMINA+1)+Player.MIN_START_STAMINA));
        Player.info();
        Player player6 = new Player((int)(Math.random()*(Player.MAX_STAMINA-Player.MIN_START_STAMINA+1)+Player.MIN_START_STAMINA));
        Player.info();
        Player player7 = new Player((int)(Math.random()*(Player.MAX_STAMINA-Player.MIN_START_STAMINA+1)+Player.MIN_START_STAMINA));
        Player.info();

        for (int i = 1; i < 110; i++) {
            player1.run();
            System.out.print(player1.getStamina() + "\t");
            if (i % 20 == 0) System.out.print("\n");
        }
        System.out.println("");
        Player.info();
    }
}
