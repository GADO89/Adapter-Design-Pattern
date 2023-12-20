package org.adapter;

public class bicycleAdapter implements Vehicle{

    private Bicycle bike;

    public bicycleAdapter(Bicycle bike) {
        this.bike = bike;
    }

    @Override
    public void accelerate() {
     this.bike.pedal();
    }

    @Override
    public void pushBreak() {
        this.bike.stop();
    }

    @Override
    public void soundHorn() {
        this.bike.ringBell();
    }
}
