package com.hermanjc.jcross;
import com.hermanjc.jcross.Puzzle.CellState;

public class App{
    public static void main(String[] args){
        System.out.println("Hello World!");

        Puzzle p = new Puzzle(5, 5);

        System.out.println(p.height + " " + p.width);
        System.out.println(p.board.size());
        System.out.println(p.board);

        CellState[][] test = {
            {CellState.BLANK, CellState.BLANK, CellState.BLANK, CellState.BLANK, CellState.BLANK},
            {CellState.BLANK, CellState.BLANK, CellState.BLANK, CellState.BLANK, CellState.BLANK},
            {CellState.BLANK, CellState.BLANK, CellState.BLANK, CellState.BLANK, CellState.BLANK},
            {CellState.BLANK, CellState.BLANK, CellState.BLANK, CellState.BLANK, CellState.BLANK},
            {CellState.BLANK, CellState.BLANK, CellState.BLANK, CellState.BLANK, CellState.BLANK},
        };
    }
}
