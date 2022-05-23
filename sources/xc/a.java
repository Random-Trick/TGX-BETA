package xc;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import gb.c;
import hd.e3;
import ld.p;
import md.j;
import md.m;
import ne.i;
import org.thunderdog.challegram.Log;

public class a extends i {
    public e3 f26219k0;
    public m f26220l0 = new m(this);
    public p f26221m0 = new p(this, 0);
    public c f26222n0;

    public a(Context context) {
        super(context, null);
    }

    private int getDesiredHeight() {
        return a0.i(118.0f);
    }

    public void C0(c.a aVar) {
        this.f26222n0 = new c(aVar);
    }

    public void b() {
        this.f26221m0.b();
        this.f26220l0.b();
    }

    public void e() {
        this.f26221m0.e();
        this.f26220l0.e();
    }

    public e3 getGif() {
        return this.f26219k0;
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f26220l0.e0()) {
            if (this.f26221m0.e0()) {
                this.f26221m0.O(canvas);
            }
            this.f26221m0.draw(canvas);
        }
        this.f26220l0.draw(canvas);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getDesiredHeight(), Log.TAG_TDLIB_OPTIONS));
        this.f26221m0.K0(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.f26220l0.K0(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        c cVar = this.f26222n0;
        return cVar != null ? cVar.e(this, motionEvent) : super.onTouchEvent(motionEvent);
    }

    public void setGif(e3 e3Var) {
        e3 e3Var2 = this.f26219k0;
        if (e3Var2 == null || e3Var == null || e3Var2.c() != e3Var.c()) {
            this.f26219k0 = e3Var;
            j jVar = null;
            this.f26221m0.G(e3Var == null ? null : e3Var.d());
            m mVar = this.f26220l0;
            if (e3Var != null) {
                jVar = e3Var.b();
            }
            mVar.r(jVar);
        }
        if (getDesiredHeight() != getMeasuredHeight()) {
            requestLayout();
        }
    }
}
