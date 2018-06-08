package be.vdab.beehive;

public class BeeMain {
    public static void main(String[] args) {
        Soldier a = new Soldier("Arnold", 10, 2);
        Bee b = new Soldier("Arnold", 10, 2);

        Insect i = new Nurse("Florence");
        i.crawl();
        i.eat();
        i.poo();


    }

































    public static void move(Bee bee) {
        bee.fly();
    }



}
