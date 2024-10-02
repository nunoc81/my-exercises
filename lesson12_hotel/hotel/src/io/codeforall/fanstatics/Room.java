package io.codeforall.fanstatics;

public class Room {

    private int roomNumber;
    private boolean isOccupied;


    public Room (int roomNumber){
        this.roomNumber = roomNumber;
        this.isOccupied = false;
    }

    //methods
    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

    public boolean setCheckIn() {
        return isOccupied = true;
    }

    public boolean setCheckOut() {
        return isOccupied = false;
    }

}
