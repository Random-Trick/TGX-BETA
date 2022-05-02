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
    public C4623e3 f32663k0;
    public RunnableC6507m f32664l0 = new RunnableC6507m(this);
    public C6257p f32665m0 = new C6257p(this, 0);
    public C4336c f32666n0;

    public C10036a(Context context) {
        super(context, null);
    }

    private int getDesiredHeight() {
        return C1357a0.m37544i(118.0f);
    }

    public void m6171B0(C4336c.AbstractC4337a aVar) {
        this.f32666n0 = new C4336c(aVar);
    }

    public void m6170b() {
        this.f32665m0.mo20248b();
        this.f32664l0.mo20248b();
    }

    public void m6169f() {
        this.f32665m0.mo20246f();
        this.f32664l0.mo20246f();
    }

    public C4623e3 getGif() {
        return this.f32663k0;
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f32664l0.mo20247c0()) {
            if (this.f32665m0.mo20247c0()) {
                this.f32665m0.mo20256N(canvas);
            }
            this.f32665m0.draw(canvas);
        }
        this.f32664l0.draw(canvas);
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getDesiredHeight(), Log.TAG_TDLIB_OPTIONS));
        this.f32665m0.mo20257K0(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.f32664l0.mo20257K0(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C4336c cVar = this.f32666n0;
        return cVar != null ? cVar.m28248e(this, motionEvent) : super.onTouchEvent(motionEvent);
    }

    public void setGif(C4623e3 e3Var) {
        C4623e3 e3Var2 = this.f32663k0;
        if (e3Var2 == null || e3Var == null || e3Var2.m26840c() != e3Var.m26840c()) {
            this.f32663k0 = e3Var;
            C6503j jVar = null;
            this.f32665m0.m20820G(e3Var == null ? null : e3Var.m26839d());
            RunnableC6507m mVar = this.f32664l0;
            if (e3Var != null) {
                jVar = e3Var.m26841b();
            }
            mVar.m20232r(jVar);
        }
        if (getDesiredHeight() != getMeasuredHeight()) {
            requestLayout();
        }
    }
}
