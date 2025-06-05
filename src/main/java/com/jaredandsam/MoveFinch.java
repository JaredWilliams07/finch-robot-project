package com.jaredandsam;

import com.birdbrain.Finch;

public class MoveFinch  {
    public static void main(String[] args){
        Finch myfinch = new Finch();
    myfinch.setMove("F", 100, 70);
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
    myfinch.setTurn("R", 94, 80);
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
    //Ending Dance
    myfinch.setTurn("L", 360, 100);
    myfinch.setTurn("R", 360, 100);
    myfinch.playNote(64, 0.5); // E
    myfinch.setBeak(10,50,81);
    myfinch.playNote(64, 0.5); // E
    myfinch.setBeak(32,74,14);
    myfinch.pause(0.55);
    myfinch.playNote(65, 0.5); // F
    myfinch.setBeak(100,90,63);
    myfinch.pause(0.55);
    myfinch.playNote(67, 0.5); // G
    myfinch.setBeak(15,72,31);
    myfinch.pause(0.55);
    myfinch.playNote(67, 0.5); // G
    myfinch.setBeak(5,75,0);
    myfinch.pause(0.55);
    myfinch.playNote(65, 0.5); // F
    myfinch.setBeak(100,69,69);
    myfinch.pause(0.55);
    myfinch.playNote(62, 0.5); // D
    myfinch.setBeak(12,45,74);
    myfinch.pause(0.55);
    myfinch.playNote(60, 0.5); // C
    myfinch.setBeak(69,69,42);
    myfinch.pause(0.55);
    myfinch.playNote(60, 0.5); // C
    myfinch.setBeak(45,10,0);
    myfinch.pause(0.55);
    myfinch.playNote(62, 0.5); // D
    myfinch.setBeak(12,74,44);
    myfinch.pause(0.55);
    myfinch.playNote(64, 0.5); // E
    myfinch.setBeak(85,10,27);
    myfinch.pause(0.55);
    myfinch.playNote(64, 0.5); // E
    myfinch.setBeak(69,45,1);
    myfinch.pause(0.55);
    myfinch.playNote(62, 0.5); // D
    myfinch.setBeak(47,35,75);
    myfinch.pause(0.55);
    myfinch.playNote(62, 1.0); // D 
    myfinch.setBeak(1,1,100);
    myfinch.pause(1.05);

    myfinch.disconnect();
    }
    public static void playNoteWhenTurning(Finch finch) {
        finch.playNote(99, 1);
    }
}
