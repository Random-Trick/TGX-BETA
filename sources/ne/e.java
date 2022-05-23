package ne;

import android.content.Context;
import android.view.MotionEvent;
import bd.a;
import ce.a0;
import ce.j0;
import ud.v4;

public class e extends t2 implements a.AbstractC0060a {
    public final a f17953c0;
    public int f17954d0;
    public v4.k f17955e0;
    public float f17956f0;
    public float f17957g0;
    public float f17958h0;
    public float f17959i0;
    public boolean f17960j0;

    public e(Context context) {
        super(context);
        this.f17953c0 = new a(context, this);
    }

    public void W1(v4.k kVar, boolean z10) {
        if (this.f17954d0 == 0) {
            this.f17954d0 = 1;
            if (z10) {
                this.f17955e0 = kVar;
            }
            this.f17960j0 = z10;
            this.f17958h0 = this.f17956f0;
            this.f17959i0 = this.f17957g0;
        }
    }

    @Override
    public boolean n7(float f10, float f11) {
        if (this.f17954d0 != 2 || Math.abs(f11) < a0.i(10.0f)) {
            return false;
        }
        j0.r(getContext()).H0(f11 < 0.0f, true);
        this.f17954d0 = 0;
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: ne.e.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f17954d0 != 2) {
            return super.onTouchEvent(motionEvent);
        }
        this.f17953c0.a(motionEvent);
        if (this.f17954d0 != 2) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            j0.r(getContext()).G0();
            this.f17954d0 = 0;
        } else if (action == 2) {
            float y10 = motionEvent.getY();
            float max = Math.max(0.0f, Math.min(1.0f, (this.f17960j0 ? this.f17959i0 - y10 : y10 - this.f17959i0) / getMeasuredHeight()));
            org.thunderdog.challegram.a r10 = j0.r(getContext());
            if (!this.f17960j0) {
                max = 1.0f - max;
            }
            r10.U2(max);
        } else if (action == 3) {
            j0.r(getContext()).H0(false, false);
            this.f17954d0 = 0;
        }
        return true;
    }
}
