package com.jaredandsam;

import com.birdbrain.Finch;

public class Test {
    public static void main(String[] args){
        Finch myfinch = new Finch();
    System.out.println("Distance: " + myfinch.getDistance());
    myfinch.playNote(99, 2);
    myfinch.setBeak(100,90,73);
    myfinch.setTurn("L", 360, 85);
    myfinch.disconnect();
    }
}