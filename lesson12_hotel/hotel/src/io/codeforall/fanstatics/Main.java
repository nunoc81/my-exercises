package io.codeforall.fanstatics;

public class Main {
    public static void main(String[] args) {


    Room r1 = new Room(2);
  //  Room r2 = new Room(5);


    //Room[] rooms = new Room[2];
    Room[] rooms = new Room[1];
    rooms[0]= r1;
   // rooms[1]= r2;


    Hotel h1 = new Hotel("Ficaki",rooms);

    Person p1 = new Person("Manel da Silva Quim",(h1));
    Person p2 = new Person("Joana",(h1));



    p1.getName();



    p1.checkIn();
    p2.checkIn();

    p1.checkOut();




    }
}
