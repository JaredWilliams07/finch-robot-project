package com.jaredandsam;

import com.birdbrain.Finch;

public class MoveFinch  {
    public static void main(String[] args){
        Finch myfinch = new Finch();
    myfinch.setMove("F", 97, 70);
    playNoteWhenTurning(myfinch);
    myfinch.setTurn("L", 90, 80);
    myfinch.setMove("F", 36, 70);
    playNoteWhenTurning(myfinch);
    myfinch.setTurn("L", 90, 80);
    myfinch.setMove("F", 30, 70);
    playNoteWhenTurning(myfinch);
    myfinch.setTurn("R", 90, 80);
    myfinch.setMove("F", 55, 70);
    playNoteWhenTurning(myfinch);
    myfinch.setTurn("R", 90, 80);
    myfinch.setMove("F",120, 70);
    playNoteWhenTurning(myfinch);
    myfinch.setTurn("R", 90, 80);
    myfinch.setMove("F",15, 70);
    playNoteWhenTurning(myfinch);
    myfinch.setTurn("L", 90, 80);
    myfinch.setMove("F",25, 70);
    playNoteWhenTurning(myfinch);
    myfinch.setTurn("L", 90, 80);
    myfinch.setMove("F",myfinch.getDistance() - 3, 80);

    myfinch.disconnect();
    }
    public static void playNoteWhenTurning(Finch finch) {
        finch.playNote(99, 1);
    }
}
