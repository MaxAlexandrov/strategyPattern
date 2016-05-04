package playertypes;

import players.PlayerForGame;
import winnershout.WinnerShoutLoud;
import zonecontrol.ZoneControlDefender;

public class DefenderPlayer extends PlayerForGame {
    public DefenderPlayer(){
        zoneControl = new ZoneControlDefender();
        winnerShout = new WinnerShoutLoud();
    }
    @Override
    public void display() {
        System.out.println("I am DefenderPlayer");
    }
}
