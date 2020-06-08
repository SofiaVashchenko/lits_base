package com.lits.second.SpaceX;

public class SectionThree extends Spaceship {

    @Override
    public void detach() {
        super.detach();
        System.out.println("Section Three is detached");
    }
    public void attach() {
        super.attach();
        System.out.println("Section Three attached to ISS");
    }

}