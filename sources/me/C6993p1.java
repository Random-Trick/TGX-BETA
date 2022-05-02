package me;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import be.C1359b;
import p139jb.AbstractC5911c;
import p156kd.C6257p;

public class C6993p1 extends View implements AbstractC5911c, AbstractC6828a {
    public final C6257p f22179a = new C6257p(this, 0);
    public boolean f22180b;
    public Bitmap f22181c;

    public C6993p1(Context context) {
        super(context);
    }

    @Override
    public void mo4501a3() {
        this.f22179a.mo20249Z();
    }

    @Override
    public void mo8229b() {
        this.f22179a.mo20247b();
    }

    @Override
    public void mo8225f() {
        this.f22179a.mo20245f();
    }

    public C6257p getReceiver() {
        return this.f22179a;
    }

    @Override
    public void onDraw(Canvas canvas) {
        this.f22179a.draw(canvas);
        C1359b.m37496w(this, canvas, this.f22181c);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f22179a.mo20256K0(getPaddingLeft(), getPaddingTop(), measuredWidth - getPaddingRight(), measuredHeight - getPaddingBottom());
        if (this.f22180b) {
            this.f22179a.mo20259D0(Math.min(measuredWidth, measuredHeight) / 2);
        }
    }

    public void setCircular(boolean z) {
        this.f22180b = z;
    }

    public void setOverlayBitmap(Bitmap bitmap) {
        if (this.f22181c != bitmap) {
            this.f22181c = bitmap;
            invalidate();
        }
    }
}
