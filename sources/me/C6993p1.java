package me;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import be.C1359b;
import p139jb.AbstractC5911c;
import p156kd.C6257p;

public class C6993p1 extends View implements AbstractC5911c, AbstractC6828a {
    public final C6257p f22182a = new C6257p(this, 0);
    public boolean f22183b;
    public Bitmap f22184c;

    public C6993p1(Context context) {
        super(context);
    }

    @Override
    public void mo4501a3() {
        this.f22182a.mo20250Z();
    }

    @Override
    public void mo8229b() {
        this.f22182a.mo20248b();
    }

    @Override
    public void mo8225f() {
        this.f22182a.mo20246f();
    }

    public C6257p getReceiver() {
        return this.f22182a;
    }

    @Override
    public void onDraw(Canvas canvas) {
        this.f22182a.draw(canvas);
        C1359b.m37499w(this, canvas, this.f22184c);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f22182a.mo20257K0(getPaddingLeft(), getPaddingTop(), measuredWidth - getPaddingRight(), measuredHeight - getPaddingBottom());
        if (this.f22183b) {
            this.f22182a.mo20260D0(Math.min(measuredWidth, measuredHeight) / 2);
        }
    }

    public void setCircular(boolean z) {
        this.f22183b = z;
    }

    public void setOverlayBitmap(Bitmap bitmap) {
        if (this.f22184c != bitmap) {
            this.f22184c = bitmap;
            invalidate();
        }
    }
}
