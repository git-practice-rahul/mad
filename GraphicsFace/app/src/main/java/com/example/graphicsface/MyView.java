package com.example.graphicsface;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class MyView extends View {
    public MyView(Context context){
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int face_radius = 400;
        int width = getWidth();
        int height = getHeight();
        int x = width/2, y= height/2;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        paint.setColor(Color.parseColor("black"));
        canvas.drawCircle(x,y, face_radius, paint);

        int eye_radius = 50;
        canvas.drawCircle(x - 200, y - 150, eye_radius, paint);
        canvas.drawCircle(x + 200, y - 150, eye_radius, paint);

        canvas.drawRect(new Rect(x-200, y+150, x+200, y+200), paint);
//        canvas.restore();
    }
}
