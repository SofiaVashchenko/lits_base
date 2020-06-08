package com.lits.second.SpaceX;

public class SectionTwo extends Spaceship {

    @Override
    public void detach() {
        super.detach();
        System.out.println("Section Two is detached");
    }

    public void attach() {
        super.attach();
        System.out.println("Section Two attached to ISS");
    }

}