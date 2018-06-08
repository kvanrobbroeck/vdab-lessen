package be.vdab.spaceships;

interface Capitol {
    default int shootCannon() {
        System.out.println("SHOOT CANNON");
        return 15;
    }

    default void fly() {
        System.out.println("FLY Y");
    }
}
