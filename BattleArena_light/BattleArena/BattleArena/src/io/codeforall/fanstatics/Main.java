package io.codeforall.fanstatics;

public class Main {
    public static void main(String[] args) {

        // fights
        Arena BattleArena = new Arena();
        //BattleArena.fight();

        //number of fights
        for (int i = 1; i < 5; i++) {
            System.out.println("============ FIGHT " + i + " ============");
            BattleArena.fight();
        }





    }
}
