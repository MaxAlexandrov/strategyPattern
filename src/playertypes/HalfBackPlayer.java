package playertypes;

import players.PlayerForGame;
import winnershout.WinnerShoutRuntoFanats;
import zonecontrol.ZoneControlHalfBack;

public class HalfBackPlayer extends PlayerForGame {
    public HalfBackPlayer(){
        zoneControl = new ZoneControlHalfBack();
        winnerShout = new WinnerShoutRuntoFanats();
    }
    @Override
    public void display() {
        System.out.println("I am HalfBackPlayer");
    }
}
