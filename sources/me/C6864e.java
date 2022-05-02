package me;

import ad.GestureDetector$OnGestureListenerC0256a;
import android.content.Context;
import android.view.MotionEvent;
import be.C1357a0;
import be.C1379j0;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import td.AbstractC9323v4;

public class C6864e extends C7031t2 implements GestureDetector$OnGestureListenerC0256a.AbstractC0257a {
    public final GestureDetector$OnGestureListenerC0256a f21576c0;
    public int f21577d0;
    public AbstractC9323v4.C9334k f21578e0;
    public float f21579f0;
    public float f21580g0;
    public float f21581h0;
    public float f21582i0;
    public boolean f21583j0;

    public C6864e(Context context) {
        super(context);
        this.f21576c0 = new GestureDetector$OnGestureListenerC0256a(context, this);
    }

    public void m18733Y1(AbstractC9323v4.C9334k kVar, boolean z) {
        if (this.f21577d0 == 0) {
            this.f21577d0 = 1;
            if (z) {
                this.f21578e0 = kVar;
            }
            this.f21583j0 = z;
            this.f21581h0 = this.f21579f0;
            this.f21582i0 = this.f21580g0;
        }
    }

    @Override
    public boolean mo7205o7(float f, float f2) {
        if (this.f21577d0 != 2 || Math.abs(f2) < C1357a0.m37544i(10.0f)) {
            return false;
        }
        C1379j0.m37310r(getContext()).m14601E0(f2 < 0.0f, true);
        this.f21577d0 = 0;
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: me.C6864e.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f21577d0 != 2) {
            return super.onTouchEvent(motionEvent);
        }
        this.f21576c0.m41997a(motionEvent);
        if (this.f21577d0 != 2) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            C1379j0.m37310r(getContext()).m14606D0();
            this.f21577d0 = 0;
        } else if (action == 2) {
            float y = motionEvent.getY();
            float max = Math.max(0.0f, Math.min(1.0f, (this.f21583j0 ? this.f21582i0 - y : y - this.f21582i0) / getMeasuredHeight()));
            AbstractView$OnTouchListenerC7889a r = C1379j0.m37310r(getContext());
            if (!this.f21583j0) {
                max = 1.0f - max;
            }
            r.m14530U2(max);
        } else if (action == 3) {
            C1379j0.m37310r(getContext()).m14601E0(false, false);
            this.f21577d0 = 0;
        }
        return true;
    }
}
