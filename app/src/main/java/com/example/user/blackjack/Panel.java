package com.example.user.blackjack;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView; // view that handles animation

/**
 * Created by user on 02/09/2016.
 */
public class Panel extends SurfaceView implements SurfaceHolder.Callback {
    // When used with a SurfaceView, the Surface being held is only available
    // between calls to surfaceCreated(SurfaceHolder) and surfaceDestroyed(SurfaceHolder).
    // The Callback is set with SurfaceHolder.addCallback method.
    Paint paint;
    private CanvasThread canvasthread; // this holds bitmap object
    CardDraw cardDraw;
    int localScore;


    public Panel(Context context, AttributeSet attrs){ // initialize a panel(constructor)
        super(context, attrs); //??
        getHolder().addCallback(this); // getHolder is a method of SurfaceView
        canvasthread = new CanvasThread(getHolder(),this);
        setFocusable(true); // enable view's focus event
        paint = new Paint();
        cardDraw = new CardDraw(context);

    }

    public Panel(Context context){
        super(context);
        getHolder().addCallback(this);
        canvasthread = new CanvasThread(getHolder(), this);
        setFocusable(true);
    }

    @Override
    public void onDraw(Canvas canvas){ // this triggers animation(execute over and over again)!!!
        for (int n = 0; n <= GetterSetter.hit; n++){
            cardDraw.deal(canvas,n, (80 * n), 700);// draw multiple cards on screen. 700 is ydistance
            if (GetterSetter.bottunPressed == 1){
                addScore(n);
            }
        }
        GetterSetter.bottunPressed = 0;

    }

    public void addScore(int n ){
        if(GetterSetter.card[n].rank >= 8){
            localScore = 10;
        }
        else{
            localScore = GetterSetter.card[n].rank + 2; // I think I can refactor this later
        }

        GetterSetter.playerScore  = GetterSetter.playerScore + localScore;

    }

    public void update(){

    }

    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height){

    }

    public void surfaceCreated(SurfaceHolder holder){
        canvasthread.setRunning(true); // as long as true, this redraws canvasthread forever
        canvasthread.start();
    }

    public void surfaceDestroyed(SurfaceHolder holder){
        boolean retry = true;
        canvasthread.setRunning(false); // this will stop redrawing
        while(retry){
            try { // try blocks to wrap things that may fail to execute properly
                canvasthread.join();//??
                retry = false;
            }
            catch(InterruptedException exception){ //??

            }
        }

    }


}
