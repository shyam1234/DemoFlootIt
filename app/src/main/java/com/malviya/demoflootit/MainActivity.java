package com.malviya.demoflootit;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by 23508 on 11/7/2016.
 */

public class MainActivity extends Activity implements View.OnClickListener {

    private ImageView mReset;
    private GameWorld mGameworld;
    public static TextView mScore;
    private TextView mTotalMoves;
    public static int mCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        FrameLayout view = (FrameLayout) findViewById(R.id.view);
        mGameworld = new GameWorld(MainActivity.this);
        view.addView(mGameworld);
        mReset = (ImageView) findViewById(R.id.imageview_reset);
        mReset.setOnClickListener(this);

        //for button
        ImageView btn1 = (ImageView) findViewById(R.id.imageview1);
        btn1.setBackgroundColor(Color.RED);
        ImageView btn2 = (ImageView) findViewById(R.id.imageview2);
        btn2.setBackgroundColor(Color.WHITE);
        ImageView btn3 = (ImageView) findViewById(R.id.imageview3);
        btn3.setBackgroundColor(Color.GREEN);
        ImageView btn4 = (ImageView) findViewById(R.id.imageview4);
        btn4.setBackgroundColor(Color.BLUE);
        ImageView btn5 = (ImageView) findViewById(R.id.imageview5);
        btn5.setBackgroundColor(Color.CYAN);
        ImageView btn6 = (ImageView) findViewById(R.id.imageview6);
        btn6.setBackgroundColor(Color.MAGENTA);
        ImageView btn7 = (ImageView) findViewById(R.id.imageview7);
        btn7.setBackgroundColor(Color.YELLOW);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);

        mScore = (TextView) findViewById(R.id.textview_score_value);
        mScore.setText("0");

        mTotalMoves = (TextView) findViewById(R.id.textview_total_move_value);
        mTotalMoves.setText("0");

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageview_reset:
                reset();
                break;
            case R.id.imageview1:
                mCount++;
                mGameworld.findCellChain(Color.RED);
                break;
            case R.id.imageview2:
                mCount++;
                mGameworld.findCellChain(Color.WHITE);
                break;
            case R.id.imageview3:
                mCount++;
                mGameworld.findCellChain(Color.GREEN);
                break;
            case R.id.imageview4:
                mCount++;
                mGameworld.findCellChain(Color.BLUE);
                break;
            case R.id.imageview5:
                mCount++;
                mGameworld.findCellChain(Color.CYAN);
                break;
            case R.id.imageview6:
                mCount++;
                mGameworld.findCellChain(Color.MAGENTA);
                break;
            case R.id.imageview7:
                mCount++;
                mGameworld.findCellChain(Color.YELLOW);
                break;
        }

        mTotalMoves.setText(""+mCount);

    }

    private void reset() {
        //true: reset the game else change the game
        mGameworld.onChangeGame(true);
        Toast.makeText(this, R.string.msg_reset_game, Toast.LENGTH_LONG).show();
        mCount = 0;
        mScore.setText("0");
    }


}
