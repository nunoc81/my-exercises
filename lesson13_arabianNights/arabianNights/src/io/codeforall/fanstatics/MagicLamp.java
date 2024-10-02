package io.codeforall.fanstatics;

public class MagicLamp {
    public int rubs;

    public int counter = 1;


    public MagicLamp(int rubs) {
        this.rubs = rubs;
    }


    public Genie createGenies(int rubs) {
        if (counter % 2 != 0 & counter <= rubs) {
            //criar o geniegrumpy
            counter++;
            System.out.println("Grumpy created");
            return new GenieGrumpy();
        }

        if (counter % 2 == 0 & counter <= rubs) {
            //invocar o geniefirendly
            counter++;
            System.out.println("Friendly created");
            return new GenieFriendly();
        }

        if (counter > rubs) {
            //invocar deamon
            counter++;
            System.out.println("Demon created");
            return new GenieDemon();
        }

        return null;


    }


}