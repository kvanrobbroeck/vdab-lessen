package be.vdab.spaceships;

interface Carrier {
    default void launchFighters() {
        System.out.println("LAUNCH FIGHTERS");
    }

    default void fly() {
        System.out.println("FLY X");
    }
}
