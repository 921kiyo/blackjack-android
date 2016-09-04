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
    Bitmap twoclubs;
    Bitmap threeclubs;
    Bitmap fourclubs;
    Bitmap fiveclubs;
    Bitmap sixclubs;
    Bitmap sevenclubs;
    Bitmap eightclubs;
    Bitmap nineclubs;
    Bitmap tenclubs;
    Bitmap jackclubs;
    Bitmap queenclubs;
    Bitmap kingclubs;
    Bitmap aceclubs;
    Bitmap twohearts;
    Bitmap threehearts;
    Bitmap fourhearts;
    Bitmap fivehearts;
    Bitmap sixhearts;
    Bitmap sevenhearts;
    Bitmap eighthearts;
    Bitmap ninehearts;
    Bitmap tenhearts;
    Bitmap jackhearts;
    Bitmap queenhearts;
    Bitmap kinghearts;
    Bitmap acehearts;
    Bitmap twospades;
    Bitmap threespades;
    Bitmap fourspades;
    Bitmap fivespades;
    Bitmap sixspades;
    Bitmap sevenspades;
    Bitmap eightspades;
    Bitmap ninespades;
    Bitmap tenspades;
    Bitmap jackspades;
    Bitmap queenspades;
    Bitmap kingspades;
    Bitmap acespades;
    Bitmap twodiamonds;
    Bitmap threediamonds;
    Bitmap fourdiamonds;
    Bitmap fivediamonds;
    Bitmap sixdiamonds;
    Bitmap sevendiamonds;
    Bitmap eightdiamonds;
    Bitmap ninediamonds;
    Bitmap tendiamonds;
    Bitmap jackdiamonds;
    Bitmap queendiamonds;
    Bitmap kingdiamonds;
    Bitmap acediamonds;






    public Panel(Context context, AttributeSet attrs){ // initialize a panel(constructor)
        super(context, attrs); //??
        getHolder().addCallback(this); // getHolder is a method of SurfaceView
        canvasthread = new CanvasThread(getHolder(),this);
        setFocusable(true); // enable view's focus event
        paint = new Paint();

        twoclubs = BitmapFactory.decodeResource(getResources(), R.drawable.two_of_clubs);
        twoclubs = Bitmap.createScaledBitmap(twoclubs,twoclubs.getWidth()/4,twoclubs.getHeight()/4,false); // adjusting scale
        threeclubs = BitmapFactory.decodeResource(getResources(), R.drawable.three_of_clubs);
        threeclubs = Bitmap.createScaledBitmap(threeclubs,threeclubs.getWidth()/4,threeclubs.getHeight()/4,false);
        fourclubs = BitmapFactory.decodeResource(getResources(), R.drawable.four_of_clubs);
        fourclubs = Bitmap.createScaledBitmap(fourclubs,fourclubs.getWidth()/4,fourclubs.getHeight()/4,false);
        fiveclubs = BitmapFactory.decodeResource(getResources(), R.drawable.five_of_clubs);
        fiveclubs = Bitmap.createScaledBitmap(fiveclubs,fiveclubs.getWidth()/4,fiveclubs.getHeight()/4,false);
        sixclubs = BitmapFactory.decodeResource(getResources(), R.drawable.six_of_clubs);
        sixclubs = Bitmap.createScaledBitmap(sixclubs,sixclubs.getWidth()/4,sixclubs.getHeight()/4,false);
        sevenclubs = BitmapFactory.decodeResource(getResources(), R.drawable.seven_of_clubs);
        sevenclubs = Bitmap.createScaledBitmap(sevenclubs,sevenclubs.getWidth()/4,sevenclubs.getHeight()/4,false);
        eightclubs = BitmapFactory.decodeResource(getResources(), R.drawable.eight_of_clubs);
        eightclubs = Bitmap.createScaledBitmap(eightclubs,eightclubs.getWidth()/4,eightclubs.getHeight()/4,false);
        nineclubs = BitmapFactory.decodeResource(getResources(), R.drawable.nine_of_clubs);
        nineclubs = Bitmap.createScaledBitmap(nineclubs,nineclubs.getWidth()/4,nineclubs.getHeight()/4,false);
        tenclubs = BitmapFactory.decodeResource(getResources(), R.drawable.ten_of_clubs);
        tenclubs = Bitmap.createScaledBitmap(tenclubs,tenclubs.getWidth()/4,tenclubs.getHeight()/4,false);
        jackclubs = BitmapFactory.decodeResource(getResources(), R.drawable.jack_of_clubs);
        jackclubs = Bitmap.createScaledBitmap(jackclubs,jackclubs.getWidth()/4,jackclubs.getHeight()/4,false);
        queenclubs = BitmapFactory.decodeResource(getResources(), R.drawable.queen_of_clubs);
        queenclubs = Bitmap.createScaledBitmap(queenclubs,queenclubs.getWidth()/4,queenclubs.getHeight()/4,false);
        kingclubs = BitmapFactory.decodeResource(getResources(), R.drawable.king_of_clubs);
        kingclubs = Bitmap.createScaledBitmap(kingclubs,kingclubs.getWidth()/4,kingclubs.getHeight()/4,false);
        aceclubs = BitmapFactory.decodeResource(getResources(), R.drawable.ace_of_clubs);
        aceclubs = Bitmap.createScaledBitmap(aceclubs,aceclubs.getWidth()/4,aceclubs.getHeight()/4,false);

        twohearts = BitmapFactory.decodeResource(getResources(), R.drawable.two_of_hearts);
        twohearts = Bitmap.createScaledBitmap(twohearts,twohearts.getWidth()/4,twohearts.getHeight()/4,false);
        threehearts = BitmapFactory.decodeResource(getResources(), R.drawable.three_of_hearts);
        threehearts = Bitmap.createScaledBitmap(threehearts,threehearts.getWidth()/4,threehearts.getHeight()/4,false);
        fourhearts = BitmapFactory.decodeResource(getResources(), R.drawable.four_of_hearts);
        fourhearts = Bitmap.createScaledBitmap(fourhearts,fourhearts.getWidth()/4,fourhearts.getHeight()/4,false);
        fivehearts = BitmapFactory.decodeResource(getResources(), R.drawable.five_of_hearts);
        fivehearts = Bitmap.createScaledBitmap(fivehearts,fivehearts.getWidth()/4,fivehearts.getHeight()/4,false);
        sixhearts = BitmapFactory.decodeResource(getResources(), R.drawable.six_of_hearts);
        sixhearts = Bitmap.createScaledBitmap(sixhearts,sixhearts.getWidth()/4,sixhearts.getHeight()/4,false);
        sevenhearts = BitmapFactory.decodeResource(getResources(), R.drawable.seven_of_hearts);
        sevenhearts = Bitmap.createScaledBitmap(sevenhearts,sevenhearts.getWidth()/4,sevenhearts.getHeight()/4,false);
        eighthearts = BitmapFactory.decodeResource(getResources(), R.drawable.eight_of_hearts);
        eighthearts = Bitmap.createScaledBitmap(eighthearts,eighthearts.getWidth()/4,eighthearts.getHeight()/4,false);
        ninehearts = BitmapFactory.decodeResource(getResources(), R.drawable.nine_of_hearts);
        ninehearts = Bitmap.createScaledBitmap(ninehearts,ninehearts.getWidth()/4,ninehearts.getHeight()/4,false);
        tenhearts = BitmapFactory.decodeResource(getResources(), R.drawable.ten_of_hearts);
        tenhearts = Bitmap.createScaledBitmap(tenhearts,tenhearts.getWidth()/4,tenhearts.getHeight()/4,false);
        jackhearts = BitmapFactory.decodeResource(getResources(), R.drawable.jack_of_hearts);
        jackhearts = Bitmap.createScaledBitmap(jackhearts,jackhearts.getWidth()/4,jackhearts.getHeight()/4,false);
        queenhearts = BitmapFactory.decodeResource(getResources(), R.drawable.queen_of_hearts);
        queenhearts = Bitmap.createScaledBitmap(queenhearts,queenhearts.getWidth()/4,queenhearts.getHeight()/4,false);
        kinghearts = BitmapFactory.decodeResource(getResources(), R.drawable.king_of_hearts);
        kinghearts = Bitmap.createScaledBitmap(kinghearts,kinghearts.getWidth()/4,kinghearts.getHeight()/4,false);
        acehearts = BitmapFactory.decodeResource(getResources(), R.drawable.ace_of_hearts);
        acehearts = Bitmap.createScaledBitmap(acehearts,acehearts.getWidth()/4,acehearts.getHeight()/4,false);

        twospades = BitmapFactory.decodeResource(getResources(), R.drawable.two_of_spades);
        twospades = Bitmap.createScaledBitmap(twospades,twospades.getWidth()/4,twospades.getHeight()/4,false); // adjusting scale
        threespades = BitmapFactory.decodeResource(getResources(), R.drawable.three_of_spades);
        threespades = Bitmap.createScaledBitmap(threespades,threespades.getWidth()/4,threespades.getHeight()/4,false);
        fourspades = BitmapFactory.decodeResource(getResources(), R.drawable.four_of_spades);
        fourspades = Bitmap.createScaledBitmap(fourspades,fourspades.getWidth()/4,fourspades.getHeight()/4,false);
        fivespades = BitmapFactory.decodeResource(getResources(), R.drawable.five_of_spades);
        fivespades = Bitmap.createScaledBitmap(fivespades,fivespades.getWidth()/4,fivespades.getHeight()/4,false);
        sixspades = BitmapFactory.decodeResource(getResources(), R.drawable.six_of_spades);
        sixspades = Bitmap.createScaledBitmap(sixspades,sixspades.getWidth()/4,sixspades.getHeight()/4,false);
        sevenspades = BitmapFactory.decodeResource(getResources(), R.drawable.seven_of_spades);
        sevenspades = Bitmap.createScaledBitmap(sevenspades,sevenspades.getWidth()/4,sevenspades.getHeight()/4,false);
        eightspades = BitmapFactory.decodeResource(getResources(), R.drawable.eight_of_spades);
        eightspades = Bitmap.createScaledBitmap(eightspades,eightspades.getWidth()/4,eightspades.getHeight()/4,false);
        ninespades = BitmapFactory.decodeResource(getResources(), R.drawable.nine_of_spades);
        ninespades = Bitmap.createScaledBitmap(ninespades,ninespades.getWidth()/4,ninespades.getHeight()/4,false);
        tenspades = BitmapFactory.decodeResource(getResources(), R.drawable.ten_of_spades);
        tenspades = Bitmap.createScaledBitmap(tenspades,tenspades.getWidth()/4,tenspades.getHeight()/4,false);
        jackspades = BitmapFactory.decodeResource(getResources(), R.drawable.jack_of_spades);
        jackspades = Bitmap.createScaledBitmap(jackspades,jackspades.getWidth()/4,jackspades.getHeight()/4,false);
        queenspades = BitmapFactory.decodeResource(getResources(), R.drawable.queen_of_spades);
        queenspades = Bitmap.createScaledBitmap(queenspades,queenspades.getWidth()/4,queenspades.getHeight()/4,false);
        kingspades = BitmapFactory.decodeResource(getResources(), R.drawable.king_of_spades);
        kingspades = Bitmap.createScaledBitmap(kingspades,kingspades.getWidth()/4,kingspades.getHeight()/4,false);
        acespades = BitmapFactory.decodeResource(getResources(), R.drawable.ace_of_spades);
        acespades = Bitmap.createScaledBitmap(acespades,acespades.getWidth()/4,acespades.getHeight()/4,false);

        twodiamonds = BitmapFactory.decodeResource(getResources(), R.drawable.two_of_diamonds);
        twodiamonds = Bitmap.createScaledBitmap(twodiamonds,twodiamonds.getWidth()/4,twodiamonds.getHeight()/4,false);
        threediamonds = BitmapFactory.decodeResource(getResources(), R.drawable.three_of_diamonds);
        threediamonds = Bitmap.createScaledBitmap(threediamonds,threediamonds.getWidth()/4,threediamonds.getHeight()/4,false);
        fourdiamonds = BitmapFactory.decodeResource(getResources(), R.drawable.four_of_diamonds);
        fourdiamonds = Bitmap.createScaledBitmap(fourdiamonds,fourdiamonds.getWidth()/4,fourdiamonds.getHeight()/4,false);
        fivediamonds = BitmapFactory.decodeResource(getResources(), R.drawable.five_of_diamonds);
        fivediamonds = Bitmap.createScaledBitmap(fivediamonds,fivediamonds.getWidth()/4,fivediamonds.getHeight()/4,false);
        sixdiamonds = BitmapFactory.decodeResource(getResources(), R.drawable.six_of_diamonds);
        sixdiamonds = Bitmap.createScaledBitmap(sixdiamonds,sixdiamonds.getWidth()/4,sixdiamonds.getHeight()/4,false);
        sevendiamonds = BitmapFactory.decodeResource(getResources(), R.drawable.seven_of_diamonds);
        sevendiamonds = Bitmap.createScaledBitmap(sevendiamonds,sevendiamonds.getWidth()/4,sevendiamonds.getHeight()/4,false);
        eightdiamonds = BitmapFactory.decodeResource(getResources(), R.drawable.eight_of_diamonds);
        eightdiamonds = Bitmap.createScaledBitmap(eightdiamonds,eightdiamonds.getWidth()/4,eightdiamonds.getHeight()/4,false);
        ninediamonds = BitmapFactory.decodeResource(getResources(), R.drawable.nine_of_diamonds);
        ninediamonds = Bitmap.createScaledBitmap(ninediamonds,ninediamonds.getWidth()/4,ninediamonds.getHeight()/4,false);
        tendiamonds = BitmapFactory.decodeResource(getResources(), R.drawable.ten_of_diamonds);
        tendiamonds = Bitmap.createScaledBitmap(tendiamonds,tendiamonds.getWidth()/4,tendiamonds.getHeight()/4,false);
        jackdiamonds = BitmapFactory.decodeResource(getResources(), R.drawable.jack_of_diamonds);
        jackdiamonds = Bitmap.createScaledBitmap(jackdiamonds,jackdiamonds.getWidth()/4,jackdiamonds.getHeight()/4,false);
        queendiamonds = BitmapFactory.decodeResource(getResources(), R.drawable.queen_of_diamonds);
        queendiamonds = Bitmap.createScaledBitmap(queendiamonds,queendiamonds.getWidth()/4,queendiamonds.getHeight()/4,false);
        kingdiamonds = BitmapFactory.decodeResource(getResources(), R.drawable.king_of_diamonds);
        kingdiamonds = Bitmap.createScaledBitmap(kingdiamonds,kingdiamonds.getWidth()/4,kingdiamonds.getHeight()/4,false);
        acediamonds = BitmapFactory.decodeResource(getResources(), R.drawable.ace_of_diamonds);
        acediamonds = Bitmap.createScaledBitmap(acediamonds,acediamonds.getWidth()/4,acediamonds.getHeight()/4,false);
    }

    public Panel(Context context){
        super(context);
        getHolder().addCallback(this);
        canvasthread = new CanvasThread(getHolder(), this);
        setFocusable(true);
    }

    @Override
    public void onDraw(Canvas canvas){ // this triggers animation(execute over and over again)!!!
        if (GetterSetter.card[GetterSetter.currentCard].suit == 0){

            if (GetterSetter.card[GetterSetter.currentCard].rank == 0){
                canvas.drawBitmap(twoclubs,0.0f,0.0f,null); // float left, float top
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 1){
                canvas.drawBitmap(threeclubs,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 2){
                canvas.drawBitmap(fourclubs,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 3){
                canvas.drawBitmap(fiveclubs,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 4){
                canvas.drawBitmap(sixclubs,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 5){
                canvas.drawBitmap(sevenclubs,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 6){
                canvas.drawBitmap(eightclubs,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 7){
                canvas.drawBitmap(nineclubs,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 8){
                canvas.drawBitmap(tenclubs,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 9){
                canvas.drawBitmap(jackclubs,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 10){
                canvas.drawBitmap(queenclubs,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 11){
                canvas.drawBitmap(kingclubs,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 12){
                canvas.drawBitmap(aceclubs,0.0f,0.0f,null);
            }
        }
        if (GetterSetter.card[GetterSetter.currentCard].suit == 1){
            if (GetterSetter.card[GetterSetter.currentCard].rank == 0){
                canvas.drawBitmap(twohearts,0.0f,0.0f,null); // float left, float top
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 1){
                canvas.drawBitmap(threehearts,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 2){
                canvas.drawBitmap(fourhearts,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 3){
                canvas.drawBitmap(fivehearts,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 4){
                canvas.drawBitmap(sixhearts,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 5){
                canvas.drawBitmap(sevenhearts,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 6){
                canvas.drawBitmap(eighthearts,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 7){
                canvas.drawBitmap(ninehearts,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 8){
                canvas.drawBitmap(tenhearts,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 9){
                canvas.drawBitmap(jackhearts,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 10){
                canvas.drawBitmap(queenhearts,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 11){
                canvas.drawBitmap(kinghearts,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 12){
                canvas.drawBitmap(acehearts,0.0f,0.0f,null);
            }

        }
        if (GetterSetter.card[GetterSetter.currentCard].suit == 2){
            if (GetterSetter.card[GetterSetter.currentCard].rank == 0){
                canvas.drawBitmap(twospades,0.0f,0.0f,null); // float left, float top
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 1){
                canvas.drawBitmap(threespades,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 2){
                canvas.drawBitmap(fourspades,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 3){
                canvas.drawBitmap(fivespades,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 4){
                canvas.drawBitmap(sixspades,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 5){
                canvas.drawBitmap(sevenspades,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 6){
                canvas.drawBitmap(eightspades,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 7){
                canvas.drawBitmap(ninespades,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 8){
                canvas.drawBitmap(tenspades,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 9){
                canvas.drawBitmap(jackspades,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 10){
                canvas.drawBitmap(queenspades,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 11){
                canvas.drawBitmap(kingspades,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 12){
                canvas.drawBitmap(acespades,0.0f,0.0f,null);
            }

        }
        if (GetterSetter.card[GetterSetter.currentCard].suit == 3){
            if (GetterSetter.card[GetterSetter.currentCard].rank == 0){
                canvas.drawBitmap(twodiamonds,0.0f,0.0f,null); // float left, float top
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 1){
                canvas.drawBitmap(threediamonds,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 2){
                canvas.drawBitmap(fourdiamonds,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 3){
                canvas.drawBitmap(fivediamonds,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 4){
                canvas.drawBitmap(sixdiamonds,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 5){
                canvas.drawBitmap(sevendiamonds,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 6){
                canvas.drawBitmap(eightdiamonds,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 7){
                canvas.drawBitmap(ninediamonds,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 8){
                canvas.drawBitmap(tendiamonds,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 9){
                canvas.drawBitmap(jackdiamonds,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 10){
                canvas.drawBitmap(queendiamonds,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 11){
                canvas.drawBitmap(kingdiamonds,0.0f,0.0f,null);
            }
            if (GetterSetter.card[GetterSetter.currentCard].rank == 12){
                canvas.drawBitmap(acediamonds,0.0f,0.0f,null);
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
