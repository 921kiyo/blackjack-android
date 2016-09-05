package com.example.user.blackjack;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
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
        canvas.drawColor(Color.BLACK);
//        if (GetterSetter.startHand == 0){
//            // do nothing unless you start
//
//        }
//        else{
            for (int x = 0; x <= 1; x++){ // draw first 2 cards for dealer
               if (x == 0 && GetterSetter.dealerHit < 3){
                   cardDraw.deal(canvas,501, (80 * x), -200);// draw back card on screen. -200 is xdistance
               }
                else{
                   cardDraw.deal(canvas,x, (80 * x), -200);
               }
                if (GetterSetter.bottunPressed == 1){ // only after hit button, execute addScore
                    addScore(x,false,true); // when hit stand, calculate score
                }
            }
            for (int n = 2; n <= 3; n++){ // draw first 2 cards for player
                cardDraw.deal(canvas,n, (80 * n), 300);// draw multiple cards on screen. 700 is xdistance

                if (GetterSetter.bottunPressed == 1){ // only after hit button, execute addScore
                    addScore(n,true,false); // when hit stand, calculate score
                }
            }

            for (int n = 4; n <=GetterSetter.hit; n++ ){ // after first 2 cards for player, calculate sum of score
                cardDraw.deal(canvas,n, (80 * n), 300);
                if (GetterSetter.bottunPressed == 1){
                    addScore(n,true,false);
                }
            }

            for (int x = (GetterSetter.hit + 1); x <= GetterSetter.dealerHit; x++){ /// when hit stand button,
                cardDraw.deal(canvas,x, (80 * x), -200);
                if (GetterSetter.bottunPressed == 1){
                    addScore(x,false,true);
                }
            }

            GetterSetter.bottunPressed = 0;
    }

    public void addScore(int n, boolean player,boolean dealer){
        if(n == 0 && GetterSetter.dealerHit < 3) {
            localScore = 0;
        }else{
            // need to deal with ace case here
            if(GetterSetter.card[n].rank >= 8){ /// if rank is 10, jack, queen and king, then give 10 as score
                localScore = 10;
            }
            else{
                localScore = GetterSetter.card[n].rank + 2; // I think I can refactor this later
            }
            if (player){
                GetterSetter.playerScore  = GetterSetter.playerScore + localScore;
            }
            if (dealer){
                GetterSetter.dealerScore  = GetterSetter.dealerScore + localScore;
            }
        }

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
