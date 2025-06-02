package com.jaredandsam;

import com.birdbrain.Finch;

public class Test {
    public static void main(String[] args){
        Finch myfinch = new Finch();
    System.out.println("Distance: " + myfinch.getDistance());
    myfinch.disconnect();
    }
}