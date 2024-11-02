package io.codeforall.fanstatics;

import java.util.Random;

public class Arena {
    //Attributes
    private Mage fighter1;
    private Cleric fighter2;
    private Warrior fighter3;
    private Rogue fighter4;
    private int rounds;

    //Constructor

    public Arena() {
        this.fighter1 = new Mage("Super Mage",100,"USA",28,1.90f,82.5f,100,0,0,0);
        this.fighter2 = new Cleric("Super Cleric",100,"SPAIN",31,1.75f,82.5f,100,0,0,0);
        this.fighter3 = new Warrior("Super Warrior",100,"PORTUGAL",28,2.05f,100f,100,0,0,0);
        this.fighter4 = new Rogue("Super Rogue",100,"BRAZIL",22,1.68f,62.5f,100,0,0,0);
        this.rounds = 0;

    }




    //Getters && Setters





    //Custom Methods



    public void fight(){

        System.out.println("Player 1 present yourself!");
        this.fighter1.playerPresentation();
        System.out.println("Player 2 present yourself!");
        this.fighter2.playerPresentation();
        System.out.println("Player 3 present yourself!");
        this.fighter3.playerPresentation();
        System.out.println("Player 4 present yourself!");
        this.fighter4.playerPresentation();
        System.out.println("#######       #######       #######");
        System.out.println("Prepare yourself!");
        System.out.println("### 3, 2, 1 ###");
        System.out.println("### FIGHT ###");

        //0 = draw
        //1 = fighter1 wins
        //2 = fighter2 wins
        //3 = fighter3 wins
        //4 = fighter4 wins


        Random randomFight = new Random();
        int winner = randomFight.nextInt(5); //0 1 2 3 4

        switch (winner) {
            case 0: //draw
                System.out.println(" ---------- FIGHTING IN ARENA ----------- ");
                System.out.println(" IT`S A DRAW");
                this.fighter1.draw();
                this.fighter2.draw();
                this.fighter3.draw();
                this.fighter4.draw();
                break;
            case 1: //fighter 1 wins
                System.out.println(" ---------- FIGHTING IN ARENA ----------- ");
                System.out.println(this.fighter1.getName() + " WINS");
                System.out.println(" ---------- END OF FIGHT ----------- ");
                this.fighter1.winFight();
                this.fighter2.loseFight();
                this.fighter3.loseFight();
                this.fighter4.loseFight();
                break;
            case 2: //fighter 2 wins
                System.out.println(" ---------- FIGHTING IN ARENA ----------- ");
                System.out.println(this.fighter2.getName() + " WINS");
                System.out.println(" ---------- END OF FIGHT ----------- ");
                this.fighter1.loseFight();
                this.fighter2.winFight();
                this.fighter3.loseFight();
                this.fighter4.loseFight();
                break;
            case 3: //fighter 3 wins
                System.out.println(" ---------- FIGHTING IN ARENA ----------- ");
                System.out.println(this.fighter3.getName() + " WINS");
                System.out.println(" ---------- END OF FIGHT ----------- ");
                this.fighter1.loseFight();
                this.fighter2.loseFight();
                this.fighter3.winFight();
                this.fighter4.loseFight();
                break;
            case 4: //fighter 4 wins
                System.out.println(" ---------- FIGHTING IN ARENA ----------- ");
                System.out.println(this.fighter4.getName() + " WINS");
                System.out.println(" ---------- END OF FIGHT ----------- ");
                this.fighter1.winFight();
                this.fighter2.loseFight();
                this.fighter3.loseFight();
                this.fighter4.winFight();
                break;
            default:
                System.out.println("FIGHT SUSPENDED!!");
                break;
        }

        //Updated status

        System.out.println("#######       #######       #######");
        System.out.println("---------- UPDATED STATUS AFTER FIGHT ----------");
        this.fighter1.playerStatus();
        this.fighter2.playerStatus();
        this.fighter3.playerStatus();
        this.fighter4.playerStatus();
        System.out.println("------------------------------------------------");


    }

}
