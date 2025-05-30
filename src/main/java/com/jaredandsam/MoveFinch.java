package com.jaredandsam;

import com.birdbrain.Finch;

public class MoveFinch {
    public static void main(String[] args){
        Finch myfinch = new Finch();
    myfinch.setMove("F", 20, 80);
    myfinch.disconnect();
    }
}
