package io.codeforall.fanstatics;

public class Hotel {

    private String  nameHotel;
    Room [] rooms;

    public Hotel (String nameHotel, Room[] rooms) {
        this.nameHotel = nameHotel;
        this.rooms = rooms;
    }

    public boolean checkKeyRoom(int key){
        for (int i = 0; i < rooms.length; ++i)
            if (rooms[i].equals(key)){
                rooms[i].setCheckOut();
                return true;
            }
        return false;


    }





    public int checkRoomAvailable() {
        for (int i = 0; i < rooms.length; ++i)

            if (rooms[i].getIsOccupied() == false) {
                rooms[i].setCheckIn();
                return rooms[i].getRoomNumber();

            }

            return -1;
    }





}
