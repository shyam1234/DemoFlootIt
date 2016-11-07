package com.malviya.demoflootit;

/**
 * Created by 23508 on 11/7/2016.
 */
public class CellInfo {

    private int color;
    private int col;
    private int row;

    CellInfo(int color, int col, int row) {
        this.color = color;
        this.col = col;
        this.row = row;
    }

    public int getColor() {
        return color;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}
