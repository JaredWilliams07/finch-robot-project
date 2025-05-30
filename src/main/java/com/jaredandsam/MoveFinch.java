package com.example;

import com.birdbrain.Finch;

public class MoveFinch {
    public static void move(String[] args){
        Finch myfinch = new Finch();
    myfinch.setMove("F", 20, 80);
    myfinch.disconnect();
    }
}
