package com.jaredandsam;

import com.birdbrain.Finch;

public class Test {
    public static void main(String[] args){
        Finch myfinch = new Finch();
    System.out.println("Distance: " + myfinch.getDistance());

    // myfinch.playNote(99, 2);
    // myfinch.setBeak(0,0,0);
    myfinch.setTurn("L", 75, 85);
    myfinch.setTurn("R", 150, 85);
    myfinch.setTurn("L", 435, 85);
    myfinch.disconnect();
    }
}