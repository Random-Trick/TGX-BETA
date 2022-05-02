package td;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import be.C1379j0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import p051db.C3950k;
import p082fd.C4403w;
import p364zd.C11524j;

public class C9179e1 extends FrameLayoutFix {
    public boolean f29634M;
    public C3950k f29635N;
    public float f29636O;

    public C9179e1(Context context) {
        super(context);
        setOnTouchListener((AbstractView$OnTouchListenerC7889a) context);
    }

    public boolean m10018C1() {
        AbstractView$OnTouchListenerC7889a E = C1379j0.m37366E();
        return (E == null || E.m14545R0() == null || !E.m14545R0().m9639d()) ? false : true;
    }

    public void m10017D1(C3950k kVar, float f) {
        this.f29635N = kVar;
        this.f29636O = f;
    }

    @Override
    public void draw(Canvas canvas) {
        if (((AbstractView$OnTouchListenerC7889a) getContext()).m14414y1()) {
            canvas.drawColor(C11524j.m167m0());
        } else {
            super.draw(canvas);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f29634M) {
            return false;
        }
        AbstractView$OnTouchListenerC7889a aVar = (AbstractView$OnTouchListenerC7889a) getContext();
        if (m10018C1() || aVar.m14443s1(true)) {
            return true;
        }
        View$OnClickListenerC9218k0 P0 = aVar.m14553P0();
        if (P0 != null && P0.m9958Ff() && motionEvent.getAction() == 0) {
            if (C4403w.m27984G2()) {
                if (motionEvent.getX() < (getMeasuredWidth() - P0.m9962Bf()) + P0.m9886zf()) {
                    aVar.m14457o2(motionEvent);
                    return true;
                }
            } else if (motionEvent.getX() >= P0.m9962Bf()) {
                aVar.m14457o2(motionEvent);
                return true;
            }
        }
        return aVar.m14457o2(motionEvent) && motionEvent.getAction() != 0;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C3950k kVar = this.f29635N;
        if (kVar != null) {
            kVar.m29544i(this.f29636O);
            this.f29635N = null;
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C1379j0.m37307r(getContext()).m14507c0(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent) || motionEvent.getAction() == 0;
    }
}
