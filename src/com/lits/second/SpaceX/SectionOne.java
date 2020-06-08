package com.lits.second.SpaceX;

public class SectionOne extends Spaceship {

    @Override
    public void detach() {
        super.detach();
        System.out.println("Section One is detached");
    }
    public void attach() {
        super.attach();
        System.out.println("Section One attached to ISS");
    }

}