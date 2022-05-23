package ud;

import ae.j;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import ce.j0;
import eb.k;
import gd.w;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.a;

public class e1 extends FrameLayoutFix {
    public boolean M;
    public k N;
    public float O;

    public e1(Context context) {
        super(context);
        setOnTouchListener((a) context);
    }

    public void A1(k kVar, float f10) {
        this.N = kVar;
        this.O = f10;
    }

    @Override
    public void draw(Canvas canvas) {
        if (((a) getContext()).z1()) {
            canvas.drawColor(j.k0());
        } else {
            super.draw(canvas);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.M) {
            return false;
        }
        a aVar = (a) getContext();
        if (z1() || aVar.t1(true)) {
            return true;
        }
        k0 S0 = aVar.S0();
        if (S0 != null && S0.Ff() && motionEvent.getAction() == 0) {
            if (w.G2()) {
                if (motionEvent.getX() < (getMeasuredWidth() - S0.Bf()) + S0.zf()) {
                    aVar.p2(motionEvent);
                    return true;
                }
            } else if (motionEvent.getX() >= S0.Bf()) {
                aVar.p2(motionEvent);
                return true;
            }
        }
        return aVar.p2(motionEvent) && motionEvent.getAction() != 0;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k kVar = this.N;
        if (kVar != null) {
            kVar.i(this.O);
            this.N = null;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        j0.r(getContext()).d0(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent) || motionEvent.getAction() == 0;
    }

    public boolean z1() {
        a E = j0.E();
        return (E == null || E.U0() == null || !E.U0().d()) ? false : true;
    }
}
