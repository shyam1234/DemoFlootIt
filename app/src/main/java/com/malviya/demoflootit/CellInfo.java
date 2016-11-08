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

    public void setColor(int color) {
        this.color = color;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int color) {
        this.col = color;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int color) {
        this.row = color;
    }
}
