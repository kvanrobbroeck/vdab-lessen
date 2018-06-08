package be.vdab.beehive;

public class NurseMain {
    public static void main(String[] args) {

        Queen q = new Queen("Elisabeth");

        Larva[] larvae = new Larva[1000];
        larvae[0] = q.layLarva();

        Nurse n = new Nurse("Florence");
        Worker newBorn = n.nurseLarva(larvae[0]);
        while(newBorn == null) {
            newBorn = n.nurseLarva(larvae[0]);
        }
        larvae[0] = null;
        System.out.println("A NEW WORKER IS BORN " + newBorn.getName());



    }
}
