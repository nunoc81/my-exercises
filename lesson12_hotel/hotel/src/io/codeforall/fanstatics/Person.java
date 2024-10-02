package io.codeforall.fanstatics;

public class Person {

    public static final int NO_ROOM = -1;
    private String name;
    private Hotel hotel;

    private int key;


    public Person(String name, Hotel hotel) {
        this.name = name;
        this.hotel = hotel;
        this.key = NO_ROOM;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getName (){
        System.out.println("Nome: " + name);
        System.out.println("-----------------");
        return null;
    }

    public void checkIn() {
        if ((this.key = hotel.checkRoomAvailable()) == -1) {
            System.out.println("No Rooms Available");
            return;
        }
        System.out.println("Checkin done, your key is " + key);

    }

    public void checkOut(){

        if (hotel.checkKeyRoom(key) == true){
            System.out.println("CheckOut Done!");
        }
        else {
            System.out.println("Something Went Wrong!");
        }



    }

}
