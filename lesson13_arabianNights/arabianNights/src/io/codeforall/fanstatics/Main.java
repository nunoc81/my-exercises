package io.codeforall.fanstatics;

public class Main {
    public static void main(String[] args) {
        MagicLamp magicLamp = new MagicLamp(2);

        Genie[] geniesType = new Genie[3] ;

        geniesType[0]= magicLamp.createGenies(magicLamp.rubs); //Grumpy
        geniesType[1]= magicLamp.createGenies(magicLamp.rubs); //Friendly
        geniesType[2]= magicLamp.createGenies(magicLamp.rubs); //Demon

        geniesType[0].makeWish();







    }
}
