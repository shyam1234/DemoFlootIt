package com.malviya.demoflootit;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

/**
 * Created by 23508 on 11/7/2016.
 */

public class MainActivity extends Activity implements View.OnClickListener {

    private ImageView mReset;
    private GameWorld mGameworld;

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
        ImageView btn1 = (ImageView)findViewById(R.id.imageview1);
        btn1.setBackgroundColor(Color.RED);
        ImageView btn2 = (ImageView)findViewById(R.id.imageview2);
        btn2.setBackgroundColor(Color.WHITE);
        ImageView btn3 = (ImageView)findViewById(R.id.imageview3);
        btn3.setBackgroundColor(Color.GREEN);
        ImageView btn4 = (ImageView)findViewById(R.id.imageview4);
        btn4.setBackgroundColor(Color.BLUE);
        ImageView btn5 = (ImageView)findViewById(R.id.imageview5);
        btn5.setBackgroundColor(Color.CYAN);
        ImageView btn6 = (ImageView)findViewById(R.id.imageview6);
        btn6.setBackgroundColor(Color.MAGENTA);
        ImageView btn7 = (ImageView)findViewById(R.id.imageview7);
        btn7.setBackgroundColor(Color.YELLOW);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageview_reset:
                mGameworld.onReset();
                break;
            case R.id.imageview1:
                mGameworld.findCellChainAndFloodWithColor(Color.RED);
                break;
            case R.id.imageview2:
                mGameworld.findCellChainAndFloodWithColor(Color.WHITE);
                break;
            case R.id.imageview3:
                mGameworld.findCellChainAndFloodWithColor(Color.GREEN);
                break;
            case R.id.imageview4:
                mGameworld.findCellChainAndFloodWithColor(Color.BLUE);
                break;
            case R.id.imageview5:
                mGameworld.findCellChainAndFloodWithColor(Color.CYAN);
                break;
            case R.id.imageview6:
                mGameworld.findCellChainAndFloodWithColor(Color.MAGENTA);
                break;
            case R.id.imageview7:
                mGameworld.findCellChainAndFloodWithColor(Color.YELLOW);
                break;
        }
    }
}
