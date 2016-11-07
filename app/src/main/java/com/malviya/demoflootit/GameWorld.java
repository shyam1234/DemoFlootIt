package com.malviya.demoflootit;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

/**
 * This class contains whole game logic
 */
public class GameWorld extends View {
    private static final int COL = 8;
    private static final int ROW = 8;
    private static final float CELL_W = 100;
    private static final float CELL_H = 100;
    private static final float INIT_TABLE_X = 0;
    private static final float INIT_TABLE_Y = 0;
    private Context mContext;
    private ArrayList<CellInfo> mCellList;
    private int randomColor;
    private int TOTAL_BUTTON = 4;

    public GameWorld(Context pContext) {
        super(pContext);
        mContext = pContext;
        mCellList = new ArrayList<>();
        initTable();
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.STROKE);
        drawRectTable(canvas, paint);
    }


   /* private void drawRectTable(Canvas canvas, Paint mGridPaint) {
        for (int col = 0; col < COL; col++) {
            for (int row = 0; row < ROW; row++) {
                canvas.drawRect(INIT_TABLE_X + (col * CELL_W), INIT_TABLE_Y + (CELL_H * row), (col + 1) * CELL_W, (row + 1) * CELL_H, mGridPaint);
            }
        }

    }*/

    private void drawRectTable(Canvas canvas, Paint mGridPaint) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.FILL);
        for (CellInfo cell : mCellList) {
            paint.setColor(cell.getColor());
            canvas.drawRect(INIT_TABLE_X + (cell.getCol() * CELL_W), INIT_TABLE_Y + (CELL_H * cell.getRow()), (cell.getCol() + 1) * CELL_W, (cell.getRow() + 1) * CELL_H,paint);
        }


    }

    private void initTable() {
        mCellList.clear();
        for (int col = 0; col < COL; col++) {
            for (int row = 0; row < ROW; row++) {
                mCellList.add(new CellInfo(getRandomColor(Math.random()*10), col, row));
            }
        }
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //Get the width measurement
        int widthSize = View.resolveSize((int) ((COL * CELL_W)), widthMeasureSpec);
        //Get the height measurement
        int heightSize = View.resolveSize((int) ((ROW * CELL_H)), heightMeasureSpec);
        //MUST call this to store the measurements
        setMeasuredDimension(widthSize, heightSize);
    }


    public int getRandomColor(double index) {
        switch ((int) (index % TOTAL_BUTTON)) {
            case 0:
                return Color.RED;
            case 1:
                return Color.WHITE;
            case 2:
                return Color.GREEN;
            case 3:
                return Color.BLUE;
        }
        return Color.BLACK;
    }

    public void onReset() {
        initTable();
        invalidate();
    }
}
