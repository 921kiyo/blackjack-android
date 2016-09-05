package com.example.user.blackjack;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

/**
 * Created by user on 04/09/2016.
 */
public class CardDraw {

    int x;
    int y;
    Bitmap back; // back card

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

    public CardDraw(Context context){
        back = BitmapFactory.decodeResource(context.getResources(), R.drawable.back);
        back = Bitmap.createScaledBitmap(back,back.getWidth()/4,back.getHeight()/4,false);

        twoclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.two_of_clubs);
        twoclubs = Bitmap.createScaledBitmap(twoclubs,twoclubs.getWidth()/4,twoclubs.getHeight()/4,false); // adjusting scale
        threeclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.three_of_clubs);
        threeclubs = Bitmap.createScaledBitmap(threeclubs,threeclubs.getWidth()/4,threeclubs.getHeight()/4,false);
        fourclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.four_of_clubs);
        fourclubs = Bitmap.createScaledBitmap(fourclubs,fourclubs.getWidth()/4,fourclubs.getHeight()/4,false);
        fiveclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.five_of_clubs);
        fiveclubs = Bitmap.createScaledBitmap(fiveclubs,fiveclubs.getWidth()/4,fiveclubs.getHeight()/4,false);
        sixclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.six_of_clubs);
        sixclubs = Bitmap.createScaledBitmap(sixclubs,sixclubs.getWidth()/4,sixclubs.getHeight()/4,false);
        sevenclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.seven_of_clubs);
        sevenclubs = Bitmap.createScaledBitmap(sevenclubs,sevenclubs.getWidth()/4,sevenclubs.getHeight()/4,false);
        eightclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.eight_of_clubs);
        eightclubs = Bitmap.createScaledBitmap(eightclubs,eightclubs.getWidth()/4,eightclubs.getHeight()/4,false);
        nineclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.nine_of_clubs);
        nineclubs = Bitmap.createScaledBitmap(nineclubs,nineclubs.getWidth()/4,nineclubs.getHeight()/4,false);
        tenclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.ten_of_clubs);
        tenclubs = Bitmap.createScaledBitmap(tenclubs,tenclubs.getWidth()/4,tenclubs.getHeight()/4,false);
        jackclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.jack_of_clubs);
        jackclubs = Bitmap.createScaledBitmap(jackclubs,jackclubs.getWidth()/4,jackclubs.getHeight()/4,false);
        queenclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.queen_of_clubs);
        queenclubs = Bitmap.createScaledBitmap(queenclubs,queenclubs.getWidth()/4,queenclubs.getHeight()/4,false);
        kingclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.king_of_clubs);
        kingclubs = Bitmap.createScaledBitmap(kingclubs,kingclubs.getWidth()/4,kingclubs.getHeight()/4,false);
        aceclubs = BitmapFactory.decodeResource(context.getResources(), R.drawable.ace_of_clubs);
        aceclubs = Bitmap.createScaledBitmap(aceclubs,aceclubs.getWidth()/4,aceclubs.getHeight()/4,false);

        twohearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.two_of_hearts);
        twohearts = Bitmap.createScaledBitmap(twohearts,twohearts.getWidth()/4,twohearts.getHeight()/4,false);
        threehearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.three_of_hearts);
        threehearts = Bitmap.createScaledBitmap(threehearts,threehearts.getWidth()/4,threehearts.getHeight()/4,false);
        fourhearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.four_of_hearts);
        fourhearts = Bitmap.createScaledBitmap(fourhearts,fourhearts.getWidth()/4,fourhearts.getHeight()/4,false);
        fivehearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.five_of_hearts);
        fivehearts = Bitmap.createScaledBitmap(fivehearts,fivehearts.getWidth()/4,fivehearts.getHeight()/4,false);
        sixhearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.six_of_hearts);
        sixhearts = Bitmap.createScaledBitmap(sixhearts,sixhearts.getWidth()/4,sixhearts.getHeight()/4,false);
        sevenhearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.seven_of_hearts);
        sevenhearts = Bitmap.createScaledBitmap(sevenhearts,sevenhearts.getWidth()/4,sevenhearts.getHeight()/4,false);
        eighthearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.eight_of_hearts);
        eighthearts = Bitmap.createScaledBitmap(eighthearts,eighthearts.getWidth()/4,eighthearts.getHeight()/4,false);
        ninehearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.nine_of_hearts);
        ninehearts = Bitmap.createScaledBitmap(ninehearts,ninehearts.getWidth()/4,ninehearts.getHeight()/4,false);
        tenhearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.ten_of_hearts);
        tenhearts = Bitmap.createScaledBitmap(tenhearts,tenhearts.getWidth()/4,tenhearts.getHeight()/4,false);
        jackhearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.jack_of_hearts);
        jackhearts = Bitmap.createScaledBitmap(jackhearts,jackhearts.getWidth()/4,jackhearts.getHeight()/4,false);
        queenhearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.queen_of_hearts);
        queenhearts = Bitmap.createScaledBitmap(queenhearts,queenhearts.getWidth()/4,queenhearts.getHeight()/4,false);
        kinghearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.king_of_hearts);
        kinghearts = Bitmap.createScaledBitmap(kinghearts,kinghearts.getWidth()/4,kinghearts.getHeight()/4,false);
        acehearts = BitmapFactory.decodeResource(context.getResources(), R.drawable.ace_of_hearts);
        acehearts = Bitmap.createScaledBitmap(acehearts,acehearts.getWidth()/4,acehearts.getHeight()/4,false);

        twospades = BitmapFactory.decodeResource(context.getResources(), R.drawable.two_of_spades);
        twospades = Bitmap.createScaledBitmap(twospades,twospades.getWidth()/4,twospades.getHeight()/4,false); // adjusting scale
        threespades = BitmapFactory.decodeResource(context.getResources(), R.drawable.three_of_spades);
        threespades = Bitmap.createScaledBitmap(threespades,threespades.getWidth()/4,threespades.getHeight()/4,false);
        fourspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.four_of_spades);
        fourspades = Bitmap.createScaledBitmap(fourspades,fourspades.getWidth()/4,fourspades.getHeight()/4,false);
        fivespades = BitmapFactory.decodeResource(context.getResources(), R.drawable.five_of_spades);
        fivespades = Bitmap.createScaledBitmap(fivespades,fivespades.getWidth()/4,fivespades.getHeight()/4,false);
        sixspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.six_of_spades);
        sixspades = Bitmap.createScaledBitmap(sixspades,sixspades.getWidth()/4,sixspades.getHeight()/4,false);
        sevenspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.seven_of_spades);
        sevenspades = Bitmap.createScaledBitmap(sevenspades,sevenspades.getWidth()/4,sevenspades.getHeight()/4,false);
        eightspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.eight_of_spades);
        eightspades = Bitmap.createScaledBitmap(eightspades,eightspades.getWidth()/4,eightspades.getHeight()/4,false);
        ninespades = BitmapFactory.decodeResource(context.getResources(), R.drawable.nine_of_spades);
        ninespades = Bitmap.createScaledBitmap(ninespades,ninespades.getWidth()/4,ninespades.getHeight()/4,false);
        tenspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.ten_of_spades);
        tenspades = Bitmap.createScaledBitmap(tenspades,tenspades.getWidth()/4,tenspades.getHeight()/4,false);
        jackspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.jack_of_spades);
        jackspades = Bitmap.createScaledBitmap(jackspades,jackspades.getWidth()/4,jackspades.getHeight()/4,false);
        queenspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.queen_of_spades);
        queenspades = Bitmap.createScaledBitmap(queenspades,queenspades.getWidth()/4,queenspades.getHeight()/4,false);
        kingspades = BitmapFactory.decodeResource(context.getResources(), R.drawable.king_of_spades);
        kingspades = Bitmap.createScaledBitmap(kingspades,kingspades.getWidth()/4,kingspades.getHeight()/4,false);
        acespades = BitmapFactory.decodeResource(context.getResources(), R.drawable.ace_of_spades);
        acespades = Bitmap.createScaledBitmap(acespades,acespades.getWidth()/4,acespades.getHeight()/4,false);

        twodiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.two_of_diamonds);
        twodiamonds = Bitmap.createScaledBitmap(twodiamonds,twodiamonds.getWidth()/4,twodiamonds.getHeight()/4,false);
        threediamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.three_of_diamonds);
        threediamonds = Bitmap.createScaledBitmap(threediamonds,threediamonds.getWidth()/4,threediamonds.getHeight()/4,false);
        fourdiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.four_of_diamonds);
        fourdiamonds = Bitmap.createScaledBitmap(fourdiamonds,fourdiamonds.getWidth()/4,fourdiamonds.getHeight()/4,false);
        fivediamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.five_of_diamonds);
        fivediamonds = Bitmap.createScaledBitmap(fivediamonds,fivediamonds.getWidth()/4,fivediamonds.getHeight()/4,false);
        sixdiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.six_of_diamonds);
        sixdiamonds = Bitmap.createScaledBitmap(sixdiamonds,sixdiamonds.getWidth()/4,sixdiamonds.getHeight()/4,false);
        sevendiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.seven_of_diamonds);
        sevendiamonds = Bitmap.createScaledBitmap(sevendiamonds,sevendiamonds.getWidth()/4,sevendiamonds.getHeight()/4,false);
        eightdiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.eight_of_diamonds);
        eightdiamonds = Bitmap.createScaledBitmap(eightdiamonds,eightdiamonds.getWidth()/4,eightdiamonds.getHeight()/4,false);
        ninediamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.nine_of_diamonds);
        ninediamonds = Bitmap.createScaledBitmap(ninediamonds,ninediamonds.getWidth()/4,ninediamonds.getHeight()/4,false);
        tendiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.ten_of_diamonds);
        tendiamonds = Bitmap.createScaledBitmap(tendiamonds,tendiamonds.getWidth()/4,tendiamonds.getHeight()/4,false);
        jackdiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.jack_of_diamonds);
        jackdiamonds = Bitmap.createScaledBitmap(jackdiamonds,jackdiamonds.getWidth()/4,jackdiamonds.getHeight()/4,false);
        queendiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.queen_of_diamonds);
        queendiamonds = Bitmap.createScaledBitmap(queendiamonds,queendiamonds.getWidth()/4,queendiamonds.getHeight()/4,false);
        kingdiamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.king_of_diamonds);
        kingdiamonds = Bitmap.createScaledBitmap(kingdiamonds,kingdiamonds.getWidth()/4,kingdiamonds.getHeight()/4,false);
        acediamonds = BitmapFactory.decodeResource(context.getResources(), R.drawable.ace_of_diamonds);
        acediamonds = Bitmap.createScaledBitmap(acediamonds,acediamonds.getWidth()/4,acediamonds.getHeight()/4,false);
    }

    public void getCanvasDimentions(Canvas canvas){
        x = canvas.getHeight();
        y = canvas.getWidth();
    }

    public void deal(Canvas canvas, int cardnum, int xdistance,int ydistance){
        getCanvasDimentions(canvas);
        if(cardnum == 501){ //setting back card, 501 is an extreme number out of 52 cards
            canvas.drawBitmap(back,(x/2) - 500 + xdistance, (y/2) + ydistance, null);
        }else{
            if (GetterSetter.card[cardnum].suit == 0){

                if (GetterSetter.card[cardnum].rank == 0){
                    canvas.drawBitmap(twoclubs,(x/2) - 500 + xdistance,(y/2) + ydistance, null); // float left, float top
                }
                if (GetterSetter.card[cardnum].rank == 1){
                    canvas.drawBitmap(threeclubs,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 2){
                    canvas.drawBitmap(fourclubs,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 3){
                    canvas.drawBitmap(fiveclubs,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 4){
                    canvas.drawBitmap(sixclubs,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 5){
                    canvas.drawBitmap(sevenclubs,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 6){
                    canvas.drawBitmap(eightclubs,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 7){
                    canvas.drawBitmap(nineclubs,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 8){
                    canvas.drawBitmap(tenclubs,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 9){
                    canvas.drawBitmap(jackclubs,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 10){
                    canvas.drawBitmap(queenclubs,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 11){
                    canvas.drawBitmap(kingclubs,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 12){
                    canvas.drawBitmap(aceclubs,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
            }
            if (GetterSetter.card[cardnum].suit == 1){
                if (GetterSetter.card[cardnum].rank == 0){
                    canvas.drawBitmap(twohearts,(x/2) - 500 + xdistance,(y/2) + ydistance, null); // float left, float top
                }
                if (GetterSetter.card[cardnum].rank == 1){
                    canvas.drawBitmap(threehearts,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 2){
                    canvas.drawBitmap(fourhearts,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 3){
                    canvas.drawBitmap(fivehearts,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 4){
                    canvas.drawBitmap(sixhearts,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 5){
                    canvas.drawBitmap(sevenhearts,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 6){
                    canvas.drawBitmap(eighthearts,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 7){
                    canvas.drawBitmap(ninehearts,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 8){
                    canvas.drawBitmap(tenhearts,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 9){
                    canvas.drawBitmap(jackhearts,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 10){
                    canvas.drawBitmap(queenhearts,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 11){
                    canvas.drawBitmap(kinghearts,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 12){
                    canvas.drawBitmap(acehearts,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }

            }
            if (GetterSetter.card[cardnum].suit == 2){
                if (GetterSetter.card[cardnum].rank == 0){
                    canvas.drawBitmap(twospades,(x/2) - 500 + xdistance,(y/2) + ydistance, null); // float left, float top
                }
                if (GetterSetter.card[cardnum].rank == 1){
                    canvas.drawBitmap(threespades,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 2){
                    canvas.drawBitmap(fourspades,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 3){
                    canvas.drawBitmap(fivespades,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 4){
                    canvas.drawBitmap(sixspades,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 5){
                    canvas.drawBitmap(sevenspades,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 6){
                    canvas.drawBitmap(eightspades,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 7){
                    canvas.drawBitmap(ninespades,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 8){
                    canvas.drawBitmap(tenspades,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 9){
                    canvas.drawBitmap(jackspades,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 10){
                    canvas.drawBitmap(queenspades,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 11){
                    canvas.drawBitmap(kingspades,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 12){
                    canvas.drawBitmap(acespades,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }

            }
            if (GetterSetter.card[cardnum].suit == 3){
                if (GetterSetter.card[cardnum].rank == 0){
                    canvas.drawBitmap(twodiamonds,(x/2) - 500 + xdistance,(y/2) + ydistance, null); // float left, float top
                }
                if (GetterSetter.card[cardnum].rank == 1){
                    canvas.drawBitmap(threediamonds,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 2){
                    canvas.drawBitmap(fourdiamonds,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 3){
                    canvas.drawBitmap(fivediamonds,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 4){
                    canvas.drawBitmap(sixdiamonds,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 5){
                    canvas.drawBitmap(sevendiamonds,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 6){
                    canvas.drawBitmap(eightdiamonds,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 7){
                    canvas.drawBitmap(ninediamonds,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 8){
                    canvas.drawBitmap(tendiamonds,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 9){
                    canvas.drawBitmap(jackdiamonds,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 10){
                    canvas.drawBitmap(queendiamonds,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 11){
                    canvas.drawBitmap(kingdiamonds,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
                if (GetterSetter.card[cardnum].rank == 12){
                    canvas.drawBitmap(acediamonds,(x/2) - 500 + xdistance,(y/2) + ydistance, null);
                }
            }

        }


    }




}