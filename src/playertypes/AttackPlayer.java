package playertypes;

import players.PlayerForGame;
import winnershout.WinnerShoutDance;
import zonecontrol.ZoneControlAttack;

public class AttackPlayer extends PlayerForGame {
    public AttackPlayer(){
        zoneControl = new ZoneControlAttack();
        winnerShout = new WinnerShoutDance();
    }
    @Override
    public void display() {
        System.out.println("I am AttackPlayer");
    }
}
