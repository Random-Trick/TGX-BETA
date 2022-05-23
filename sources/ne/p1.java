package ne;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import ce.b;
import kb.c;
import ld.p;

public class p1 extends View implements c, a {
    public final p f18314a = new p(this, 0);
    public boolean f18315b;
    public Bitmap f18316c;

    public p1(Context context) {
        super(context);
    }

    @Override
    public void Q2() {
        this.f18314a.b0();
    }

    @Override
    public void b() {
        this.f18314a.b();
    }

    @Override
    public void e() {
        this.f18314a.e();
    }

    public p getReceiver() {
        return this.f18314a;
    }

    @Override
    public void onDraw(Canvas canvas) {
        this.f18314a.draw(canvas);
        b.w(this, canvas, this.f18316c);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f18314a.K0(getPaddingLeft(), getPaddingTop(), measuredWidth - getPaddingRight(), measuredHeight - getPaddingBottom());
        if (this.f18315b) {
            this.f18314a.E0(Math.min(measuredWidth, measuredHeight) / 2);
        }
    }

    public void setCircular(boolean z10) {
        this.f18315b = z10;
    }

    public void setOverlayBitmap(Bitmap bitmap) {
        if (this.f18316c != bitmap) {
            this.f18316c = bitmap;
            invalidate();
        }
    }
}
