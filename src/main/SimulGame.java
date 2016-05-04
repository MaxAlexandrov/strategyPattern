package main;
import players.PlayerForGame;
import playertypes.AttackPlayer;
import playertypes.DefenderPlayer;
import winnershout.WinnerShoutRuntoFanats;

public class SimulGame {
    public static void main(String[] args) {
        PlayerForGame  onePlayer = new AttackPlayer();
        onePlayer.performZone();
        onePlayer.performShot();
        PlayerForGame twoPlayer = new DefenderPlayer();
        twoPlayer.performZone();
        twoPlayer.performShot();
        twoPlayer.setWinnerShout(new WinnerShoutRuntoFanats());
        twoPlayer.performShot();
    }
}
