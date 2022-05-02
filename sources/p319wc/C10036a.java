package p319wc;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import gd.C4623e3;
import me.View$OnClickListenerC6902i;
import org.thunderdog.challegram.Log;
import p080fb.C4336c;
import p156kd.C6257p;
import p168ld.C6503j;
import p168ld.RunnableC6507m;

public class C10036a extends View$OnClickListenerC6902i {
    public C4623e3 f32660k0;
    public RunnableC6507m f32661l0 = new RunnableC6507m(this);
    public C6257p f32662m0 = new C6257p(this, 0);
    public C4336c f32663n0;

    public C10036a(Context context) {
        super(context, null);
    }

    private int getDesiredHeight() {
        return C1357a0.m37541i(118.0f);
    }

    public void m6171B0(C4336c.AbstractC4337a aVar) {
        this.f32663n0 = new C4336c(aVar);
    }

    public void m6170b() {
        this.f32662m0.mo20247b();
        this.f32661l0.mo20247b();
    }

    public void m6169f() {
        this.f32662m0.mo20245f();
        this.f32661l0.mo20245f();
    }

    public C4623e3 getGif() {
        return this.f32660k0;
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f32661l0.mo20246c0()) {
            if (this.f32662m0.mo20246c0()) {
                this.f32662m0.mo20255N(canvas);
            }
            this.f32662m0.draw(canvas);
        }
        this.f32661l0.draw(canvas);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getDesiredHeight(), Log.TAG_TDLIB_OPTIONS));
        this.f32662m0.mo20256K0(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.f32661l0.mo20256K0(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C4336c cVar = this.f32663n0;
        return cVar != null ? cVar.m28246e(this, motionEvent) : super.onTouchEvent(motionEvent);
    }

    public void setGif(C4623e3 e3Var) {
        C4623e3 e3Var2 = this.f32660k0;
        if (e3Var2 == null || e3Var == null || e3Var2.m26838c() != e3Var.m26838c()) {
            this.f32660k0 = e3Var;
            C6503j jVar = null;
            this.f32662m0.m20819G(e3Var == null ? null : e3Var.m26837d());
            RunnableC6507m mVar = this.f32661l0;
            if (e3Var != null) {
                jVar = e3Var.m26839b();
            }
            mVar.m20231r(jVar);
        }
        if (getDesiredHeight() != getMeasuredHeight()) {
            requestLayout();
        }
    }
}
