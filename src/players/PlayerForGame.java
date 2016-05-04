package players;

import winnershout.WinnerShout;
import zonecontrol.ZoneControl;

public abstract class PlayerForGame {
    public ZoneControl zoneControl;
    public WinnerShout winnerShout;

    public PlayerForGame(){
    }
    public abstract void display();
    public void performZone(){
        zoneControl.zone();
    }
    public void performShot(){
        winnerShout.shout();
    }
    public void moving() {
        System.out.println("All player knows move!");
    }
    public void setZoneControl(ZoneControl zoneControl) {
        this.zoneControl = zoneControl;
    }
    public void setWinnerShout(WinnerShout winnerShout) {
        this.winnerShout = winnerShout;
    }
}
