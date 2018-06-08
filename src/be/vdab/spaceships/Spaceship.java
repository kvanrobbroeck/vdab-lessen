package be.vdab.spaceships;

class Spaceship implements Capitol, Carrier {
    @Override
    public void fly() {
        Capitol.super.fly();
    }
}