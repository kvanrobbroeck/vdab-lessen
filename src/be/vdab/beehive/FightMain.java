package be.vdab.beehive;

/**
 * Voorbeeld van hoe een computer spelletje zou kunnen werken (met een random "geluk" factor toegevoegd)
 */
public class FightMain {
    public static void main(String[] args) {
        Soldier arnold = new Soldier("Arnold", 20, 1);
        Soldier sylvester = new Soldier("Sylvester", 15, 6);
        fightToTheDeath(arnold, sylvester);
    }

    public static void fightToTheDeath(Soldier aggressor, Soldier defender) {
        int round = 0;
        while(!aggressor.isDead() && !defender.isDead()) {
            System.out.println("ROUND " + ++round);
            printHealth(aggressor);
            printHealth(defender);
            aggressor.attack(defender);
            Soldier temp = aggressor;
            aggressor = defender;
            defender = temp;
            System.out.println("-----------");
        }
    }

    public static void printHealth(Soldier soldier) {
        System.out.println(soldier.name + " -> " + soldier.hitpoints + " hitpoints left.");
    }
}
