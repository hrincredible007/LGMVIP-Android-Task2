package com.example.task2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

public class ResultDialog extends LCOFaceDetection.Graphic{

    private int Rect_color= Color.RED;
    private float stroke_width = 4.0f;
    private Paint rectpaint;
    private LCOFaceDetection LCOFaceDetection;
    private Rect rect;

    public ResultDialog(LCOFaceDetection LCOFaceDetection, Rect rect){
        super(LCOFaceDetection);
        rectpaint = new Paint();
        rectpaint.setColor(Rect_color);
        rectpaint.setStyle(Paint.Style.STROKE);
        rectpaint.setStrokeWidth(stroke_width);
        this.LCOFaceDetection = LCOFaceDetection;
        this.rect = rect;
        postInvalidate();


    }

    @Override
    public void draw(Canvas canvas) {
        RectF rectposition = new RectF(rect);
        rectposition.left = translateX(rectposition.left);
        rectposition.right=translateX(rectposition.right);
        rectposition.bottom=translateY(rectposition.bottom);
        rectposition.top=translateY(rectposition.top);
        canvas.drawRect(rectposition,rectpaint);

    }
}
