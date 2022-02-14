package day7;

public class Player {
    private int stamina;
    private boolean permissionToChangeCounterPlayers;   // this variable is created for ensuring single operation of increasing player's counter
    static final int MAX_STAMINA = 100;
    static final int MIN_START_STAMINA = 90;
    static final int MIN_STAMINA = 0;
    static final int MAX_PLAYERS = 6;
    static final int MIN_PLAYERS = 0;
    private static int countPlayers = 0;

    // constructor
    public Player(int stamina) {
        permissionToChangeCounterPlayers = true;        // object has quantity of stamina from 90 to 100, so object is able to change counter
        this.stamina = stamina;
        if (countPlayers < MAX_PLAYERS) countPlayers++;
    }

    // getters
    public int getStamina() {
        return stamina;
    }
    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina > MIN_STAMINA) stamina--;
        else if (stamina == MIN_STAMINA && permissionToChangeCounterPlayers) {     // stamina dropped to 0
            if (countPlayers > MIN_PLAYERS) countPlayers--;                        // countPlayers has decreased one time
            permissionToChangeCounterPlayers = false;                    // permission is false, countPlayers is not going to change anymore
        }
    }

    public static void info() {
        switch (countPlayers) {
            case 0: System.out.println("There is no players on the field, " + (MAX_PLAYERS - countPlayers) + " positions remain");
                    break;
            case 1: System.out.println("Not enough players, " + (MAX_PLAYERS - countPlayers) + " positions remain, there is " + countPlayers + " player on the field");
                    break;
            case 2:
            case 3:
            case 4: System.out.println("Not enough players, " + (MAX_PLAYERS - countPlayers) + " positions remain, there are " + countPlayers + " players on the field");
                    break;
            case 5: System.out.println("Not enough players, " + (MAX_PLAYERS - countPlayers) + " position remains, there are " + countPlayers + " players on the field");
                    break;
            case 6: System.out.println("Team is full, there are " + countPlayers + " players on the field");
            default: break;
        }
    }
}
