package de;

import android.content.Context;
import android.view.MotionEvent;
import be.C1379j0;
import ge.C4868i;
import nc.C7389v0;
import p038ce.View$OnClickListenerC2971rh;
import p291uc.C9585k0;
import td.AbstractC9323v4;

public class C4023a extends C9585k0 {
    public final View$OnClickListenerC2971rh f13495a;
    public boolean f13496b;
    public AbstractC9323v4.C9334k f13497c;

    public C4023a(Context context, View$OnClickListenerC2971rh rhVar) {
        super(context);
        this.f13495a = rhVar;
        this.f13496b = C7389v0.m16670W(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (C4868i.m24727c2().m24609r0() != 2 && onTouchEvent && motionEvent.getAction() == 0) {
            if (!this.f13496b) {
                this.f13496b = C7389v0.m16670W(getContext());
            }
            if (this.f13496b && this.f13495a.m32740Gi()) {
                if (this.f13497c == null) {
                    this.f13497c = new AbstractC9323v4.C9334k();
                }
                C1379j0.m37310r(getContext()).m14472k2(this.f13497c, true);
            }
        }
        return onTouchEvent;
    }

    public void setCameraOpenOptions(AbstractC9323v4.C9334k kVar) {
        this.f13497c = kVar;
    }
}
