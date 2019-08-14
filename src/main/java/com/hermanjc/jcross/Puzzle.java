package com.hermanjc.jcross;

import java.util.*;

public class Puzzle{
    static public enum CellState{
        BLANK,
        BLACK,
    };

    public ArrayList<ArrayList<CellState>> board;
    public int height;
    public int width;

    public Puzzle(){
        new ArrayList<ArrayList<CellState>>(0);
        height = 0;
        width = 0;
    }

    public Puzzle(int height, int width){
        board = new ArrayList<ArrayList<CellState>>(height);
        this.height = height;
        this.width = width;

        for(int i = 0; i < width; ++i){
            board.add(i, new ArrayList<CellState>(width));
            for(int j = 0; j < width; ++j){
                board.get(i).add(j, CellState.BLANK);
            }
        }
    }

    public Puzzle(CellState[][] arr){
        if(arr.length > 0){
            if(arr[0].length > 0){
                board = new ArrayList<ArrayList<CellState>>(arr.length);
                this.height = arr.length;
                this.width = arr[0].length;
            }
        }
    }
}